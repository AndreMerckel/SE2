package org.carlook.services.util;

public class OtherMethods {

    public static String getStringWithFirstUpperLetter(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}
