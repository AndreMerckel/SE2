package org.carlook.controller.exception;

/**
 *
 */
public class DatabaseException extends Exception {

    /**
     * Grund der Exception
     */
    private String reason = null;

    /**
     * Kontruktor
     * @param reason
     */
    public DatabaseException(String reason){
        this.reason = reason;
    }

    /**
     * gibt den Grund der Exception zurück
     * @return
     */
    public String getReason() {
        return reason;
    }

}
