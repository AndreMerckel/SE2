package org.carlook.model.objects.entities;

/**
 * Kunden-Objekt
 */
public class Kunde extends User {
    private int kundennummer;

    /**
     * liefert die Kundennummer
     * @return
     */
    public int getKundennummer() {
        return kundennummer;
    }

    /**
     * setzt die Kundennummer
     * @param kundennummer
     * @return
     */
    public Kunde setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
        return this;
    }
}
