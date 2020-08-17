package org.carlook.controller.exception;

public class RegisterFailedException extends Exception {

    private String reason;

    public String getReason() {
        return reason;
    }

    public RegisterFailedException setReason(String reason) {
        this.reason = reason;
        return this;
    }
}
