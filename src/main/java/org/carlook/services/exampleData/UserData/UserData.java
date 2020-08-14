package org.carlook.services.exampleData.UserData;

import org.carlook.controller.RegistrationControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.factories.DTOFactories;
import org.carlook.model.objects.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class UserData {

    public static void insertUserData(List<UserDTO> list) {
        for (UserDTO tmp : list) {
            try {
                RegistrationControl.register(tmp);
            } catch (DatabaseException e) {
                Logger.getLogger(UserData.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    }
}
