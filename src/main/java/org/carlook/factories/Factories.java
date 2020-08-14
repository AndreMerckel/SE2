package org.carlook.factories;

import org.carlook.model.objects.dto.UserDTO;
import org.carlook.model.objects.entities.Fahrzeug;

public class Factories {

    public static UserDTO createNewUserDTO() {
        return new UserDTO();
    }

    public static Fahrzeug createNewFahrzeug() {
        return new Fahrzeug();
    }

}
