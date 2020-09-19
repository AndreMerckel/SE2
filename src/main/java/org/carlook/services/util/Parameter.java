package org.carlook.services.util;

public class Parameter {

    public static final String COPY_RIGHT = "- " + Parameter.COMPANY + ", coded by: André Merckel, Martin Müller -";

    public static final String COMPANY_NAME = "CarLook";
    public static final String COMPANY_LEGAL_FORM = "Ltd.";
    public static final String PROJECT_NAME = "SE2_Hausarbeit";
    public static final String COMPANY_MAIL_DOMAIN = "de";

    public static final String KENNZEICHEN_ORT = "SU";
    public static final String KENNZEICHEN_KUERZEL = "CL";

    public static final String COMPANY_MAIL_ADDRESS = ("@" + COMPANY_NAME.toLowerCase() + "." + COMPANY_MAIL_DOMAIN).trim();
    public static final String COMPANY = COMPANY_NAME + " " + COMPANY_LEGAL_FORM;
    public static final String KENNZEICHEN = (KENNZEICHEN_ORT + "-" + KENNZEICHEN_KUERZEL + "-").toUpperCase().trim();
}
