package org.carlook.controller;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.dao.UserDAO;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.services.db.JDBCConnection;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * User-Controller
 */
public class UserControl {

    /**
     * gibt ein zufaellig aus der DB vorhandenen User zurueck (fuer Beispieldaten)
     */
    public static UserDTO getRndUser() {
        Random random = new Random();
        UserDAO userDAO = UserDAO.getInstance();
        UserDTO userDTO = null;
        try {
            int size, rnum;
            size = userDAO.size();
            rnum = random.nextInt(size) + 1;
            System.out.println(rnum);
            userDTO = userDAO.getUserByRowNum(rnum);

        } catch (DatabaseException e) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, e);
        }
        return userDTO;
    }
}
