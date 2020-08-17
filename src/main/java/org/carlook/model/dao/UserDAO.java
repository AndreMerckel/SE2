package org.carlook.model.dao;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.util.DBTables;
import org.carlook.services.util.StatusUser;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO extends AbstractDAO {

    private static UserDAO userDAO;
    private String table = DBTables.User.TAB;

    private UserDAO() {}

    public static synchronized UserDAO getInstance() {

        if (userDAO == null) userDAO = new UserDAO();

        return userDAO;
    }

    public UserDTO register(UserDTO userDTO, StatusUser statusUser) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String email, sqlBefehl;

        email = userDTO.getEmail();
        sqlBefehl = "INSERT INTO " + table + " (" + DBTables.User.COL_EMAIL + "," + DBTables.User.COL_PASSWORD + ","+DBTables.User.COL_VORNAME + "," + DBTables.User.COL_NACHNAME + ") " +
                "VALUES (?,?,?,?); " +
                "INSERT INTO ";
        if (statusUser == StatusUser.KUNDE) {
            sqlBefehl += DBTables.Kunde.TAB;
        } else {
            sqlBefehl += DBTables.Vertriebler.TAB;
        }
        sqlBefehl += " (" + DBTables.User.COL_EMAIL + ") VALUES (?)";

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        try {
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,userDTO.getPassword());
            preparedStatement.setString(3,userDTO.getVorname());
            preparedStatement.setString(4,userDTO.getNachname());
            preparedStatement.setString(5,email);


            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return userDTO;
    }

    public int getVertrieblerNummer(String email) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String sqlBefehl;

        sqlBefehl = "SELECT " + DBTables.Vertriebler.COL_VERTRIEBLERNUMMER + " FROM " + table + ", " + DBTables.Vertriebler.TAB +
                " WHERE " + table + "." + DBTables.User.COL_EMAIL + " = " + DBTables.Vertriebler.TAB + "." + DBTables.User.COL_EMAIL +
                " AND " + table +  "." + DBTables.User.COL_EMAIL + " = " + "?;";
        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        int res = 0;
        try {
            preparedStatement.setString(1,email);
            resultSet = preparedStatement.executeQuery();

            assert resultSet != null;
            resultSet.next();

            res = resultSet.getInt(DBTables.Vertriebler.COL_VERTRIEBLERNUMMER);

        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return res;
    }

    public int getKundenNummer(String email) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String sqlBefehl;

        sqlBefehl = "SELECT " + DBTables.Kunde.COL_KUNDENNUMMER + " FROM " + table + ", " + DBTables.Kunde.TAB +
                " WHERE " + table + "." + DBTables.User.COL_EMAIL + " = " + DBTables.Kunde.TAB + "." + DBTables.User.COL_EMAIL +
                " AND " + table +  "." + DBTables.User.COL_EMAIL + " = " + "?;";
        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        int res = 0;
        try {
            preparedStatement.setString(1,email);
            resultSet = preparedStatement.executeQuery();

            assert resultSet != null;
            resultSet.next();

            res = resultSet.getInt(DBTables.Kunde.COL_KUNDENNUMMER);

        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return res;
    }

    public UserDTO isPasswordCorrect(String email, String password) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        ResultSet resultSet = null;
        UserDTO user = new UserDTO();

        String sqlBefehl = "SELECT *  FROM " + table + " WHERE email = ? AND password = ?;";
        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);

        boolean result = false;
        try {
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,password);

            resultSet = preparedStatement.executeQuery();



            if(resultSet.next()) {
                user.setEmail(resultSet.getString("email"));
                user.setVorname(resultSet.getString("vorname"));
                user.setNachname(resultSet.getString("nachname"));
            }
        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return user;
    }



    public StatusUser getStatus(String email) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        ResultSet resultSet = null;

        String sqlBefehl = "SELECT * FROM " + DBTables.Vertriebler.TAB + " WHERE " + DBTables.User.COL_EMAIL + " = ?;";

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        boolean result = false;

        try {
            preparedStatement.setString(1, email);

            resultSet = preparedStatement.executeQuery();

            assert resultSet != null;

            result = resultSet.next();
        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return (result ? StatusUser.VERTRIEBLER : StatusUser.KUNDE);
    }

    public boolean isRegistered(String email) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        ResultSet resultSet = null;

        String sqlBefehl = "SELECT * FROM " + table + " WHERE " + DBTables.User.COL_EMAIL + " = ?;";

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        boolean result = false;

        try {
            preparedStatement.setString(1, email);

            resultSet = preparedStatement.executeQuery();

            assert resultSet != null;

            result = resultSet.next();
        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return result;

    }




}
