package org.carlook.factories;

import org.carlook.model.objects.dto.*;
import org.carlook.model.objects.entities.Vertriebler;

public class DTOFactory {

    public static UserDTO createNewUserDTO() {
        return new UserDTO();
    }

    public static Vertriebler createNewVertrieblerDTO() {
        return new Vertriebler();
    }

    public static KundeDTO createNewKundeDTO() {
        return new KundeDTO();
    }

    public static FahrzeugDTO createNewFahrzeugDTO() {
        return new FahrzeugDTO();
    }

    public static VertrieblerErstelltFahrzeugDTO createNewVertrieblerErstelltFahrzeugDTO() {
        return new VertrieblerErstelltFahrzeugDTO();
    }

    public static ReservationDTO createNewReservationDTO() {
        return new ReservationDTO();
    }


}
