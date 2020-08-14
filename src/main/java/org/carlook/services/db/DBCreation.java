package org.carlook.services.db;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.services.util.DBTables;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBCreation {

    private static List<String> tableNames = new ArrayList<>();

    private static List<String> loadTablesToList() {
        List<String> tableCreation = new ArrayList<>();
        tableCreation.add(DBTables.User.CREATE_TAB);
        tableCreation.add(DBTables.Kunde.CREATE_TAB);
        tableCreation.add(DBTables.Vertriebler.CREATE_TAB);
        tableCreation.add(DBTables.Fahrzeug.CREATE_TAB);
        tableCreation.add(DBTables.KundeReserviertFahrzeug.CREATE_TAB);
        return tableCreation;
    }

    public static void executeCreate() throws DatabaseException {
        List<String> listCreation = loadTablesToList();
        JDBCConnection jdbc = JDBCConnection.getInstance();
        jdbc.openConnection();
        String sqlBefehl = "";
        for (String tmp : listCreation) {
            sqlBefehl += tmp;
        }
        PreparedStatement statement = jdbc.getPreparedStatement(sqlBefehl);
        try {
            statement.execute();
            System.out.println("Tabellen in Schema \"" + DBTables.SCHEMA + "\" erfolgreich hinzugefuegt!");
        } catch (SQLException e) {
            Logger.getLogger(DBCreation.class.getName()).log(Level.SEVERE, null, e);
            System.out.println(DBTables.CREATE_ALL_TABLES);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }

    public static void dropAllTables() throws DatabaseException {
        //List<String> tableNames = loadTableNames();
        JDBCConnection jdbc = JDBCConnection.getInstance();
        jdbc.openConnection();
        String sqlBefehl = "DROP SCHEMA " + DBTables.SCHEMA + " CASCADE; CREATE SCHEMA " + DBTables.SCHEMA + ";";
        /*for (String tmp : tableNames) {
            sqlBefehl += "DROP TABLE " + tmp + " CASCADE;\n";
        }

         */
        PreparedStatement statement = jdbc.getPreparedStatement(sqlBefehl);
        try {
            statement.execute();
            System.out.println("Tabellen in Schema \"" + DBTables.SCHEMA + "\" erfolgreich entfernt!");
        } catch (SQLException e) {
            Logger.getLogger(DBCreation.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }

    public static void refreshTables() {
        try {
            dropAllTables();
            executeCreate();
        } catch (DatabaseException e) {
            Logger.getLogger(DBCreation.class.getName()).log(Level.SEVERE, null, e);
        }
    }

}
