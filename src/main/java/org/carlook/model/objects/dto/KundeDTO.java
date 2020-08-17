package org.carlook.model.objects.dto;

public class KundeDTO extends UserDTO{

    private int kundennummer;

    public int getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
}
