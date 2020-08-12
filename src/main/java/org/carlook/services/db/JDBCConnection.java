package org.carlook.services.db;


import org.carlook.controller.exception.DatabaseException;
import org.carlook.services.util.ZugangsdatenDB;

import java.sql.*;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

public class JDBCConnection {

    private String zugangsdaten = ZugangsdatenDB.ZUGANG_DB;



    private static JDBCConnection connection = null;
    private String url = "jdbc:postgresql://dumbo.inf.h-brs.de/" + zugangsdaten;
    private Connection conn;

    private String login = zugangsdaten;
    private String password = zugangsdaten;

    public static JDBCConnection getInstance() throws DatabaseException {
        if(connection == null){
            connection = new JDBCConnection();
        }
        return connection;
    }

    private JDBCConnection() throws DatabaseException{
        this.initConnection();
    }

    public void initConnection() throws DatabaseException {
        try {
            DriverManager.registerDriver(new org.postgresql.Driver());

            this.openConnection();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void openConnection() throws DatabaseException {
        try {

            Properties props = new Properties();
            props.setProperty("user", "mmuel72s");
            props.setProperty("password", "mmuel72s");

            this.conn = DriverManager.getConnection(this.url, props);

        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            throw new DatabaseException("Fehler bei Zugriff auf die DB! Sichere Verbindung vorhanden?");
        }
    }

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

    public void closeConnection(){
        try {
            this.conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
