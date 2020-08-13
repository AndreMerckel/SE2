package org.carlook;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.factories.DTOFactories;
import org.carlook.model.dao.UserDAO;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.services.db.DBCreation;
import org.carlook.services.util.StatusUser;

public class AdminMain {

    public static void main (String[] args) {
        UserDTO userDTO = DTOFactories.createUserDTO();
        userDTO.setEmail("mail@mail.de").setNachname("zimmer").setVorname("paul").setPasssword("pw123");
        DBCreation.refreshTables();
        try {
            UserDAO.getInstance().register(userDTO, StatusUser.KUNDE);
        } catch (DatabaseException e) {
            e.printStackTrace();
        }


    }
}
