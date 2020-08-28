package org.carlook.AdminMain;

import org.carlook.controller.FahrzeugControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.factories.Factories;
import org.carlook.model.dao.FahrzeugDAO;
import org.carlook.model.dao.UserDAO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kennzeichen;
import org.carlook.services.util.OtherMethods;

import java.util.Random;

public class TestMethodsMain {

    public static void main(String[] args) {
        Kennzeichen kennzeichen = Factories.createNewKennzeichen().setKennzeichen(117);
        System.out.println(FahrzeugControl.getRandomKennzeichen());
    }
}