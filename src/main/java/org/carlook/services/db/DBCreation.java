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
        tableCreation.add(DBTables.CREATE_TAB_USER);
        tableCreation.add(DBTables.CREATE_TAB_KUNDE);
        tableCreation.add(DBTables.CREATE_TAB_VERTRIEBLER);
        tableCreation.add(DBTables.CREATE_TAB_FAHRZEUG);
        tableCreation.add(DBTables.CREATE_TAB_KUNDE_RESERVIERRT_FAHRZEUG);
        return tableCreation;
    }

    private static List<String> loadTableNames() {
        List<String> tableNames = new ArrayList<>();
        tableNames.add(DBTables.TAB_USER);
        tableNames.add(DBTables.TAB_KUNDE);
        tableNames.add(DBTables.TAB_VERTRIEBLER);
        tableNames.add(DBTables.TAB_FAHRZEUG);
        tableNames.add(DBTables.TAB_KUNDE_RESERVIERRT_FAHRZEUG);
        return tableNames;
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
