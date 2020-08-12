package org.carlook.model.dto;

public class FahrzeugDTO {
    String marke, modell, beschreibung, kraftstoff, location;
    int baujahr;

    public FahrzeugDTO setMarke(String marks) {
        this.marke = marke;
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


}
