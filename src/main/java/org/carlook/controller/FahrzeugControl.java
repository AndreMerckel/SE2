package org.carlook.controller;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.RegisterFailedException;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.objects.dto.VertrieblerDTO;
import org.carlook.model.objects.entities.Fahrzeug;

public class FahrzeugControl {


    /**
     * Erstellung von einem Fahrzeug durch einen Vertriebsmitarbeiter
     * @param fahrzeug, vertrieblerDTO
     */
    public static void register(Fahrzeug fahrzeug, VertrieblerDTO vertrieblerDTO) throws DatabaseException, RegisterFailedException {
        FahrzeugDAO.getInstance().register(fahrzeug, vertrieblerDTO);
    }

    /**
     * Entfernt ein Fahrzeug aus der Datenbank (nur Backend-Methode)
     * @param fahrzeugControl
     */
    public void delete(Fahrzeug fahrzeugControl) {

    }

    /**
     * Aktualisiert Werte anhand einer Kategorie
     * @param fahrgestellnummer
     */
    public void update(String fahrgestellnummer, String Kategorie, String newVal) {

    }


}
