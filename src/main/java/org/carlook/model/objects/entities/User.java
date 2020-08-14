package org.carlook.model.objects.entities;

public class User {

    String email, vorname, nachname;

    public String getEmail() {
        return email;
    }

    public User setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getVorname() {
        return vorname;
    }

    public User setVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    public String getNachname() {
        return nachname;
    }

    public User setNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }
}
