package org.carlook.controller;

import com.vaadin.server.VaadinSession;
import com.vaadin.ui.UI;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.NoSuchUserOrPassword;
import org.carlook.model.dao.UserDAO;
import org.carlook.model.objects.dto.ReservationDTO;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.model.objects.entities.Kunde;
import org.carlook.model.objects.entities.Vertriebler;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.util.Parameter;
import org.carlook.services.util.Roles;
import org.carlook.services.util.StatusUser;
import org.carlook.services.util.Views;

import java.util.logging.Level;
import java.util.logging.Logger;

public class LoginControl {

    public static void checkAuthentication(String email, String password) throws NoSuchUserOrPassword, DatabaseException {

        UserDTO userTemp = null;
        StatusUser statusUser = null;
        try {
            userTemp = UserDAO.getInstance().isPasswordCorrect(email, password);
        }
        catch (DatabaseException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

            try {
                if (userTemp != null) {
                    statusUser = UserDAO.getInstance().getStatus(email);
            } else {
                throw new NoSuchUserOrPassword("Wrong Email or Password. Please try again.");
            }
            } catch (DatabaseException ex) {
                Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
            }

            VaadinSession session = UI.getCurrent().getSession();
            session.setAttribute(Roles.STATUS, statusUser);

        if (statusUser == StatusUser.KUNDE) {
            Kunde kd = new Kunde();
            kd.setEmail(userTemp.getEmail());
            kd.setKundennummer(UserDAO.getInstance().getKundenNummer(userTemp.getEmail()));
            kd.setNachname(userTemp.getNachname());
            kd.setVorname(userTemp.getVorname());

            session.setAttribute(Roles.CURRENT_USER, kd);
            UI.getCurrent().getNavigator().navigateTo(Views.USERSEARCHVIEW);
        } else {
            Vertriebler vt = new Vertriebler();
            vt.setEmail(userTemp.getEmail());
            vt.setVertriebnummer(UserDAO.getInstance().getVertrieblerNummer(userTemp.getEmail()));
            vt.setNachname(userTemp.getNachname());
            vt.setVorname(userTemp.getVorname());
            session.setAttribute(Roles.CURRENT_USER, vt);
            UI.getCurrent().getNavigator().navigateTo(Views.SALESVIEW);
        }
    }

    public static void register(String email, String password, String vorname, String nachname) throws DatabaseException {

        UserDTO userTemp = new UserDTO();
        userTemp.setEmail(email);
        userTemp.setNachname(nachname);
        userTemp.setVorname(vorname);
        userTemp.setPassword(password);

        StatusUser statusUser = email.equals(vorname + "." + nachname + "@" + "carlook.de") ? StatusUser.VERTRIEBLER : StatusUser.KUNDE;

        try {
            userTemp = UserDAO.getInstance().register(userTemp, statusUser);
        }
        catch (DatabaseException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

        VaadinSession session = UI.getCurrent().getSession();
        session.setAttribute(Roles.STATUS, statusUser);

        if (statusUser == StatusUser.KUNDE) {
            Kunde kd = new Kunde();
            kd.setEmail(userTemp.getEmail());
            kd.setKundennummer(UserDAO.getInstance().getKundenNummer(userTemp.getEmail()));
            kd.setNachname(userTemp.getNachname());
            kd.setVorname(userTemp.getVorname());

            session.setAttribute(Roles.CURRENT_USER, kd);
            UI.getCurrent().getNavigator().navigateTo(Views.USERSEARCHVIEW);
        } else {
            Vertriebler vt = new Vertriebler();
            vt.setEmail(userTemp.getEmail());
            vt.setVertriebnummer(UserDAO.getInstance().getVertrieblerNummer(userTemp.getEmail()));
            vt.setNachname(userTemp.getNachname());
            vt.setVorname(userTemp.getVorname());
            session.setAttribute(Roles.CURRENT_USER, vt);
            UI.getCurrent().getNavigator().navigateTo(Views.SALESVIEW);
        }

    }

    public static void register(UserDTO userDTO) throws DatabaseException {
        register(userDTO.getEmail(), userDTO.getPassword(), userDTO.getVorname(), userDTO.getNachname());
    }

    public static void logoutUser() {
        UI.getCurrent().getSession().close();
        UI.getCurrent().getPage().setLocation(Views.LOGIN);
    }

    public static void registerAdmin(UserDTO userDTO) {

        StatusUser statusUser = userDTO.getEmail().trim().equals((userDTO.getVorname() + "." + userDTO.getNachname() + Parameter.COMPANY_MAIL_ADDRESS).toLowerCase()) ? StatusUser.VERTRIEBLER : StatusUser.KUNDE;
        try {
            UserDAO.getInstance().register(userDTO, statusUser);
        }
        catch (DatabaseException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Helper



}
