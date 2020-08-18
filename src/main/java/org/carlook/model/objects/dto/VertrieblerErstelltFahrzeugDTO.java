package org.carlook.model.objects.dto;

import org.carlook.model.objects.entities.Vertriebler;

public class VertrieblerErstelltFahrzeugDTO {

    public VertrieblerDTO vertrieblerDTO ;
    public FahrzeugDTO fahrzeugDTO;

    public VertrieblerDTO getVertrieblerDTO() {
        return vertrieblerDTO;
    }

    public VertrieblerErstelltFahrzeugDTO setVertrieblerDTO(Vertriebler vertriebler) {
        this.vertrieblerDTO = vertrieblerDTO;
        return this;
    }

    public FahrzeugDTO getFahrzeugDTO() {
        return fahrzeugDTO;
    }

    public VertrieblerErstelltFahrzeugDTO setFahrzeugDTO(FahrzeugDTO fahrzeugDTO) {
        this.fahrzeugDTO = fahrzeugDTO;
        return this;
    }
}
