package org.carlook.services.db.exampleData;

import org.carlook.controller.FahrzeugControl;
import org.carlook.controller.LoginControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.RegisterFailedException;
import org.carlook.factories.DTOFactory;
import org.carlook.model.dao.ReservationDAO;
import org.carlook.model.dao.UserDAO;
import org.carlook.model.objects.dto.ReservationDTO;
import org.carlook.model.objects.dto.UserDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Vertriebler;

import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleData {


    public static void initAllExamples() {

        initUser(ListSupplier.UserData.getList());
        initFahrzeuge(ListSupplier.FahrzeugData.getList());
        initKundeResFahzg();


    }


    public static void initUser(List<UserDTO> list) {
        for (UserDTO tmp : list) {
            LoginControl.registerAdmin(tmp);
        }
        Logger.getLogger(ExampleData.class.getName()).log(Level.INFO, list.get(0).getClass()  + " erfolgreich hinzugefuegt!\n");
    }

    public static void initFahrzeuge(List<Fahrzeug> list) {
        int sizeVertriebler = 0;
        try {
            sizeVertriebler = UserDAO.getInstance().sizeVertriebler();
        } catch (DatabaseException e) {
            Logger.getLogger(ExampleData.class.getName()).log(Level.INFO, null,e);
        }
        for (Fahrzeug tmp : list) {
            try {
                Vertriebler vertriebler = DTOFactory.createNewVertrieblerDTO().setVertriebnummer(new Random().nextInt(sizeVertriebler-1)+1);
                FahrzeugControl.register(tmp.setKennzeichen(FahrzeugControl.getRandomKennzeichen()),vertriebler);
            } catch (DatabaseException | RegisterFailedException e) {
                Logger.getLogger(ExampleData.class.getName()).log(Level.INFO, null, e);
                return;
            }
        }
        Logger.getLogger(ExampleData.class.getName()).log(Level.INFO, list.get(0).getClass()  + " erfolgreich hinzugefuegt!\n");
    }

    public static void initKundeResFahzg() {
        List<ReservationDTO> reservationDTOList = ListSupplier.KundeResFahrzg.getList();
        for (ReservationDTO tmp : reservationDTOList) {
            try {
                ReservationDAO.getInstance().register(tmp);
            } catch (DatabaseException e) {
                Logger.getLogger(ExampleData.class.getName()).log(Level.SEVERE, null, e);
                return;
            }
        }
        Logger.getLogger(ExampleData.class.getName()).log(Level.INFO, reservationDTOList.get(0).getClass()  + " erfolgreich hinzugefuegt!\n");
    }

}
