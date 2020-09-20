package org.carlook.model.dao;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.services.db.JDBCConnection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * DB-Logger
 */
public class LogDAO extends AbstractDAO {

    private static LogDAO logDAO;
    private String table = "log.last_db_carlook_refresh";

    /**
     * Default-Konstruktor
     */
    private LogDAO() {}

    /**
     * Realisierung Singleton-Pattern
     * @return
     */
    public static synchronized LogDAO getInstance() {
        if (logDAO == null)
            logDAO = new LogDAO();
        return logDAO;
    }

    /**
     * fuegt einen Zeitstempel in der DB hinzu, wann der letzte DB refresh erfolgreich war
     * @throws DatabaseException
     */
    public void insertLog() throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String sqlBefehl = "INSERT INTO " + table + " VALUES (current_timestamp);";
        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        try {
            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            Logger.getLogger(LogDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }
}
