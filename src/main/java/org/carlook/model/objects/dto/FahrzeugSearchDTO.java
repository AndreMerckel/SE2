package org.carlook.model.objects.dto;

public class FahrzeugSearchDTO {
    String marke, modell, kraftstoff, location;
    VertrieblerDTO vertrieblerDTO;
    int baujahr;

    public FahrzeugSearchDTO setMarke(String marks) {
        this.marke = marke;
        return this;
    }

    public FahrzeugSearchDTO setKraftstoff(String kraftstoff) {
        this.kraftstoff = kraftstoff;
        return this;
    }

    public FahrzeugSearchDTO setLocation(String location) {
        this.location = location;
        return this;
    }

    public FahrzeugSearchDTO setBaujahr(int baujahr) {
        this.baujahr = baujahr;
        return this;
    }

    public String getMarke() {
        return marke;
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


    public FahrzeugSearchDTO setModell(String modell) {
        this.modell = modell;
        return this;
    }

    public VertrieblerDTO getVertrieblerDTO() {
        return vertrieblerDTO;
    }

    public FahrzeugSearchDTO setVertrieblerDTO(VertrieblerDTO vertrieblerDTO) {
        this.vertrieblerDTO = vertrieblerDTO;
        return this;
    }
}
