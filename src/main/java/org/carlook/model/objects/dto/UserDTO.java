package org.carlook.model.objects.dto;

public class UserDTO {

    String email, vorname, nachname, passsword;

    public String getEmail() {
        return email;
    }

    public UserDTO setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getVorname() {
        return vorname;
    }

    public UserDTO setVorname(String vorname) {
        this.vorname = vorname;
        return this;
    }

    public String getNachname() {
        return nachname;
    }

    public UserDTO setNachname(String nachname) {
        this.nachname = nachname;
        return this;
    }

    public String getPassword() {
        return passsword;
    }

    public UserDTO setPassword(String passsword) {
        this.passsword = passsword;
        return this;
    }
}
