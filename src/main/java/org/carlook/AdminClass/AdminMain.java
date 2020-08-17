package org.carlook.AdminClass;

import org.carlook.services.db.DBCreation;
import org.carlook.services.exampleData.ExampleData;

public class AdminMain {

    public static void main (String[] args) {

        DBCreation.refreshTables();
        ExampleData.initAllExamples();





    }

}
