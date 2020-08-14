package org.carlook.controller;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.objects.dto.FahrzeugDTO;
import org.carlook.model.objects.dto.FahrzeugSearchDTO;
import org.carlook.model.objects.entities.Fahrzeug;

public class FahrzeugControl implements Register<Fahrzeug> {

    private static FahrzeugControl fahrzeugControl;

    private FahrzeugControl() {}

    /**
     * Realisierung Singleton-Pattern
     */
    public static synchronized FahrzeugControl getInstance() {
        if (fahrzeugControl == null)
            fahrzeugControl =  new FahrzeugControl();
        return fahrzeugControl;
    }


    /**
     * Erstellung von einem Fahrzeug durch einen Vertriebsmitarbeiter
     * @param fahrzeug
     */
    @Override
    public void register (Fahrzeug fahrzeug) throws DatabaseException {
        FahrzeugDAO.getInstance().register(fahrzeug);
    }

    /**
     * Reservierung eines Fahrzeuges druch einen Kunden
     * @param fahrzeug
     */
    public void reserve(FahrzeugDTO fahrzeug) {

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
