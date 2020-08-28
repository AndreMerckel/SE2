package org.carlook.factories;

import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kennzeichen;
import org.carlook.model.objects.entities.Kunde;

public class Factories {


    public static Fahrzeug createNewFahrzeug() {
        return new Fahrzeug();
    }

    public static Kunde createNewKunde() {
        return new Kunde();
    }

    public static Kennzeichen createNewKennzeichen() {
        return new Kennzeichen();
    }
}
