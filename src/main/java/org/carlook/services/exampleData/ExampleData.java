package org.carlook.services.exampleData;

import org.carlook.controller.FahrzeugControl;
import org.carlook.controller.Register;
import org.carlook.controller.UserControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.RegisterFailedException;
import org.carlook.factories.DTOFactory;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.dao.KundeReserviertFahrzeugDAO;
import org.carlook.model.objects.dto.FahrzeugDTO;
import org.carlook.model.objects.dto.KundeDTO;
import org.carlook.model.objects.dto.ReservationDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.services.util.DBTables;

import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleData {


    public static void initAllExamples() {

        init(UserControl.getInstance(),ListSupplier.UserData.getList());
        initFahrzeuge(ListSupplier.FahrzeugData.getList());
        initKundeResFahzg();


    }


    public static <T> void init(Register reg, List<T> list) {
        for (T tmp : list) {
            try {
                reg.register(tmp);
            } catch (DatabaseException e) {
                Logger.getLogger(ExampleData.class.getName()).log(Level.SEVERE, null, e);
                return;
            }
        }
        Logger.getLogger(ExampleData.class.getName()).log(Level.SEVERE, list.get(0).getClass()  + " erfolgreich hinzugefuegt!\n");
    }

    public static  void initFahrzeuge(List<Fahrzeug> list) {
        for (Fahrzeug tmp : list) {
            try {
                FahrzeugControl.getInstance().register(tmp, DTOFactory.createNewVertrieblerDTO().setVertriebnummer(new Random().nextInt(49)+1));
            } catch (DatabaseException | RegisterFailedException e) {
                Logger.getLogger(ExampleData.class.getName()).log(Level.SEVERE, null, e);
                return;
            }
        }
        Logger.getLogger(ExampleData.class.getName()).log(Level.SEVERE, list.get(0).getClass()  + " erfolgreich hinzugefuegt!\n");
    }

    public static void initKundeResFahzg() {
        List<String> list = null;
        try {
            list = FahrzeugDAO.getInstance().getKennzeichenRandRows();
        } catch (DatabaseException e) {
            Logger.getLogger(ExampleData.class.getName()).log(Level.SEVERE, null,e);
        }
        for (String tmp : list) {

            KundeDTO kundeDTO = DTOFactory.createNewKundeDTO().setKundennummer(new Random().nextInt(49)+1);
            FahrzeugDTO fahrzeugDTO = DTOFactory.createNewFahrzeugDTO().setKennzeichen(tmp);

            ReservationDTO reservationDTO = DTOFactory.createNewReservationDTO().setFahrzeugDTO(fahrzeugDTO).setKundeDTO(kundeDTO);

            try {
                KundeReserviertFahrzeugDAO.getInstance().register(reservationDTO);
            } catch (DatabaseException e) {
                Logger.getLogger(ExampleData.class.getName()).log(Level.SEVERE, null, e);
                return;
            }
            Logger.getLogger(ExampleData.class.getName()).log(Level.SEVERE, list.get(0).getClass()  + " erfolgreich hinzugefuegt!\n");
        }
    }

}
