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
     * @return
     */
    public Fahrzeug setHersteller(String hersteller) {
        this.hersteller = hersteller;
        return this;
    }

    /**
     * setzt die Beschreibung
     * @param beschreibung
     * @return
     */
    public Fahrzeug setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
        return this;
    }

    /**
     * setzt den Kraftstoff
     * @param kraftstoff
     * @return
     */
    public Fahrzeug setKraftstoff(String kraftstoff) {
        this.kraftstoff = kraftstoff;
        return this;
    }

    /**
     * setzt die Lacation des Fahrzeuges
     * @param location
     * @return
     */
    public Fahrzeug setLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * setzt das Baujahr
     * @param baujahr
     * @return
     */
    public Fahrzeug setBaujahr(int baujahr) {
        this.baujahr = baujahr;
        return this;
    }

    /**
     * lierfet den Hersteller
     * @return
     */
    public String getHersteller() {
        return hersteller;
    }

    /**
     * liefert die Beschreibung
     * @return
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * liefert das Modell
     * @return
     */
    public String getModell() {
        return modell;
    }

    /**
     * liefert den Kraftstoff
     * @return
     */
    public String getKraftstoff() {
        return kraftstoff;
    }

    /**
     * liefert die Location
     * @return
     */
    public String getLocation() {
        return location;
    }

    /**
     * liefert das Baujahr
     * @return
     */
    public Integer getBaujahr() {
        return baujahr;
    }

    /**
     * setzt das Modell
     * @param modell
     * @return
     */
    public Fahrzeug setModell(String modell) {
        this.modell = modell;
        return this;
    }

    /**
     * liefert die Fahrgestellnummer
     * @return
     */
    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    /**
     * setzt die Fahrgestellnummer
     * @param fahrgestellnummer
     * @return
     */
    public Fahrzeug setFahrgestellnummer(String fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
        return this;
    }

    /**
     * liefert das Kennzeichen
     * @return
     */
    public String getKennzeichen() {
        return kennzeichen;
    }

    /**
     * setzt das Kennzeichen in Abhaengigkeit von einem String
     * @param kennzeichen
     * @return
     */
    public Fahrzeug setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        return this;
    }

    /**
     * setzt das Kennzeichen in Abhaengigkeit von einem Kennzeichen-Objekt
     * @param kennzeichen
     * @return
     */
    public Fahrzeug setKennzeichen(Kennzeichen kennzeichen) {
        return setKennzeichen(kennzeichen.toString());
    }

    /**
     * liefert die Vertrieblernummer
     * @return
     */
    public Integer getVertriebler() {
        return vertriebler;
    }

    /**
     * setzt den Vertriebler
     * @param vertriebler
     * @return
     */
    public Fahrzeug setVertriebler(int vertriebler) {
        this.vertriebler = vertriebler;
        return this;
    }
}
