package org.carlook.controller;

import com.vaadin.ui.UI;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.dao.ReservationDAO;
import org.carlook.model.objects.dto.ReservationDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kunde;
import org.carlook.services.util.Roles;

import java.util.List;

public class ReservationControl {

    public static boolean register(ReservationDTO reservationDTO) throws DatabaseException {
        try{
            ReservationDAO.getInstance().register(reservationDTO);
        } catch(Error err){
            return false;
        }
        return true;
    }

    public static boolean unregister(ReservationDTO reservationDTO) throws DatabaseException {
        try{
            ReservationDAO.getInstance().deleteReservation(reservationDTO);
        } catch(Error err){
            return false;
        }
        return true;
    }


    //Database version of the session query. Please see next method
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

    //Complete Session Query
    public static boolean checkReservedSession(String kennzeichen){
        boolean check = false;
        List<String> reservations = (List<String>) UI.getCurrent().getSession().getAttribute(Roles.RESERVATIONS);
        if( reservations != null){
            for (String s : reservations){
                if (s.equals(kennzeichen)) {
                    check = true;
                    break;
                }
            }
        }
        return check;
    }
}
