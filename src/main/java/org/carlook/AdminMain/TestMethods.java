package org.carlook.AdminMain;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.dao.UserDAO;

public class TestMethods {

    public static void main (String[] args) {

        try {
            System.out.println(UserDAO.getInstance().getVertrieblerbyID(2));
        } catch (DatabaseException e) {
            e.printStackTrace();
        }

    }
}
