package org.carlook.controller.exception;

public class NoSuchUserOrPassword extends Exception {

    /**
     * Grund der Exception
     */
    private String reason = null;

    /**
     * Konstruktor
     * @param reason
     */
    public NoSuchUserOrPassword(String reason){
        this.reason = reason;
    }
}
