package org.carlook.AdminMain;

import org.carlook.controller.UserControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.dao.UserDAO;
import org.carlook.model.objects.dto.UserDTO;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 150; ++i) {
            UserControl.getRndUser();
        }



    }
}
