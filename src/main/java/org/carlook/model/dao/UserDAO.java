package org.carlook.model.dao;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.util.DBTables;
import org.carlook.services.util.StatusUser;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserDAO extends AbstractDAO {

    private static UserDAO userDAO;
    private String table = DBTables.TAB_USER;

    private UserDAO() {}

    public static synchronized UserDAO getInstance() {

        if (userDAO == null) userDAO = new UserDAO();

        return userDAO;
    }

    public void register(UserDTO userDTO, StatusUser statusUser) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String email, sqlBefehl;

        email = userDTO.getEmail();
        sqlBefehl = "INSERT INTO " + table + " (email,password,vorname,nachname) " +
                "VALUES (?,?,?,?); " +
                "INSERT INTO ";
        if (statusUser == StatusUser.KUNDE) {
            sqlBefehl += DBTables.TAB_KUNDE;
        } else {
            sqlBefehl += DBTables.TAB_VERTRIEBLER;
        }
        sqlBefehl += " (email) VALUES (?)";

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        try {
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,userDTO.getPasssword());
            preparedStatement.setString(3,userDTO.getVorname());
            preparedStatement.setString(4,userDTO.getNachname());
            preparedStatement.setString(5,email);



            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            Logger.getLogger(UserDAO.class.getName()).log(Level.SEVERE, null, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }


}
