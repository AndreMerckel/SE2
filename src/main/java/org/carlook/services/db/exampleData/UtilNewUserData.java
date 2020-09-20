package org.carlook.services.db.exampleData;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 * Utilklassse zur Konvertierung einer txt Datei in Java-Format
 */
public class UtilNewUserData {

    /**
     * liefert einen String zur Java-Format
     * @param data
     * @param obj
     * @param attList
     * @return
     */
    public static String getFormat(String data, String obj, List<String> attList) {
        String res = "";
        int usrCounter = 0;
        Scanner sc = new Scanner(data);
        while (sc.hasNext()) {
            Iterator<String> it = attList.iterator();
            res += "\nlist.add(" + obj + "().set" + it.next() + "(";
            String tmpLine = sc.nextLine().trim();
            String tmpArg = "";
            for (int i = 0; i < (tmpLine.length()); ++i) {
                char tmpChar = tmpLine.charAt(i);
                tmpArg += tmpChar;
                if (i+1 == tmpLine.length() || tmpLine.charAt(i+1) == ',') {
                    try {
                        int number = Integer.parseInt(tmpArg);
                        res += tmpArg;
                    } catch (Exception e) {
                        res += "\"" + tmpArg + "\"";
                    } finally {
                        if (i+1 == tmpLine.length())
                            res += "));";
                        else
                            res += ").set" + it.next() + "(";
                        tmpArg = "";
                        i++;
                    }
                }
            }
        }
        return res;
    }

    /**
     * gibt eine Ausgabe von Fahrzeugobjekte in Java-Form aus
     */
    public static void printFahrzeugData() {
        List<String> list = new ArrayList<>();
        list.add("Hersteller");
        list.add("Beschreibung");
        list.add("Kraftstoff");
        list.add("Baujahr");
        list.add("Modell");
        list.add("Fahrgestellnummer");
        list.add("Vertriebler");
        list.add("Location");


        String s = "";
        try {
            File file = new File("src/ExampleData/dbs_tab_fahrzeug.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                s += sc.nextLine() + "\n";
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(getFormat(s,"Factories.createNewFahrzeug", list));

    }


    /**
     * gibt eine Ausgabe von Userdaten in Java-Form aus
     */
    public static void printUserData() {
        List<String> list = new ArrayList<>();
        list.add("Vorname");
        list.add("Nachname");
        list.add("Email");
        list.add("Password");

        String s = "";
        try {
            File file = new File("src/ExampleData/dbs_tab_user.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                s += sc.nextLine() + "\n";
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(getFormat(s,"DTOFactory.createNewUserDTO",list));
    }

    /**
     * fuehrt alle print Methoden aus
     */
    public static void printData() {
        printUserData();
        printFahrzeugData();
    }

}
