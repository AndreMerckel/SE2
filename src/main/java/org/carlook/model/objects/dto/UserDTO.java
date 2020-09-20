package org.carlook.model.objects.dto;

/**
 * User-DTO
 */
public class UserDTO {

    String email, vorname, nachname, passsword;

    /**
     * liefert die Email des Users
     */
    public String getEmail() {
        return email;
    }

    /**
     * setzt die Email-Adresse des Users
     * @param email
     */
    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * liefert den Vornamen des Users
     */
    public String getVorname() {
        return vorname;
    }

    /**
     * setzt den Vornamen des Users
     * @param vorname
     */
    public UserDTO setVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    /**
     * liefert den Nachnamen des Users
     */
    public String getNachname() {
        return nachname;
    }

    /**
     * setzt den Nachnamen des Users
     * @param nachname
     */
    public UserDTO setNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    /**
     * liefert das Passwort des Users
     */
    public String getPassword() {
        return passsword;
    }

    /**
     * setzt das Passwort des Users
     * @param passsword
     */
    public UserDTO setPassword(String passsword) {
        this.passsword = passsword;
        return this;
    }
}
