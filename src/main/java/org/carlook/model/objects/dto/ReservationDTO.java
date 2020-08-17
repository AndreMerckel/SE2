package org.carlook.model.objects.dto;

public class ReservationDTO {

    public KundeDTO kundeDTO;
    public FahrzeugDTO fahrzeugDTO;

    public KundeDTO getKundeDTO() {
        return kundeDTO;
    }

    public ReservationDTO setKundeDTO(KundeDTO kundeDTO) {
        this.kundeDTO = kundeDTO;
        return this;
    }

    public FahrzeugDTO getFahrzeugDTO() {
        return fahrzeugDTO;
    }

    public ReservationDTO setFahrzeugDTO(FahrzeugDTO fahrzeugDTO) {
        this.fahrzeugDTO = fahrzeugDTO;
        return this;
    }
}
