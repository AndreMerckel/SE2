package org.carlook.services.util;

public class DBTables {

    public static final String TAB_USER = "dbs_user";
    public static final String TAB_KUNDE = "dbs_user";
    public static final String TAB_VERTRIEBLER = "dbs_vertriebler";
    public static final String TAB_FAHRZEUG = "dbs_fahrzeug";
    public static final String TAB_KUNDE_RESERVIERRT_FAHRZEUG = "dbs_kunde_reserviert_fahrzeug";

    public static final String CREATE_TAB_USER = "CREATE TABLE " + TAB_USER + " (\n" +
            "    email VARCHAR(255) UNIQUE NOT NULL,\n" +
            "    password VARCHAR(255) NOT NULL,\n" +
            "    vorname VARCHAR(255) NOT NULL,\n" +
            "    nachname VARCHAR(255) NOT NULL,\n" +
            "    CONSTRAINT PK_USER PRIMARY KEY (email)\n" +
            ");";

    public static final String CREATE_TAB_VERTRIEBLER = "CREATE TABLE " + TAB_VERTRIEBLER + " ("\n" +
            "    vertriebnummer SERIAL UNIQUE NOT NULL,\n" +
            "    email VARCHAR(255) UNIQUE NOT NULL,\n" +
            "    CONSTRAINT PK_VERTRIBELER PRIMARY KEY (vertriebnummer),\n" +
            "    CONSTRAINT FK_USER FOREIGN KEY(email) REFERENCES dbs_USER(email)\n" +
            ");";

    public static final String CREATE_TAB_KUNDE = "CREATE TABLE " + TAB_KUNDE + " (\n" +
            "    kundennummer SERIAL UNIQUE NOT NULL,\n" +
            "        email VARCHAR(255) UNIQUE NOT NULL,\n" +
            "    CONSTRAINT PK_KUNDE PRIMARY KEY (kundennummer),\n" +
            "    CONSTRAINT FK_USER FOREIGN KEY(email) REFERENCES dbs_USER(email)\n" +
            ");";
            );

    public static final String CREATE_TAB_FAHRZEUG = "CREATE TABLE " + TAB_FAHRZEUG + "(\n" +
            "    marke VARCHAR(255) NOT NULL,\n" +
            "    beschreibung VARCHAR(255) NOT NULL,\n" +
            "    kraftstoff VARCHAR(255) NOT NULL,\n" +
            "    baujahr NUMERIC(4) NOT NULL,\n" +
            "    modell VARCHAR(255) NOT NULL,\n" +
            "    fahrgestellnummer VARCHAR(255) NOT NULL,\n" +
            "    kennzeichen VARCHAR(255) NOT NULL UNIQUE,\n" +
            "    vertriebler VARCHAR(255) NOT NULL UNIQUE,\n" +
            "    location VARCHAR(255) NOT NULL UNIQUE,\n" +
            "    CONSTRAINT PK_FAHRZEUG PRIMARY KEY (kennzeichen),\n" +
            "    CONSTRAINT FK_VERTRIBELER FOREIGN KEY (vertriebler) REFERENCES dbs_VERTRIEBLER(vertriebnummer)\n" +
            ");";

    public static final String CREATE_TAB_KUNDE_RESERVIERRT_FAHRZEUG = "CREATE TABLE " + TAB_KUNDE_RESERVIERRT_FAHRZEUG + " (\n" +
            "    kundennummer VARCHAR(255) UNIQUE NOT NULL,\n" +
            "    kennzeichen VARCHAR(255) UNIQUE NOT NULL,\n" +
            "    CONSTRAINT PK_KUNDE_RESERVIERT_FAHRZEUG PRIMARY KEY (kundennummer,kennzeichen),\n" +
            "    CONSTRAINT FK_FAHRZEUG FOREIGN KEY (kennzeichen) REFERENCES dbs_FAHRZEUG(kennzeichen),\n" +
            "    CONSTRAINT FK_KUNDE FOREIGN KEY (kundennummer) REFERENCES dbs_KUNDE(kundennummer)\n" +
            ");";

}
