package org.carlook.model.objects.entities;

/**
 * User-Objekt
 */
public class User {

    String email, vorname, nachname;

    /**
     * liefert die Email-Adresse
     * @return
     */
    public String getEmail() {
        return email;
    }

    /**
     * setzt die Email-Adresse
     * @param email
     * @return
     */
    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * liefert den Vornamen
     * @return
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * setzt den Vornamen
     * @param vorname
     * @return
     */
    public User setVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    /**
     * liefert den Nachnamen
     * @return
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * setzt den Nachnamen
     * @param nachname
     * @return
     */
    public User setNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }
}
