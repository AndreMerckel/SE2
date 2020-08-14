package org.carlook.model.objects.dto;

public class ReservationDTO {

    int kundennummer;

    String kennzeichen;


    public String getKennzeichen() {
        return kennzeichen;
    }

    public ReservationDTO setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        return this;
    }

    public int getKundennummer() {
        return kundennummer;
    }

    public ReservationDTO setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
        return this;
    }
}
