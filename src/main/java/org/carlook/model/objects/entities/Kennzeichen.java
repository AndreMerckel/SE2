package org.carlook.model.objects.entities;

import org.carlook.services.util.DBTables;
import org.carlook.services.util.OtherMethods;
import org.carlook.services.util.Parameter;

public class Kennzeichen {

    public String kennzeichen;

    public String getKennzeichen() {
        return kennzeichen;
    }

    public Kennzeichen setKennzeichen(String kennzeichen) {
        String praefix = Parameter.KENNZEICHEN;
        if (!praefix.equals(kennzeichen.substring(0,praefix.length()))) {
            System.out.println(kennzeichen.substring(0,praefix.length()));
            throw new IllegalArgumentException("Falsches Format!");
        }
        this.kennzeichen = kennzeichen;
        return this;
    }

    public Kennzeichen setKennzeichen(int kennzeichen) {
        if (kennzeichen > 9999 || kennzeichen < 1) {
            String reason = OtherMethods.getStringWithFirstUpperLetter(DBTables.Fahrzeug.COL_KENNZEICHEN);
            if (kennzeichen > 9999) {
                reason += " groeßer als 9999!";
            } else {
                reason += " kleiner als 1!";
            }
            throw new IllegalArgumentException(reason);
        }

        int nullCounter = 0;
        String res = "";
        if (kennzeichen < 1000)
            nullCounter ++;
        if (kennzeichen < 100)
            nullCounter ++;
        if (kennzeichen < 10)
            nullCounter ++;

        for (int i = 0; i < nullCounter; i++) {
            res += 0;
        }

        this.kennzeichen = Parameter.KENNZEICHEN + res + kennzeichen;
        return this;
    }

    public String toString() {
        return kennzeichen;
    }
}