package org.carlook.model.objects.entities;

import org.carlook.services.util.GridProps;

/**
 * Fahrzeug-Objekt
 */
public class Fahrzeug implements GridProps<String, Integer> {
    String hersteller, modell, beschreibung, kraftstoff, location, fahrgestellnummer, kennzeichen;
    int vertriebler, baujahr;

    /**
     * setzt den Hersteller
     * @param hersteller
     */
    public Fahrzeug setHersteller(String hersteller) {
        this.hersteller = hersteller;
        return this;
    }

    /**
     * setzt die Beschreibung
     * @param beschreibung
     */
    public Fahrzeug setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
        return this;
    }

    /**
     * setzt den Kraftstoff
     * @param kraftstoff
     */
    public Fahrzeug setKraftstoff(String kraftstoff) {
        this.kraftstoff = kraftstoff;
        return this;
    }

    /**
     * setzt die Lacation des Fahrzeuges
     * @param location
     */
    public Fahrzeug setLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * setzt das Baujahr
     * @param baujahr
     */
    public Fahrzeug setBaujahr(int baujahr) {
        this.baujahr = baujahr;
        return this;
    }

    /**
     * lierfet den Hersteller
     */
    public String getHersteller() {
        return hersteller;
    }

    /**
     * liefert die Beschreibung
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * liefert das Modell
     */
    public String getModell() {
        return modell;
    }

    /**
     * liefert den Kraftstoff
     */
    public String getKraftstoff() {
        return kraftstoff;
    }

    /**
     * liefert die Location
     */
    public String getLocation() {
        return location;
    }

    /**
     * liefert das Baujahr
     */
    public Integer getBaujahr() {
        return baujahr;
    }

    /**
     * setzt das Modell
     * @param modell
     */
    public Fahrzeug setModell(String modell) {
        this.modell = modell;
        return this;
    }

    /**
     * liefert die Fahrgestellnummer
     */
    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    /**
     * setzt die Fahrgestellnummer
     * @param fahrgestellnummer
     */
    public Fahrzeug setFahrgestellnummer(String fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
        return this;
    }

    /**
     * liefert das Kennzeichen
     */
    public String getKennzeichen() {
        return kennzeichen;
    }

    /**
     * setzt das Kennzeichen in Abhaengigkeit von einem String
     * @param kennzeichen
     */
    public Fahrzeug setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        return this;
    }

    /**
     * setzt das Kennzeichen in Abhaengigkeit von einem Kennzeichen-Objekt
     * @param kennzeichen
     */
    public Fahrzeug setKennzeichen(Kennzeichen kennzeichen) {
        return setKennzeichen(kennzeichen.toString());
    }

    /**
     * liefert die Vertrieblernummer
     */
    public Integer getVertriebler() {
        return vertriebler;
    }

    /**
     * setzt den Vertriebler
     * @param vertriebler
     */
    public Fahrzeug setVertriebler(int vertriebler) {
        this.vertriebler = vertriebler;
        return this;
    }
}
