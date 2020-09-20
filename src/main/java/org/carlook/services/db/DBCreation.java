package org.carlook.services.db;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.services.util.DBTables;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Klasse zur Erstellung der Datenbank Tabellen
 */
public class DBCreation {

    /**
     * erstellt die Tabellen in der DB
     * @throws DatabaseException
     */
    public static void executeCreate() throws DatabaseException {
        JDBCConnection jdbc = JDBCConnection.getInstance();
        jdbc.openConnection();
        String sqlBefehl = DBTables.CREATE_ALL_TABLES;
        PreparedStatement statement = jdbc.getPreparedStatement(sqlBefehl);
        try {
            statement.execute();
            Logger.getLogger(DBCreation.class.getName()).log(Level.INFO, "Tabellen in Schema \"" + DBTables.SCHEMA + "\" erfolgreich hinzugefuegt!\n");
        } catch (SQLException e) {
            Logger.getLogger(DBCreation.class.getName()).log(Level.SEVERE, sqlBefehl, e);
            return;
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }

    /**
     * entfernt alle Tabellen in der DB
     * @throws DatabaseException
     */
    public static void dropAllTables() throws DatabaseException {
        JDBCConnection jdbc = JDBCConnection.getInstance();
        jdbc.openConnection();
        String sqlBefehl = "DROP SCHEMA IF EXISTS " + DBTables.SCHEMA + " CASCADE;\n" +
                "CREATE SCHEMA IF NOT EXISTS " + DBTables.SCHEMA + ";";
        PreparedStatement statement = jdbc.getPreparedStatement(sqlBefehl);
        try {
            statement.execute();
            Logger.getLogger(DBCreation.class.getName()).log(Level.INFO, "Tabellen in Schema \"" + DBTables.SCHEMA + "\" erfolgreich entfernt!\n");
        } catch (SQLException e) {
            Logger.getLogger(DBCreation.class.getName()).log(Level.SEVERE, sqlBefehl, e);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }

    /**
     * aktualisiert die DB Tabellen
     */
    public static void refreshTables() {
        try {
            dropAllTables();
            executeCreate();
        } catch (DatabaseException e) {
            Logger.getLogger(DBCreation.class.getName()).log(Level.INFO, null, e);
            return;
        }
    }

}
