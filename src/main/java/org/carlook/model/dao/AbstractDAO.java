package org.carlook.model.dao;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.services.db.JDBCConnection;

import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * AbstractDAO zur Lieferung eines Statements oder PrepaaredStatements
 */
public abstract class AbstractDAO {


    @Deprecated
    /**
     * gibt einen Statetement zurueck
     * ACHTUNG: aufgrund von SQL-Injection PreparedStatements benutzen!
     * @deprecated
     * @see PreparedStatement
     */
    protected Statement getStatement() {
        Statement statement = null;
        try {
            statement = JDBCConnection.getInstance().getStatement();
        } catch (DatabaseException ex) {
            Logger.getLogger(AbstractDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return statement;
    }

    /**
     * gibt einen PreparedStatement zurueck
     * @param sql
     */
    protected PreparedStatement getPreparedStatement(String sql){
        PreparedStatement statement = null;
        try {
            statement = JDBCConnection.getInstance().getPreparedStatement(sql);
        } catch (DatabaseException ex) {
            Logger.getLogger(AbstractDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return statement;
    }

}