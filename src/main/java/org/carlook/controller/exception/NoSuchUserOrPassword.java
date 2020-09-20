package org.carlook.controller.exception;

public class NoSuchUserOrPassword extends Exception {

    /**
     * Grund der Exception
     */
    private String reason = null;

    /**
     * gibt den Grund der Exception aus
     * @return
     */

    /**
     * Konstruktor
     * @param reason
     */
    public NoSuchUserOrPassword(String reason){
        this.reason = reason;
    }
}
