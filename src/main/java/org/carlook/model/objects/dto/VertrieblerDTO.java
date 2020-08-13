package org.carlook.model.objects.dto;

public class VertrieblerDTO extends UserDTO {

    int vertriebnummer;

    public int getVertriebnummer() {
        return vertriebnummer;
    }

    public VertrieblerDTO setVertriebnummer(int vertriebnummer) {
        this.vertriebnummer = vertriebnummer;
        return this;
    }
}
