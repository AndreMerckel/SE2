package org.carlook.services.db;


import org.carlook.controller.exception.DatabaseException;
import org.carlook.services.util.ZugangsdatenDB;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Schnittstelle Datenbank Verbindung
 */
public class JDBCConnection {

    private String zugangsdaten = ZugangsdatenDB.ZUGANG_DB;


    private static JDBCConnection connection = null;
    private String url = "jdbc:postgresql://dumbo.inf.h-brs.de/" + zugangsdaten;
    private Connection conn;

    private String login = zugangsdaten;
    private String password = zugangsdaten;

    /**
     * Singleton-Pattern
     * @return
     * @throws DatabaseException
     */
    public static JDBCConnection getInstance() throws DatabaseException {
        if(connection == null){
            connection = new JDBCConnection();
        }
        return connection;
    }

    /**
     * Defaul-Konstruktor
     * @throws DatabaseException
     */
    private JDBCConnection() throws DatabaseException{
        this.initConnection();
    }

    /**
     * Initialisierung der Verbindung
     * @throws DatabaseException
     */
    public void initConnection() throws DatabaseException {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());

            this.openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Herstellung der DB-Verbingung
     * @throws DatabaseException
     */
    public void openConnection() throws DatabaseException {
        try {

            Properties props = new Properties();
            props.setProperty("user", zugangsdaten);
            props.setProperty("password", zugangsdaten);

            this.conn = DriverManager.getConnection(this.url, props);

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            throw new DatabaseException("Fehler bei Zugriff auf die DB! Sichere Verbindung vorhanden?");
        }
    }

    /**
     * liefert ein Statement
     * @return
     * @throws DatabaseException
     */
    public Statement getStatement() throws DatabaseException {
        try {
            if(this.conn.isClosed()){
                this.openConnection();
            }
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            throw new DatabaseException("Fehler bei Zugriff auf die DB! Sichere Verbindung vorhanden?");
        }
        try {
            return this.conn.createStatement();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * leifert ein Prepared-Statement
     * @param sql
     * @return
     * @throws DatabaseException
     */
    public PreparedStatement getPreparedStatement(String sql) throws DatabaseException{
        try {
            if(this.conn.isClosed()){
                this.openConnection();
            }
            return this.conn.prepareStatement(sql);
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    /**
     * trennt die Datenbank-Verbindung
     */
    public void closeConnection(){
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
