package org.carlook.model.objects.entities;

/**
 * Kunden-Objekt
 */
public class Kunde extends User {
    private int kundennummer;

    /**
     * liefert die Kundennummer
     */
    public int getKundennummer() {
        return kundennummer;
    }

    /**
     * setzt die Kundennummer
     * @param kundennummer
     */
    public Kunde setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
        return this;
    }
}
