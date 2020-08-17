package org.carlook.controller;

import com.vaadin.server.VaadinSession;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.RegisterFailedException;
import org.carlook.factories.DTOFactory;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.objects.dto.FahrzeugDTO;
import org.carlook.model.objects.dto.VertrieblerDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Vertriebler;

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
     * @param fahrzeug, vertrieblerDTO
     */
    public void register(Fahrzeug fahrzeug, VertrieblerDTO vertrieblerDTO) throws DatabaseException, RegisterFailedException {
        FahrzeugDAO.getInstance().register(fahrzeug, vertrieblerDTO);
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
