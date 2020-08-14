package org.carlook.controller;

import com.vaadin.server.VaadinSession;
import com.vaadin.ui.UI;
import com.vaadin.ui.UniqueSerializable;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.NoSuchUserOrPassword;
import org.carlook.controller.exception.UserNotFoundException;
import org.carlook.model.dao.UserDAO;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.model.objects.entities.User;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.util.Roles;
import org.carlook.services.util.StatusUser;
import org.carlook.services.util.Views;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginControl {
/*
    public static void checkAuthentication(String email, String password) throws NoSuchUserOrPassword, DatabaseException {

        User user = null;
        boolean correct = false;
        try {
            correct = UserDAO.getInstance().isPasswordCorrect(email, password);
        }
        catch (DatabaseException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        StatusUser statusUser = UserDAO.getInstance().getStatus(email);
            try {
                if (correct) {
                    user = UserDAO.getInstance().getUser(email);
            } else {
                throw new NoSuchUserOrPassword("Wrong Email or Password. Please try again.");
            }
            } catch (DatabaseException ex) {
                Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

            VaadinSession session = UI.getCurrent().getSession();
            session.setAttribute(Roles.CURRENT_USER, user);
            session.setAttribute(user instanceof Student ? Roles.STUDENT : Roles.UNTERNEHMER, user);

            UI.getCurrent().getNavigator().navigateTo(Views.PROFILE);
    }

    public static void logoutUser() {
        UI.getCurrent().getSession().close();
        UI.getCurrent().getPage().setLocation(Views.LOGIN);
    }

 */

}
