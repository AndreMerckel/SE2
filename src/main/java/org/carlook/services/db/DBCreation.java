package org.carlook.services.db;

import org.carlook.services.util.DBTables;

import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import static org.carlook.services.util.*;

public class DBCreation {

    private static List<String> tableCreation = new ArrayList<>();

    private static void loadTablesToList() {
        tableCreation.add(DBTables.CREATE_TAB_USER);
        tableCreation.add(DBTables.CREATE_TAB_KUNDE);
        tableCreation.add(DBTables.CREATE_TAB_VERTRIEBLER);
        tableCreation.add(DBTables.CREATE_TAB_FAHRZEUG);
        tableCreation.add(DBTables.CREATE_TAB_KUNDE_RESERVIERRT_FAHRZEUG);
    }

    private static void execute() {
         JDBCConnection.getInstance().openConnection();
         String sqlBefehl = "";
         PreparedStatement statement = getPre
         for (String tmp : tableCreation) {
             sqlBefehl +=
         }
    }
}
