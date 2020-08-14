package org.carlook.controller;

import org.carlook.controller.Register;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.dao.ReservationDAO;
import org.carlook.model.objects.dto.ReservationDTO;

public class ReservationControl implements Register<ReservationDTO> {


    @Override
    public void register(ReservationDTO obj) throws DatabaseException {
        ReservationDAO.getInstance().create(obj);
    }
}
