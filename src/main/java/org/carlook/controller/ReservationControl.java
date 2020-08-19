package org.carlook.controller;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.dao.ReservationDAO;
import org.carlook.model.objects.dto.ReservationDTO;

public class ReservationControl {

    public static boolean register(ReservationDTO reservationDTO) throws DatabaseException {
        try{
            ReservationDAO.getInstance().register(reservationDTO);
        } catch(Error err){
            return false;
        }
        return true;
    }
}
