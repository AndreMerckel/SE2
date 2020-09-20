package org.carlook.model.objects.entities;

/**
 * Vertriebler-Objekt
 */
public class Vertriebler extends User {
    int vertriebnummer;

    /**
     * liefert die Vertrieblernummer
     */
    public int getVertriebnummer() {
        return vertriebnummer;
    }

    /**
     * setzt die Vertrieblernummer
     * @param vertriebnummer
     */
    public Vertriebler setVertriebnummer(int vertriebnummer) {
        this.vertriebnummer = vertriebnummer;
        return this;
    }
}
