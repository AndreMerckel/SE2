package org.carlook.model.objects.dto;

import org.carlook.model.objects.entities.Vertriebler;

public class FahrzeugSearchDTO {
    String marke, modell, kraftstoff, location;
    Vertriebler vertriebler;
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

    public Vertriebler getVertriebler() {
        return vertriebler;
    }

    public FahrzeugSearchDTO setVertriebler(Vertriebler vertriebler) {
        this.vertriebler = vertriebler;
        return this;
    }
}
