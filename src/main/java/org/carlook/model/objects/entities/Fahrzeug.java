package org.carlook.model.objects.entities;

public class Fahrzeug {
    String marke, modell, beschreibung, kraftstoff, location, fahrgestellnummer, kennzeichen;
    int vertriebler, baujahr;

    public Fahrzeug setMarke(String marks) {
        this.marke = marke;
        return this;
    }

    public Fahrzeug setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
        return this;
    }

    public Fahrzeug setKraftstoff(String kraftstoff) {
        this.kraftstoff = kraftstoff;
        return this;
    }

    public Fahrzeug setLocation(String location) {
        this.location = location;
        return this;
    }

    public Fahrzeug setBaujahr(int baujahr) {
        this.baujahr = baujahr;
        return this;
    }

    public String getMarke() {
        return marke;
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


    public Fahrzeug setModell(String modell) {
        this.modell = modell;
        return this;
    }

    public String getFahrgestellnummer() {
        return fahrgestellnummer;
    }

    public Fahrzeug setFahrgestellnummer(String fahrgestellnummer) {
        this.fahrgestellnummer = fahrgestellnummer;
        return this;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public Fahrzeug setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        return this;
    }

    public int getVertriebler() {
        return vertriebler;
    }

    public Fahrzeug setVertriebler(int vertriebler) {
        this.vertriebler = vertriebler;
        return this;
    }
}
