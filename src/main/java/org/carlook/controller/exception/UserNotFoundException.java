package org.carlook.controller.exception;

public class UserNotFoundException extends NoSuchUserOrPassword {

    public UserNotFoundException(String reason) {
        super(reason);
    }
}
