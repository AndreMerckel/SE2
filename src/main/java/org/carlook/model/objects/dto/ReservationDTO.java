package org.carlook.model.objects.dto;

import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kunde;

/**
 * ReservationDTO Objekt
 */
public class ReservationDTO {

    public Kunde kunde;
    public Fahrzeug fahrzeug;

    /**
     * liefert ein Kunden Objekt
     */
    public Kunde getKunde() {
        return kunde;
    }

    /**
     * setzt das Kunden-Objekt in den Container
     * @param kunde
     */
    public ReservationDTO setKunde(Kunde kunde) {
        this.kunde = kunde;
        return this;
    }

    /**
     * liefert das Fahrzeug-Objekt
     */
    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }

    /**
     * setzt das Fahrzeug-Objekt in den Container
     * @param fahrzeug
     */
    public ReservationDTO setFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
        return this;
    }
}
