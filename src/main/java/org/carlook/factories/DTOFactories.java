package org.carlook.factories;

import org.carlook.model.objects.dto.UserDTO;

public class DTOFactories {

    public static UserDTO createUserDTO() {
        return new UserDTO();
    }
}
