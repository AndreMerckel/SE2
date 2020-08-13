package org.carlook.services.util;

import java.util.Scanner;

public class DBTables {

    public static final String SCHEMA = "carlook";

    private static final String connector = ".";
    public static final String PRAEFIX_TAB = "dbs_tab_";

    public static final String TAB_USER = SCHEMA + connector + PRAEFIX_TAB + "user";
    public static final String TAB_KUNDE = SCHEMA + connector + PRAEFIX_TAB + "kunde";
    public static final String TAB_VERTRIEBLER = SCHEMA + connector + PRAEFIX_TAB + "vertriebler";
    public static final String TAB_FAHRZEUG = SCHEMA + connector + PRAEFIX_TAB + "fahrzeug";
    public static final String TAB_KUNDE_RESERVIERRT_FAHRZEUG = SCHEMA + connector + PRAEFIX_TAB + "kunde_reserviert_fahrzeug";

    public static final String CREATE_TAB_USER = "CREATE TABLE " + TAB_USER + " (\n" +
            "    email VARCHAR(255) UNIQUE NOT NULL,\n" +
            "    password VARCHAR(255) NOT NULL,\n" +
            "    vorname VARCHAR(255) NOT NULL,\n" +
            "    nachname VARCHAR(255) NOT NULL,\n" +
            "    CONSTRAINT pk_user PRIMARY KEY (email)\n" +
            ");\n";

    public static final String CREATE_TAB_VERTRIEBLER = "CREATE TABLE " + TAB_VERTRIEBLER + " (\n" +
            "    vertriebnummer SERIAL UNIQUE NOT NULL,\n" +
            "    email VARCHAR(255) UNIQUE NOT NULL,\n" +
            "    CONSTRAINT pk_vertriebler PRIMARY KEY (vertriebnummer),\n" +
            "    CONSTRAINT fk_user FOREIGN KEY(email) REFERENCES " + TAB_USER +" (email)\n" +
            ");\n";

    public static final String CREATE_TAB_KUNDE = "CREATE TABLE " + TAB_KUNDE + " (\n" +
            "    kundennummer SERIAL UNIQUE NOT NULL,\n" +
            "    email VARCHAR(255) UNIQUE NOT NULL,\n" +
            "    CONSTRAINT PK_KUNDE PRIMARY KEY (kundennummer),\n" +
            "    CONSTRAINT FK_USER FOREIGN KEY(email) REFERENCES " + TAB_USER + " (email)\n" +
            ");\n";

    public static final String CREATE_TAB_FAHRZEUG = "CREATE TABLE " + TAB_FAHRZEUG + " (\n" +
            "    marke VARCHAR(255) NOT NULL,\n" +
            "    beschreibung VARCHAR(255) NOT NULL,\n" +
            "    kraftstoff VARCHAR(255) NOT NULL,\n" +
            "    baujahr NUMERIC(4) NOT NULL,\n" +
            "    modell VARCHAR(255) NOT NULL,\n" +
            "    fahrgestellnummer VARCHAR(255) NOT NULL,\n" +
            "    kennzeichen VARCHAR(255) NOT NULL UNIQUE,\n" +
            "    vertriebler INTEGER NOT NULL UNIQUE,\n" +
            "    location VARCHAR(255) NOT NULL,\n" +
            "    CONSTRAINT pk_fahrzeug PRIMARY KEY (kennzeichen),\n" +
            "    CONSTRAINT fk_vertriebler FOREIGN KEY (vertriebler) REFERENCES " + TAB_VERTRIEBLER + " (vertriebnummer)\n" +
            ");\n";

    public static final String CREATE_TAB_KUNDE_RESERVIERRT_FAHRZEUG = "CREATE TABLE " + TAB_KUNDE_RESERVIERRT_FAHRZEUG + " (\n" +
            "    kundennummer INTEGER UNIQUE NOT NULL,\n" +
            "    kennzeichen VARCHAR(255) UNIQUE NOT NULL,\n" +
            "    CONSTRAINT PK_KUNDE_RESERVIERT_FAHRZEUG PRIMARY KEY (kundennummer,kennzeichen),\n" +
            "    CONSTRAINT FK_FAHRZEUG FOREIGN KEY (kennzeichen) REFERENCES " + TAB_FAHRZEUG + " (kennzeichen),\n" +
            "    CONSTRAINT FK_KUNDE FOREIGN KEY (kundennummer) REFERENCES " + TAB_KUNDE + " (kundennummer)\n" +
            ");\n";

}
