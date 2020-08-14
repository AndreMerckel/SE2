package org.carlook.services.exampleData;

import org.carlook.controller.FahrzeugControl;
import org.carlook.controller.Register;
import org.carlook.controller.UserControl;
import org.carlook.controller.exception.DatabaseException;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ExampleData {


    public static void insertAllExamples() {

        insert(UserControl.getInstance(),ListSupplier.UserData.getList());
        insert(FahrzeugControl.getInstance(),ListSupplier.FahrzeugData.getList());





    }

    public static <T> void insert(Register register, List<T> list) {
        for (T tmp : list) {
            try {
                register.register(tmp);
            } catch (DatabaseException e) {

                Logger.getLogger(ExampleData.class.getName()).log(Level.SEVERE, null, e);
                return;
            }
        }

        Logger.getLogger(ExampleData.class.getName()).log(Level.SEVERE, list.get(0).getClass()  + " erfolgreich hinzugefuegt!\n");
    }

}
