package org.carlook.model.objects.dto;

import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Vertriebler;

public class VertrieblerErstelltFahrzeugDTO {

    public Vertriebler vertriebler;
    public Fahrzeug fahrzeug;

    public Vertriebler getVertriebler() {
        return vertriebler;
    }

    public VertrieblerErstelltFahrzeugDTO setVertriebler(Vertriebler vertriebler) {
        this.vertriebler = this.vertriebler;
        return this;
    }

    public Fahrzeug getFahrzeug() {
        return fahrzeug;
    }

    public VertrieblerErstelltFahrzeugDTO setFahrzeug(Fahrzeug fahrzeug) {
        this.fahrzeug = fahrzeug;
        return this;
    }
}
