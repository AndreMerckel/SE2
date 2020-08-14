package org.carlook.controller;

import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.dao.UserDAO;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.RegisterFailException;
import org.carlook.services.util.StatusUser;


public class RegistrationControl {



    public static void register(UserDTO userDTO) throws DatabaseException {
        //TODO - check if user is alreader registered

        //TODO - check role of user
        UserDAO.getInstance().register(userDTO,getStatusUser(userDTO));
    }

    public static boolean userIsRegistered(UserDTO userDTO) {
        //TODO - uebergabe an DAO
        return false;
    }

    public static StatusUser getStatusUser(UserDTO userDTO) {
        String email, emailSuffix;

        email = userDTO.getEmail().trim();
        emailSuffix = "@carlook.de";

        int emailLength = email.length();

        String emailSuffixUser = email.substring(emailLength-emailSuffix.length());

        if (emailSuffixUser.equals(emailSuffix)) {
            return StatusUser.VERTRIEBLER;
        }
        return StatusUser.KUNDE;

    }

}
