package org.carlook.services.util;

public class DBTables {

    public static final String SCHEMA = Parameter.COMPANY_NAME.toLowerCase().trim();

    private static final String connector = ".";
    public static final String PRAEFIX_TAB = "dbs_tab_";

    public static final String CREATE_ALL_TABLES =
            User.CREATE_TAB + "\n" +
            Kunde.CREATE_TAB + "\n" +
            Vertriebler.CREATE_TAB + "\n" +
            Fahrzeug.CREATE_TAB + "\n" +
            KundeReserviertFahrzeug.CREATE_TAB;

    public static class User {

        public static final String NAME = "user";

        public static final String COL_EMAIL = "email";
        public static final String COL_PASSWORD = "password";
        public static final String COL_VORNAME = "vorname";
        public static final String COL_NACHNAME = "nachname";

        public static final String TAB = getTAB(NAME);

        public static final String CREATE_TAB = "CREATE TABLE " + TAB + " (\n" +
                COL_EMAIL + " VARCHAR(255) UNIQUE NOT NULL,\n" +
                COL_PASSWORD + " VARCHAR(255) NOT NULL,\n" +
                COL_VORNAME + " VARCHAR(255) NOT NULL,\n" +
                COL_NACHNAME + " VARCHAR(255) NOT NULL,\n" +
                "CONSTRAINT pk_" + NAME + " PRIMARY KEY (" + COL_EMAIL + ")\n" +
                ");\n\n";

    }

    public static class Kunde {

        public static final String NAME = "kunde";

        public static final String COL_KUNDENNUMMER = "kundennummer";

        public static final String TAB = getTAB(NAME);

        public static final String CREATE_TAB = "CREATE TABLE " + TAB + " (\n" +
                COL_KUNDENNUMMER + " SERIAL UNIQUE NOT NULL,\n" +
                User.COL_EMAIL + " VARCHAR(255) UNIQUE NOT NULL,\n" +
                "CONSTRAINT pk_" + NAME + " PRIMARY KEY (" + COL_KUNDENNUMMER + "),\n" +
                "CONSTRAINT fk_" + User.NAME + " FOREIGN KEY(" + User.COL_EMAIL + ") REFERENCES " + User.TAB + " (" + User.COL_EMAIL + ")\n" +
                ");\n\n";

    }

    public static class Vertriebler {

        public static final String NAME = "vertriebler";

        public static final String COL_VERTRIEBLERNUMMER = "Vertrieblernr";

        public static final String TAB = getTAB(NAME);

        public static final String CREATE_TAB = "CREATE TABLE " + TAB + " (\n" +
                COL_VERTRIEBLERNUMMER + " SERIAL UNIQUE NOT NULL,\n" +
                User.COL_EMAIL + " VARCHAR(255) UNIQUE NOT NULL,\n" +
                "CONSTRAINT pk_" + NAME + " PRIMARY KEY (" + COL_VERTRIEBLERNUMMER + "),\n" +
                "CONSTRAINT fk_" + User.NAME +" FOREIGN KEY(" + User.COL_EMAIL + ") REFERENCES " + User.TAB +" (" + User.COL_EMAIL + ")\n" +
                ");\n\n";
    }

    public static class Fahrzeug {

        public static final String NAME = "fahrzeug";

        public static final String COL_HERSTELLER = "hersteller";
        public static final String COL_BESCHREIBUNG = "beschreibung";
        public static final String COL_KRAFTSTOFF = "kraftstoff";
        public static final String COL_BAUJAHR = "baujahr";
        public static final String COL_MODELL = "modell";
        public static final String COL_FAHRGESTELLNUMMER = "fahrgestellnummer";
        public static final String COL_KENNZEICHEN = "kennzeichen";
        public static final String COL_VERTRIEBLER = Vertriebler.COL_VERTRIEBLERNUMMER;
        public static final String COL_LOCATION = "location";

        public static final String TAB = getTAB(NAME);

        public static final String CREATE_TAB = "CREATE TABLE " + TAB + " (\n" +
                COL_HERSTELLER + " VARCHAR(255) NOT NULL,\n" +
                COL_BESCHREIBUNG + " VARCHAR(255) NOT NULL,\n" +
                COL_KRAFTSTOFF + " VARCHAR(255) NOT NULL,\n" +
                COL_BAUJAHR + " NUMERIC(4) NOT NULL,\n" +
                COL_MODELL + " VARCHAR(255) NOT NULL," +
                COL_FAHRGESTELLNUMMER + " VARCHAR(255) NOT NULL,\n" +
                COL_KENNZEICHEN + " VARCHAR(255) NOT NULL UNIQUE," +
                COL_VERTRIEBLER + " INTEGER NOT NULL,\n" +
                COL_LOCATION + " VARCHAR(255) NOT NULL,\n" +
                "CONSTRAINT pk_" + NAME + " PRIMARY KEY (" + COL_KENNZEICHEN +"),\n" +
                "CONSTRAINT fk_" + Vertriebler.NAME + " FOREIGN KEY (" + COL_VERTRIEBLER + ") REFERENCES " + Vertriebler.TAB + " (" + Vertriebler.COL_VERTRIEBLERNUMMER + ")\n" +
                ");\n\n";
    }

    public static class KundeReserviertFahrzeug {

        public static final String NAME = Kunde.NAME + "_reserviert_" + Fahrzeug.NAME;

        public static final String TAB = getTAB(NAME);

        public static final String CREATE_TAB  = "CREATE TABLE " + TAB + " (\n" +
                Kunde.COL_KUNDENNUMMER + " INTEGER NOT NULL,\n" +
                Fahrzeug.COL_KENNZEICHEN + " VARCHAR(255) NOT NULL,\n" +
                " CONSTRAINT pk_" + NAME + " PRIMARY KEY (" + Kunde.COL_KUNDENNUMMER + ",\n" + Fahrzeug.COL_KENNZEICHEN + "),\n" +
                " CONSTRAINT fk_" + Fahrzeug.NAME + " FOREIGN KEY (" + Fahrzeug.COL_KENNZEICHEN + ") REFERENCES " + Fahrzeug.TAB + " (" + Fahrzeug.COL_KENNZEICHEN + "),\n" +
                " CONSTRAINT fk_" + Kunde.NAME + " FOREIGN KEY (" + Kunde.COL_KUNDENNUMMER + ") REFERENCES " + Kunde.TAB + " (" + Kunde.COL_KUNDENNUMMER + ")\n" +
                ");\n\n";
    }

    private static String getTAB(String name) {
        return SCHEMA + connector + PRAEFIX_TAB + name;
    }

}
