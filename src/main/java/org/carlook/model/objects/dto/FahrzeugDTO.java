package org.carlook.model.objects.dto;

import org.carlook.model.dao.FahrzeugDAO;

public class FahrzeugDTO {
    String marke, modell, beschreibung, kraftstoff, location, fahrgestellnummer, kennzeichen;
    VertrieblerDTO vertrieblerDTO;
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

    public VertrieblerDTO getVertrieblerDTO() {
        return vertrieblerDTO;
    }

    public FahrzeugDTO setVertrieblerDTO(VertrieblerDTO vertrieblerDTO) {
        this.vertrieblerDTO = vertrieblerDTO;
        return this;
    }
}
