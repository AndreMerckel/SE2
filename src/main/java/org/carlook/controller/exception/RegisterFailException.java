package org.carlook.controller.exception;

public class RegisterFailException extends Exception {
    private String reason;

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public RegisterFailException(String reason) {
        this.reason = reason;
    }
}
