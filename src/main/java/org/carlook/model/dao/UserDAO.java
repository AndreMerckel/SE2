package org.carlook.model.dao;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.NoSuchUserOrPassword;
import org.carlook.factories.DTOFactory;
import org.carlook.factories.Factories;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.model.objects.entities.User;
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
            throw new DatabaseException(throwables.getMessage());
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return userDTO;
    }

    public UserDTO getUserByRowNum(int rnum) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String sqlBefehl;

        sqlBefehl = "SELECT " + DBTables.User.COL_EMAIL + ", " + DBTables.User.COL_PASSWORD + " \n" +
                "FROM (SELECT row_number() OVER () as rnum , " + DBTables.User.COL_EMAIL + ", " + DBTables.User.COL_PASSWORD + " \n" +
                "FROM " + DBTables.User.TAB + ") tab \n" +
                "WHERE rnum = ?;\n";

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;

        UserDTO userDTO = null;

        try {
            preparedStatement.setInt(1,rnum);
            resultSet = preparedStatement.executeQuery();

            assert resultSet != null;
            if (resultSet.next()) {
                String email, password;
                email = resultSet.getString(DBTables.User.COL_EMAIL);
                password = resultSet.getString(DBTables.User.COL_PASSWORD);
                userDTO = DTOFactory.createNewUserDTO().setEmail(email).setPassword(password);
            }

            resultSet.close();
        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
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
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
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
            resultSet.close();

        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return res;
    }

    public UserDTO isPasswordCorrect(String email, String password) throws DatabaseException, NoSuchUserOrPassword {
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
            } else{
                throw new NoSuchUserOrPassword("Wrong credentials");

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

    public int size() throws DatabaseException {
        JDBCConnection.getInstance().openConnection();

        String sqlBefehl = "SELECT Count(*) FROM " + table + ";";

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);

        ResultSet resultSet = null;
        int res = 0;
        try {
            resultSet = preparedStatement.executeQuery();

            resultSet.next();
            res = 1 + resultSet.getInt(1);
        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return res;
    }

    public int sizeKunde() throws DatabaseException {
        JDBCConnection.getInstance().openConnection();

        String sqlBefehl = "SELECT Count(*) FROM " + DBTables.Kunde.TAB + ";";

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);

        ResultSet resultSet = null;
        int res = 0;
        try {
            resultSet = preparedStatement.executeQuery();

            resultSet.next();
            res = resultSet.getInt(1);
        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return res;
    }

    public int sizeVertriebler() throws DatabaseException {
        JDBCConnection.getInstance().openConnection();

        String sqlBefehl = "SELECT Count(*) FROM " + DBTables.Vertriebler.TAB + ";";

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);

        ResultSet resultSet = null;
        int res = 0;
        try {
            resultSet = preparedStatement.executeQuery();

            resultSet.next();
            res = resultSet.getInt(1);
        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return res;
    }

    public String getVertrieblerbyID(int id) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String sqlBefehl;

        sqlBefehl = "SELECT " + DBTables.User.TAB + "." + DBTables.User.COL_NACHNAME + " FROM " + table + "," + DBTables.Vertriebler.TAB + " WHERE " + table + "." + DBTables.User.COL_EMAIL + " = " + DBTables.Vertriebler.TAB + "." + DBTables.User.COL_EMAIL +
                " AND " + DBTables.Vertriebler.TAB + "." + DBTables.Vertriebler.COL_VERTRIEBLERNUMMER + " = ?;";
        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        String res = "";
        try {
            preparedStatement.setInt(1,id);
            resultSet = preparedStatement.executeQuery();

            assert resultSet != null;
            resultSet.next();

            res = resultSet.getString(DBTables.User.COL_NACHNAME);

            resultSet.close();
        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return res;
    }

}
