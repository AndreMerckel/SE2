package org.carlook.model.objects.dto;

public class KundeDTO extends UserDTO{

    private int kundennummer;

    public int getKundennummer() {
        return kundennummer;
    }

    public KundeDTO setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
        return this;
    }
}
