package org.carlook.AdminMain;

import org.carlook.services.db.DBCreation;
import org.carlook.services.exampleData.ExampleData;

public class RefreshTablesMain {

    public static void main (String[] args) {

        DBCreation.refreshTables();
        ExampleData.initAllExamples();

    }

}
