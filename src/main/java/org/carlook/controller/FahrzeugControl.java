package org.carlook.controller;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.RegisterFailedException;
import org.carlook.factories.Factories;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.dao.ReservationDAO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kennzeichen;
import org.carlook.model.objects.entities.Vertriebler;
import org.carlook.services.db.JDBCConnection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Fahrzeug Controller
 */
public class FahrzeugControl {


    /**
     * fuegt das Fahrzeug mit der Vertrieblenummer in der Datenbank ein
     * @param fahrzeug
     * @param vertriebler
     * @throws DatabaseException
     * @throws RegisterFailedException
     */
    public static void register(Fahrzeug fahrzeug, Vertriebler vertriebler) throws DatabaseException, RegisterFailedException {
        try{
            FahrzeugDAO.getInstance().register(fahrzeug, vertriebler);
        } catch (DatabaseException | RegisterFailedException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
    }


    /**
     * Entfernt ein Fahrzeug aus der Datenbank (nur Backend-Methode)
     * @param fz
     * @param vertriebsnummer
     * @return true, wenn die Löschung erfolgreich war, sonst false
     * @throws DatabaseException
     */
    public static boolean delete(Fahrzeug fz, int vertriebsnummer) throws DatabaseException {
        try {
            FahrzeugDAO.getInstance().deleteFahrzeugByKeys(fz, vertriebsnummer);
        } catch (Error err) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, err);
            return false;
        }
        return true;
    }

    /**
     * gibt eine Liste aller in der DB vorhandene Fahrzeuge aus
     */
    public static List<Fahrzeug> fetchAllFahrzeuge(){
        List<Fahrzeug> fahrzeugeList = new ArrayList<>();
        try{
            fahrzeugeList = FahrzeugDAO.getInstance().getAllFahrzeuge();
        } catch(Error | DatabaseException ex){
            Logger.getLogger(FahrzeugControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fahrzeugeList;

    }

    /**
     * gibt eine Liste von Fahrzeugen aus, die von dem jeweiligen Vertriebler erstellt worden sind
     * @param vertriebler
     */
    public static List<Fahrzeug> fetchFahrzeugeVonVertriebler(Vertriebler vertriebler){
        List<Fahrzeug> fahrzeuglist = new ArrayList<>();

        try {
            fahrzeuglist = FahrzeugDAO.getInstance().getFahrzeugeByVertriebler(vertriebler);
        } catch (Error | DatabaseException ex) {
            Logger.getLogger(FahrzeugControl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fahrzeuglist;
    }

    /**
     * ueberprueft, ob die Fahrgestellnummer bereits in der DB vorhanden ist
     * @param fahrgestellnummer
     * @return true, falls Fahrgestellnummer ist vorhanden
     */
    public static boolean checkFahrgestellnummerAvailability(String fahrgestellnummer) {
        boolean res = false;
        try {
            res = FahrzeugDAO.getInstance().checkFahrgestellnummerAvailability(fahrgestellnummer);
        } catch (DatabaseException e) {
            Logger.getLogger(FahrzeugControl.class.getName()).log(Level.SEVERE, null, e);
        }
        return res;
    }


    /**
     * gibt eine freie Kennzeichen-Kombination zurück.
     * @return Kennzeichen als String in FORM SU-CL-####
     */
    public static String getRandomKennzeichen() {
        int rdmInt = new Random().nextInt(9999)+1;
        Kennzeichen kennzeichen = Factories.createNewKennzeichen().setKennzeichen(rdmInt);
        try {
            if (FahrzeugDAO.getInstance().checkKennzeichenAvailability(kennzeichen))
                return getRandomKennzeichen();
        } catch (DatabaseException e) {
            Logger.getLogger(FahrzeugControl.class.getName()).log(Level.SEVERE, null, e);
        }
        return kennzeichen.getKennzeichen();
    }


}
