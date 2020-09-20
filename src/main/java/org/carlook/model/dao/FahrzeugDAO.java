package org.carlook.model.dao;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.RegisterFailedException;
import org.carlook.factories.Factories;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kennzeichen;
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

/**
 * Fahrzeug Zugriffklasse fuer die DB
 */
public class FahrzeugDAO extends AbstractDAO {

    private static FahrzeugDAO fahrzeugDAO;
    private String table = DBTables.Fahrzeug.TAB;

    /**
     * Default-Konstruktor
     */
    private FahrzeugDAO() {

    }

    /**
     * Realisierung des Singleton Patterns
     */
    public static synchronized FahrzeugDAO getInstance() {
        if (fahrzeugDAO == null) fahrzeugDAO = new FahrzeugDAO();
        return fahrzeugDAO;
    }

    /**
     * liefert eine Liste aller in der DB vorhanden Fahrzeugen
     * @throws DatabaseException
     */
    public List<Fahrzeug> getAllFahrzeuge() throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        List<Fahrzeug> fahrzeugeList = new ArrayList<>();
        String sqlBefehl = "Select * FROM " + table;
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        try {
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Fahrzeug fahrzeug = new Fahrzeug()
                        .setHersteller(resultSet.getString(DBTables.Fahrzeug.COL_HERSTELLER))
                        .setModell(resultSet.getString(DBTables.Fahrzeug.COL_MODELL))
                        .setBeschreibung(resultSet.getString(DBTables.Fahrzeug.COL_BESCHREIBUNG))
                        .setKraftstoff(resultSet.getString(DBTables.Fahrzeug.COL_KRAFTSTOFF))
                        .setLocation(resultSet.getString(DBTables.Fahrzeug.COL_LOCATION))
                        .setFahrgestellnummer(resultSet.getString(DBTables.Fahrzeug.COL_FAHRGESTELLNUMMER))
                        .setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(resultSet.getString(DBTables.Fahrzeug.COL_KENNZEICHEN)))
                        .setBaujahr(resultSet.getInt(DBTables.Fahrzeug.COL_BAUJAHR))
                        .setVertriebler(resultSet.getInt(DBTables.Fahrzeug.COL_VERTRIEBLER));

                fahrzeugeList.add(fahrzeug);
            }
        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (Exception exc) {
                Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        }
        return fahrzeugeList;
    }

    /**
     * fuegt ein Fahrzeug in der DB hinzu
     * @param fahrzeug
     * @param vertriebler
     * @throws DatabaseException
     * @throws RegisterFailedException
     */
    public void register(Fahrzeug fahrzeug, Vertriebler vertriebler) throws DatabaseException, RegisterFailedException {
        if (fahrzeug == null || vertriebler == null) {
            String err;
            if (fahrzeug == null)
                err = DBTables.Fahrzeug.NAME + "DTO == null";
            else
                err = DBTables.Vertriebler.NAME + "DTO == null";
            throw new RegisterFailedException().setReason(err);
        }

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
            preparedStatement.setInt(9, vertriebler.getVertriebnummer());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }

    /**
     * gibt eine Liste von zufaellige bereits in der DB vorhandenes Kennzeichen zurueck.
     * Die Anzahl der Kennzeichen ist zur Abhängig zu der Gesamthzahl der Fahzeuge
     * Methode fuer Beispieldaten
     * @throws DatabaseException
     */
    public List<String> getKennzeichenRandRows() throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String sqlBefehl;

        sqlBefehl = "SELECT " + DBTables.Fahrzeug.COL_KENNZEICHEN + " FROM " + table + " ORDER BY RANDOM() LIMIT (SELECT COUNT(*) FROM " + table + ")*0.60;";
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

    /**
     * liefert ein Fahrzeug in Abhaengikeit zum Vetriebler
     * @param vertriebler
     * @throws DatabaseException
     */
    public List<Fahrzeug> getFahrzeugeByVertriebler(Vertriebler vertriebler) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        List<Fahrzeug> fahrzeugeList = new ArrayList<>();

        String sqlBefehl = "Select * FROM " + table + " WHERE " + table + "." + DBTables.Fahrzeug.COL_KENNZEICHEN + " = " + DBTables.Fahrzeug.TAB + "." + DBTables.Fahrzeug.COL_KENNZEICHEN + " AND " + table + "." + DBTables.Vertriebler.COL_VERTRIEBLERNUMMER + " = ?;";
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;

        try {
            statement.setInt(1,vertriebler.getVertriebnummer());
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Fahrzeug fahrzeug = Factories.createNewFahrzeug()
                        .setHersteller(resultSet.getString(DBTables.Fahrzeug.COL_HERSTELLER))
                        .setModell(resultSet.getString(DBTables.Fahrzeug.COL_MODELL))
                        .setBeschreibung(resultSet.getString(DBTables.Fahrzeug.COL_BESCHREIBUNG))
                        .setKraftstoff(resultSet.getString(DBTables.Fahrzeug.COL_KRAFTSTOFF))
                        .setLocation(resultSet.getString(DBTables.Fahrzeug.COL_LOCATION))
                        .setFahrgestellnummer(resultSet.getString(DBTables.Fahrzeug.COL_FAHRGESTELLNUMMER))
                        .setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(resultSet.getString(DBTables.Fahrzeug.COL_KENNZEICHEN)))
                        .setBaujahr(resultSet.getInt(DBTables.Fahrzeug.COL_BAUJAHR))
                        .setVertriebler(vertriebler.getVertriebnummer());


                fahrzeugeList.add(fahrzeug);
            }
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
        return fahrzeugeList;
    }

    /**
     * entfernt ein Fahzeug aus der DB
     * @param fahrzeug
     * @param vertrieblernummer
     * @throws DatabaseException
     */
    public void deleteFahrzeugByKeys(Fahrzeug fahrzeug, int vertrieblernummer) throws DatabaseException{
        JDBCConnection.getInstance().openConnection();

        String sqlBefehl = "DELETE FROM " + table + " WHERE " + DBTables.Fahrzeug.COL_KENNZEICHEN + " = ? AND " + DBTables.Fahrzeug.COL_FAHRGESTELLNUMMER + " = ? AND " + DBTables.Fahrzeug.COL_VERTRIEBLER + " = ?;";
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        try {
            statement.setString(1,fahrzeug.getKennzeichen());
            statement.setString(2,fahrzeug.getFahrgestellnummer());
            statement.setInt(3,vertrieblernummer);

            statement.execute();
        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }

    /**
     * checkt, ob Kennzeichen bereits vorhanden
     * @param kennzeichen
     * @throws DatabaseException
     */
    public boolean checkKennzeichenAvailability(Kennzeichen kennzeichen) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();

        String sqlBefehl = "SELECT FROM " + table + " WHERE " + DBTables.Fahrzeug.COL_KENNZEICHEN + " = ?";
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        boolean res = false;

        try {
            statement.setString(1, kennzeichen.getKennzeichen());
            resultSet = statement.executeQuery();
            res = resultSet.next();
        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return res;
    }

    /**
     * checkt, ob Fahrgestellnummer bereits in der DB vorhanden ist
     * @param fahrgestellnummer
     * @throws DatabaseException
     */
    public boolean checkFahrgestellnummerAvailability(String fahrgestellnummer) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();

        String sqlBefehl = "SELECT FROM " + table + " WHERE " + DBTables.Fahrzeug.COL_FAHRGESTELLNUMMER + " = ?";
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        boolean res = false;

        try {
            statement.setString(1, fahrgestellnummer);
            resultSet = statement.executeQuery();
            res = resultSet.next();
        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return res;
    }

}
