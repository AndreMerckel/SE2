package org.carlook.model.objects.dto;

import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kunde;

public class ReservationDTO {

    public Kunde kunde;
    public Fahrzeug fahrzeug;

    public Kunde getKunde() {
        return kunde;
    }

    public ReservationDTO setKunde(Kunde kunde) {
        this.kunde = kunde;
        return this;
    }

    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }

    public ReservationDTO setFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
        return this;
    }
}
