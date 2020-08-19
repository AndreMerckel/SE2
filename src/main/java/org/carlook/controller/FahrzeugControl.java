package org.carlook.controller;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.RegisterFailedException;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.objects.dto.VertrieblerDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Vertriebler;
import org.carlook.services.db.JDBCConnection;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FahrzeugControl {


    /**
     * Erstellung von einem Fahrzeug durch einen Vertriebsmitarbeiter
     * @param fahrzeug, vertrieblerDTO
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
     * @param fz, vertriebsnummer
     */
    public static boolean delete(Fahrzeug fz, int vertriebsnummer) throws DatabaseException {
        try {
            FahrzeugDAO.getInstance().deleteFahrzeugByKeys(fz, vertriebsnummer);
        }catch(Error err){
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, err);
            return false;
        }
        return true;
    }

    /**
     * Aktualisiert Werte anhand einer Kategorie
     * @param fahrgestellnummer
     */
    public void update(String fahrgestellnummer, String Kategorie, String newVal) {

    }

    public static List<Fahrzeug> fetchAllFahrzeuge(){
        List<Fahrzeug> fahrzeugeList = new ArrayList<>();
        try{
            fahrzeugeList = FahrzeugDAO.getInstance().getAllFahrzeuge();
        }catch(Error | DatabaseException ex){
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fahrzeugeList;

    }

    public static List<Fahrzeug> fetchFahrzeugeVonVertriebler(Vertriebler vertriebler){
        List<Fahrzeug> fahrzeuglist = new ArrayList<>();

        try{
            fahrzeuglist = FahrzeugDAO.getInstance().getFahrzeugeByVertriebler(vertriebler);
        } catch(Error | DatabaseException ex) {
            Logger.getLogger(JDBCConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fahrzeuglist;
    }


}
