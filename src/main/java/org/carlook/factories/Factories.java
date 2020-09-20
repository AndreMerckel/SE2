package org.carlook.factories;

import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kennzeichen;
import org.carlook.model.objects.entities.Kunde;
import org.carlook.model.objects.entities.Vertriebler;

/**
 * generelle Factory
 */
public class Factories {

    /**
     * erstellt ein neues Fahrzeug-Objekt
     */
    public static Fahrzeug createNewFahrzeug() {
        return new Fahrzeug();
    }

    /**
     * erstellt ein neues Kunden-Objekt
     */
    public static Kunde createNewKunde() {
        return new Kunde();
    }

    /**
     * erstellt ein neues Kennzeichen-Objekt
     */
    public static Kennzeichen createNewKennzeichen() {
        return new Kennzeichen();
    }

    /**
     * erstellt ein
     */
    public static Vertriebler createNewVertriebler() {
        return new Vertriebler();
    }
}
