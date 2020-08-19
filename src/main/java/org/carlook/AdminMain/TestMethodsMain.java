package org.carlook.AdminMain;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.dao.UserDAO;
import org.carlook.services.util.OtherMethods;

public class TestMethodsMain {

    public static void main (String[] args) {

        System.out.println(OtherMethods.getStringWithFirstUpperLetter("hello"));

    }
}
