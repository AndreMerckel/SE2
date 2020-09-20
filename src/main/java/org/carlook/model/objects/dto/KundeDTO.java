package org.carlook.model.objects.dto;

/**
 * KundeDT-Objekt
 */
public class KundeDTO extends UserDTO{

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
    public KundeDTO setKundennummer(int kundennummer) {
        this.kundennummer = kundennummer;
        return this;
    }
}
