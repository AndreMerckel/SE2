package org.carlook.controller;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.dao.KundeReserviertFahrzeugDAO;
import org.carlook.model.dao.ReservationDAO;
import org.carlook.model.objects.dto.ReservationDTO;

public class ReservationControl{

    public static void register(ReservationDTO reservationDTO) throws DatabaseException {
        KundeReserviertFahrzeugDAO.getInstance().register(reservationDTO);
    }
}
