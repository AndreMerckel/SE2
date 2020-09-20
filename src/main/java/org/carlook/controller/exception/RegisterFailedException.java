package org.carlook.controller.exception;

public class RegisterFailedException extends Exception {

    /**
     * Grund der Exception
     */
    private String reason;

    /**
     * Konstruktor
     * @param reason
     */
    public RegisterFailedException setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
