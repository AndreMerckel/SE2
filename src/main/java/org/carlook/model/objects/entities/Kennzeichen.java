package org.carlook.model.objects.entities;

import org.carlook.services.util.Parameter;

public class Kennzeichen {

    public int getKennzeichen() {
        return kennzeichen;
    }

    public Kennzeichen setKennzeichen(int kennzeichen) {
        this.kennzeichen = kennzeichen;
        return this;
    }

    public int kennzeichen;

    public Kennzeichen() {

    }

    public String toString() {
        return Parameter.KENNZEICHEN + kennzeichen;
    }
}
