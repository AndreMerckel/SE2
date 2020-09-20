package org.carlook.model.objects.entities;

/**
 * User-Objekt
 */
public class User {

    String email, vorname, nachname;

    /**
     * liefert die Email-Adresse
     */
    public String getEmail() {
        return email;
    }

    /**
     * setzt die Email-Adresse
     * @param email
     */
    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * liefert den Vornamen
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * setzt den Vornamen
     * @param vorname
     */
    public User setVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    /**
     * liefert den Nachnamen
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * setzt den Nachnamen
     * @param nachname
     */
    public User setNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }
}
