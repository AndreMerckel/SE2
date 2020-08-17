package org.carlook.model.dao;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.RegisterFailedException;
import org.carlook.factories.DTOFactory;
import org.carlook.model.objects.dto.FahrzeugDTO;
import org.carlook.model.objects.dto.FahrzeugSearchDTO;
import org.carlook.model.objects.dto.VertrieblerDTO;
import org.carlook.model.objects.dto.VertrieblerErstelltFahrzeugDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Vertriebler;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.util.DBTables;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FahrzeugDAO extends AbstractDAO implements FetchFahrzeugInterface {

    private static FahrzeugDAO fahrzeugDAO;
    private String table = DBTables.Fahrzeug.TAB;

    private FahrzeugDAO() {}

    public static synchronized FahrzeugDAO getInstance() {

        if (fahrzeugDAO == null) fahrzeugDAO = new FahrzeugDAO();
        return fahrzeugDAO;
    }

    public void register(Fahrzeug fahrzeug, VertrieblerDTO vertrieblerDTO) throws DatabaseException, RegisterFailedException {
        if (fahrzeug == null || vertrieblerDTO == null) {
            String err;
            if (fahrzeug == null)
                err = DBTables.Fahrzeug.NAME + "DTO == null";
            else
                err = DBTables.Vertriebler.NAME + "DTO == null";
            throw new RegisterFailedException().setReason(err);
        }


        FahrzeugDTO fahrzeugDTO = DTOFactory.createNewFahrzeugDTO().setKennzeichen(fahrzeug.getKennzeichen());

        VertrieblerErstelltFahrzeugDTO vertrieblerErstelltFahrzeugDTO = DTOFactory.createNewVertrieblerErstelltFahrzeugDTO().setFahrzeugDTO(fahrzeugDTO).setVertrieblerDTO(vertrieblerDTO);

        JDBCConnection.getInstance().openConnection();
        String sqlBefehl;

        sqlBefehl = "INSERT INTO " + table + " ("+DBTables.Fahrzeug.COL_HERSTELLER +","+DBTables.Fahrzeug.COL_BESCHREIBUNG+","+DBTables.Fahrzeug.COL_KRAFTSTOFF+","+DBTables.Fahrzeug.COL_BAUJAHR+","+DBTables.Fahrzeug.COL_MODELL+","+DBTables.Fahrzeug.COL_FAHRGESTELLNUMMER+","+DBTables.Fahrzeug.COL_KENNZEICHEN+","+DBTables.Fahrzeug.COL_LOCATION+"," + DBTables.Vertriebler.COL_VERTRIEBLERNUMMER + ") VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        try {

            preparedStatement.setString(1, fahrzeug.getHersteller());
            preparedStatement.setString(2, fahrzeug.getBeschreibung());
            preparedStatement.setString(3, fahrzeug.getKraftstoff());
            preparedStatement.setInt(4, fahrzeug.getBaujahr());
            preparedStatement.setString(5, fahrzeug.getModell());
            preparedStatement.setString(6, fahrzeug.getFahrgestellnummer());
            preparedStatement.setString(7, fahrzeug.getKennzeichen());
            preparedStatement.setString(8, fahrzeug.getLocation());
            preparedStatement.setInt(9, vertrieblerDTO.getVertriebnummer());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }

    public List<Fahrzeug> getFahrzeugByValue(FahrzeugSearchDTO fahrzeugSearchDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();

        boolean hasWHERE = false;

        String marke, modell, kraftstoff, location;
        int baujahr, columnCounter;

        marke = fahrzeugSearchDTO.getMarke().trim();
        modell = fahrzeugSearchDTO.getModell().trim();
        kraftstoff = fahrzeugSearchDTO.getKraftstoff().trim();
        location = fahrzeugSearchDTO.getLocation().trim();
        //TODO - baujahr ist 0 falls keine Eingabe erfolgt ist
        baujahr = fahrzeugSearchDTO.getBaujahr();

        columnCounter = 0;

        String sqlBefehl = "SELECT * FROM " + table;

        //TODO - Eingabe Textfeld -> "" falls Eingabe leer

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        try {


            if (!marke.isEmpty()) { //Marke
                if (!hasWHERE) {
                    hasWHERE = true;
                    sqlBefehl += "WHERE ";
                } else {
                    sqlBefehl += "AND ";
                }
                sqlBefehl += DBTables.Fahrzeug.COL_HERSTELLER + " = ?";
                preparedStatement.setString(++columnCounter, marke);
            }


            if (!modell.isEmpty()) { //Modell
                if (!hasWHERE) {
                    hasWHERE = true;
                    sqlBefehl += "WHERE ";
                } else {
                    sqlBefehl += "AND ";
                }

                sqlBefehl += DBTables.Fahrzeug.COL_MODELL + " = ?";
                preparedStatement.setString(++columnCounter, modell);
            }

            if (!kraftstoff.isEmpty()) { //Kraftstoff
                if (!hasWHERE) {
                    hasWHERE = true;
                    sqlBefehl += "WHERE ";
                } else {
                    sqlBefehl += "AND ";
                }

                sqlBefehl += DBTables.Fahrzeug.COL_KRAFTSTOFF + " = ?";
                preparedStatement.setString(++columnCounter, kraftstoff);
            }

            if (!location.isEmpty()) { //Location
                if (!hasWHERE) {
                    hasWHERE = true;
                    sqlBefehl += "WHERE ";
                } else {
                    sqlBefehl += "AND ";
                }

                sqlBefehl += DBTables.Fahrzeug.COL_LOCATION + " = ?";
                preparedStatement.setString(++columnCounter, location);
            }

            if (baujahr == 0) { //Baujahr
                if (!hasWHERE) {
                    hasWHERE = true;
                    sqlBefehl += "WHERE ";
                } else {
                    sqlBefehl += "AND ";
                }

                sqlBefehl += DBTables.Fahrzeug.COL_BAUJAHR + " = ?";
                preparedStatement.setInt(++columnCounter, baujahr);
            }

            sqlBefehl += ";";

            resultSet = preparedStatement.executeQuery();

        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (Exception exc) {
                Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        }
        return fetchFahrzeuge(resultSet);
    }

    public List<String> getKennzeichenRandRows() throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String sqlBefehl;

        sqlBefehl = "SELECT " + DBTables.Fahrzeug.COL_KENNZEICHEN + " FROM " + table + " ORDER BY RANDOM() LIMIT (SELECT COUNT(*) FROM " + table + ")*0.1;";
        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        List<String> list = new ArrayList<>();
        try {
            ResultSet resultSet = preparedStatement.executeQuery();

            assert resultSet != null;

            while (resultSet.next()) {
                list.add(resultSet.getString(DBTables.Fahrzeug.COL_KENNZEICHEN));
            }
        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return list;
    }

    public List<Fahrzeug> getFahrzeugeByVertriebler(VertrieblerDTO vertrieblerDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        List<Fahrzeug> fahrzeugeList = new ArrayList<>();

        String sqlBefehl = "Select * FROM " + table + ", " + DBTables.Fahrzeug.TAB + " WHERE " + table + "." + DBTables.Fahrzeug.COL_KENNZEICHEN + " = " + DBTables.Fahrzeug.TAB + "." + DBTables.Fahrzeug.COL_KENNZEICHEN + " AND " + table + "." + DBTables.Vertriebler.COL_VERTRIEBLERNUMMER + " = ?;";
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;

        try {
            statement.setInt(1,vertrieblerDTO.getVertriebnummer());
            resultSet = statement.executeQuery();
        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                    resultSet.close(); } catch (Exception exc) {
                Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        }
        return fetchFahrzeuge(resultSet);
    }

}
