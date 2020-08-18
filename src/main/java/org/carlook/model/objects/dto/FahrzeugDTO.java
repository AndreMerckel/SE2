package org.carlook.model.objects.dto;

/**
 * DTO-Klasse als Transfer von Erstellung zu DB
 */
public class FahrzeugDTO {

    String hersteller, modell, beschreibung, kraftstoff, location, fahrgestellnummer, kennzeichen;
    int vertriebler, baujahr;

    public FahrzeugDTO setHersteller(String marks) {
        this.hersteller = hersteller;
        return this;
    }

    public FahrzeugDTO setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
        return this;
    }

    public FahrzeugDTO setKraftstoff(String kraftstoff) {
        this.kraftstoff = kraftstoff;
        return this;
    }

    public FahrzeugDTO setLocation(String location) {
        this.location = location;
        return this;
    }

    public FahrzeugDTO setBaujahr(int baujahr) {
        this.baujahr = baujahr;
        return this;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public String getModell() {
        return modell;
    }

    public String getKraftstoff() {
        return kraftstoff;
    }

    public String getLocation() {
        return location;
    }

    public int getBaujahr() {
        return baujahr;
    }


    public FahrzeugDTO setModell(String modell) {
        this.modell = modell;
        return this;
    }

    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public FahrzeugDTO setFahrgestellnummer(String fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
        return this;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public FahrzeugDTO setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        return this;
    }

    public int getVertriebler() {
        return vertriebler;
    }

    public FahrzeugDTO setVertriebler(int vertriebler) {
        this.vertriebler = vertriebler;
        return this;
    }
}
