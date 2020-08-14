package org.carlook.model.objects.entities;

public class Vertriebler extends User {
    int vertriebnummer;

    public int getVertriebnummer() {
        return vertriebnummer;
    }

    public Vertriebler setVertriebnummer(int vertriebnummer) {
        this.vertriebnummer = vertriebnummer;
        return this;
    }
}
