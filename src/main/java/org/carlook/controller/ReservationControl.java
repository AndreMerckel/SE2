package org.carlook.controller;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.dao.ReservationDAO;
import org.carlook.model.objects.dto.ReservationDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kunde;

public class ReservationControl {

    public static boolean register(ReservationDTO reservationDTO) throws DatabaseException {
        try{
            ReservationDAO.getInstance().register(reservationDTO);
        } catch(Error err){
            return false;
        }
        return true;
    }

    public static boolean checkReserved(Integer id, String kennzeichen){
        ReservationDTO r = new ReservationDTO();
        Fahrzeug f = new Fahrzeug();
        f.setKennzeichen(kennzeichen);
        Kunde k = new Kunde();
        k.setKundennummer(id);
        r.setFahrzeug(f);
        r.setKunde(k);

        boolean check = true;
        try{
            check = ReservationDAO.getInstance().isReserved(r);
        } catch(DatabaseException err){
            return check;
        }
        return check;
    }
}
