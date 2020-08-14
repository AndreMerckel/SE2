package org.carlook.model.objects.entities;

public class Kunde extends User {
    private int kundennummer;


    public int getKundennummer() {
        return kundennummer;
    }

    public void setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
    }
}
