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
    private String table = DBTables.User.TAB;

    private UserDAO() {}

    public static synchronized UserDAO getInstance() {

        if (userDAO == null) userDAO = new UserDAO();

        return userDAO;
    }

    public void register(UserDTO userDTO, StatusUser statusUser) throws DatabaseException {
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
    }


}
