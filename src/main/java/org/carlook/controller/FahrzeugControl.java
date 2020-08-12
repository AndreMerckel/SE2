package org.carlook.controller;

import org.carlook.model.dto.FahrzeugDTO;

public class FahrzeugControl {

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
    public void insert(FahrzeugDTO fahrzeug)  {

    }

    /**
     * Reservierung eines Fahrzeuges druch einen Kunden
     * @param fahrzeug
     */
    public void reserve(FahrzeugControl fahrzeug) {

    }

    /**
     * Entfernt ein Fahrzeug aus der Datenbank (nur Backend-Methode)
     * @param fahrzeugControl
     */
    public void delete(FahrzeugControl fahrzeugControl) {

    }

    /**
     * Aktualisiert Werte anhand einer Kategorie
     * @param fahrgestellnummer
     */
    public void update(String fahrgestellnummer, String Kategorie, String newVal) {

    }

}
