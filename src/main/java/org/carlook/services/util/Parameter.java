package org.carlook.services.util;

public class Parameter {

    public static final String COMPANY_NAME = "CarLook";
    public static final String COMPANY_LEGAL_FORM = "Ltd.";
    public static final String COMPANY= COMPANY_NAME + " " + COMPANY_LEGAL_FORM;
    public static final String PROJECT_NAME = "SE2 - Hausarbeit " + COMPANY_NAME + " " + COMPANY_LEGAL_FORM;
    public static final String COMPANY_MAIL_DOMAIN = "de";
    public static final String COMPANY_MAIL_ADDRESS = ("@" + COMPANY_NAME.toLowerCase() + "." + COMPANY_MAIL_DOMAIN).trim();
}
