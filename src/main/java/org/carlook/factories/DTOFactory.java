package org.carlook.factories;

import org.carlook.model.objects.dto.*;
import org.carlook.model.objects.entities.Vertriebler;

/**
 * Factory zur Erstellung von DTOs
 */
public class DTOFactory {

    /**
     * erstellt eines UserDTO Objekt
     */
    public static UserDTO createNewUserDTO() {
        return new UserDTO();
    }

    /**
     * erstellt ein neues ReservationDTO Objekt
     */
    public static ReservationDTO createNewReservationDTO() {
        return new ReservationDTO();
    }


}
