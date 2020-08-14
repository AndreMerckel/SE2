package org.carlook.services.db.exampleData;

import org.carlook.controller.RegistrationControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.factories.DTOFactories;
import org.carlook.model.objects.dto.UserDTO;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleUserData {

    private static void registerExampleData(List<UserDTO> list) {
        for (UserDTO tmp : list) {
            try {
                RegistrationControl.register(tmp);
            } catch (DatabaseException e) {
                Logger.getLogger(ExampleUserData.class.getName()).log(Level.SEVERE, null, e);
            }
        }
    }

    public static void registerGenData() {
        List<UserDTO> list = new ArrayList<>();
        list.add(DTOFactories.createUserDTO().setVorname("Aundrea").setNachname("Beades").setEmail("abeades0@buzzfeed.com").setPassword("qIm1nrYFB"));
        list.add(DTOFactories.createUserDTO().setVorname("Celina").setNachname("Minshull").setEmail("cminshull1@360.cn").setPassword("4XxjAymcHVH"));
        registerExampleData(list);
    }

    public static void main(String[] args) {
        List<UserDTO> list = new ArrayList<>();
        list.add(DTOFactories.createUserDTO().setVorname("Aundrea").setNachname("Beades").setEmail("abeades0@buzzfeed.com").setPassword("qIm1nrYFB"));
        list.add(DTOFactories.createUserDTO().setVorname("Celina").setNachname("Minshull").setEmail("cminshull1@360.cn").setPassword("4XxjAymcHVH"));




    }
}
