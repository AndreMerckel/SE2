package org.carlook;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.services.db.DBCreation;

public class AdminMain {

    public static void main (String[] args) {
        try {
            DBCreation.dropAllTables();
        } catch (DatabaseException e) {
            e.printStackTrace();
        }
    }
}
