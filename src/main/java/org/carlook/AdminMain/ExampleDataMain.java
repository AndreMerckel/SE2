package org.carlook.AdminMain;

import org.carlook.controller.UserControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.dao.LogDAO;
import org.carlook.services.db.exampleData.UtilNewUserData;

public class ExampleDataMain {

    public static void main(String[] args) {
        UtilNewUserData.printData();
    }
}
