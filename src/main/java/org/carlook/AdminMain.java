package org.carlook;

import org.carlook.controller.RegistrationControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.factories.DTOFactories;
import org.carlook.model.dao.UserDAO;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.services.db.DBCreation;
import org.carlook.services.util.StatusUser;

public class AdminMain {

    public static void main (String[] args) {
        UserDTO userDTO = DTOFactories.createUserDTO().setEmail("mail@mail.de").setNachname("zimmer").setVorname("paul").setPassword("pw123");
        UserDTO userDTO2 = DTOFactories.createUserDTO().setEmail("mail@carlook.de").setNachname("Jahnke").setVorname("Anja").setPassword("jzgbhbnmbv");
        DBCreation.refreshTables();




    }


}
