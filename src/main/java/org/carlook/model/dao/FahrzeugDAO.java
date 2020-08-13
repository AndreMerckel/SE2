package org.carlook.model.dao;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.objects.dto.FahrzeugDTO;
import org.carlook.model.objects.dto.VertrieblerDTO;
import org.carlook.model.objects.entities.Fahrzeug;
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
    private String table = DBTables.TAB_FAHRZEUG;

    private FahrzeugDAO() {}

    public static synchronized FahrzeugDAO getInstance() {

        if (fahrzeugDAO == null) fahrzeugDAO = new FahrzeugDAO();
        return fahrzeugDAO;
    }

    public void register(FahrzeugDTO fahrzeugDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String sqlBefehl;

        sqlBefehl = "INSERT INTO " + table + " (marke,beschreibung,kraftstoff,baujahr,modell,fahrgestellnummer,kennzeichen,vertriebler,location) VALUES (?,?,?,?,?,?,?,?,?)";
        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        try {
            preparedStatement.setString(1, fahrzeugDTO.getMarke());
            preparedStatement.setString(2, fahrzeugDTO.getBeschreibung());
            preparedStatement.setString(3, fahrzeugDTO.getKraftstoff());
            preparedStatement.setInt(4, fahrzeugDTO.getBaujahr());
            preparedStatement.setString(5, fahrzeugDTO.getModell());
            preparedStatement.setString(6, fahrzeugDTO.getFahrgestellnummer());
            preparedStatement.setString(7, fahrzeugDTO.getKennzeichen());
            preparedStatement.setInt(8, fahrzeugDTO.getVertrieblerDTO().getVertriebnummer());
            preparedStatement.setString(9, fahrzeugDTO.getLocation());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }

    public List<Fahrzeug> getFahrzeugeCreatedByVertriebler(VertrieblerDTO vertrieblerDTO) throws DatabaseException {

        JDBCConnection.getInstance().openConnection();

        List<Fahrzeug> fahrzeugeList = new ArrayList<>();

        String sqlBefehl = "Select * FROM " + table + " WHERE vertriebler = ?;";
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;

        try {
            statement.setInt(1,vertrieblerDTO.getVertriebnummer());
            resultSet = statement.executeQuery();
        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, throwables);
        }
        //String sqlBefehl = "Select * FROM " + view + ";";

        assert resultSet != null;
        return utilFetcher(fahrzeugeList, resultSet);

    }

    public List<Fahrzeug> utilFetcher(List<Fahrzeug> FahrzeugList, ResultSet resultSet) throws DatabaseException {
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

                FahrzeugList.add(fahrzeug);
            }

        } catch (SQLException e) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try { if (resultSet != null) resultSet.close(); } catch (Exception exc) {
                Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        }
        return FahrzeugList;
    }
}
