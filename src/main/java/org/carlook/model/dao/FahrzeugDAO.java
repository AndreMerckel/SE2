package org.carlook.model.dao;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.objects.dto.FahrzeugDTO;
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

public class FahrzeugDAO extends AbstractDAO {

    private static FahrzeugDAO fahrzeugDAO;
    private String table = DBTables.Fahrzeug.TAB;

    private FahrzeugDAO() {}

    public static synchronized FahrzeugDAO getInstance() {

        if (fahrzeugDAO == null) fahrzeugDAO = new FahrzeugDAO();
        return fahrzeugDAO;
    }

    public void register(Fahrzeug fahrzeug) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String sqlBefehl;

        sqlBefehl = "INSERT INTO " + table + " ("+DBTables.Fahrzeug.COL_MARKE+","+DBTables.Fahrzeug.COL_BESCHREIBUNG+","+DBTables.Fahrzeug.COL_KRAFTSTOFF+","+DBTables.Fahrzeug.COL_BAUJAHR+","+DBTables.Fahrzeug.COL_MODELL+","+DBTables.Fahrzeug.COL_FAHRGESTELLNUMMER+","+DBTables.Fahrzeug.COL_KENNZEICHEN+","+DBTables.Fahrzeug.COL_VERTRIEBLER+","+DBTables.Fahrzeug.COL_LOCATION+") VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        try {
            preparedStatement.setString(1, fahrzeug.getMarke());
            preparedStatement.setString(2, fahrzeug.getBeschreibung());
            preparedStatement.setString(3, fahrzeug.getKraftstoff());
            preparedStatement.setInt(4, fahrzeug.getBaujahr());
            preparedStatement.setString(5, fahrzeug.getModell());
            preparedStatement.setString(6, fahrzeug.getFahrgestellnummer());
            preparedStatement.setString(7, fahrzeug.getKennzeichen());
            preparedStatement.setInt(8, fahrzeug.getVertriebler());
            preparedStatement.setString(9, fahrzeug.getLocation());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }

    public List<Fahrzeug> getFahrzeugeCreatedByVertriebler(Vertriebler vertriebler) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        List<Fahrzeug> fahrzeugeList = new ArrayList<>();

        String sqlBefehl = "Select * FROM " + table + " WHERE "+DBTables.Fahrzeug.COL_VERTRIEBLER+" = ?;";
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;

        try {
            statement.setInt(1,vertriebler.getVertriebnummer());
            resultSet = statement.executeQuery();
        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                    resultSet.close(); } catch (Exception exc) {
                Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        }
        return fetchFahrzeuge(fahrzeugeList, resultSet);
    }

    public List<Fahrzeug> getFahrzeugByValue(FahrzeugDTO fahrzeugDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        List<Fahrzeug> fahrzeugeList = new ArrayList<>();

        boolean hasWHERE = false;

        String marke, modell, kraftstoff, location;
        int baujahr, columnCounter;

        marke = fahrzeugDTO.getMarke().trim();
        modell = fahrzeugDTO.getModell().trim();
        kraftstoff = fahrzeugDTO.getKraftstoff().trim();
        location = fahrzeugDTO.getLocation().trim();
        //TODO - baujahr ist 0 falls keine Eingabe erfolgt ist
        baujahr = fahrzeugDTO.getBaujahr();

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
                sqlBefehl += DBTables.Fahrzeug.COL_MARKE + " = ?";
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
        return fetchFahrzeuge(fahrzeugeList, resultSet);
    }



    public List<Fahrzeug> fetchFahrzeuge(List<Fahrzeug> fahrzeugList, ResultSet resultSet) throws DatabaseException {
        try {
            while (resultSet.next()) {
                Fahrzeug fahrzeug = new Fahrzeug()
                        .setMarke(resultSet.getString("marke"))
                        .setModell(resultSet.getString("modell"))
                        .setBeschreibung(resultSet.getString("beschreibung"))
                        .setKraftstoff(resultSet.getString("kraftstoff"))
                        .setLocation(resultSet.getString("location"))
                        .setFahrgestellnummer(resultSet.getString("fahrgestellnummer"))
                        .setKennzeichen(resultSet.getString("kennzeichen"))
                        .setVertriebler(resultSet.getInt("vertriebler"))
                        .setBaujahr(resultSet.getInt("baujahr"));

                fahrzeugList.add(fahrzeug);
            }

        } catch (SQLException e) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                resultSet.close(); } catch (Exception exc) {
                Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        }
        return fahrzeugList;
    }

}
