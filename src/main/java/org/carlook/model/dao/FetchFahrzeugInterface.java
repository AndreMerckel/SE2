package org.carlook.model.dao;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Vertriebler;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.util.DBTables;

import java.awt.image.DataBufferShort;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public interface FetchFahrzeugInterface {

    default List<Fahrzeug> fetchFahrzeuge(ResultSet resultSet) throws DatabaseException, SQLException {
        List<Fahrzeug> fahrzeugList = new ArrayList<>();
        System.out.println(resultSet.getString("Hersteller"));
        try {
            while (resultSet.next()) {
                Fahrzeug fahrzeug = new Fahrzeug()
                        .setHersteller(resultSet.getString(DBTables.Fahrzeug.COL_HERSTELLER))
                        .setModell(resultSet.getString(DBTables.Fahrzeug.COL_MODELL))
                        .setBeschreibung(resultSet.getString(DBTables.Fahrzeug.COL_BESCHREIBUNG))
                        .setKraftstoff(resultSet.getString(DBTables.Fahrzeug.COL_KRAFTSTOFF))
                        .setLocation(resultSet.getString(DBTables.Fahrzeug.COL_LOCATION))
                        .setFahrgestellnummer(resultSet.getString(DBTables.Fahrzeug.COL_FAHRGESTELLNUMMER))
                        .setKennzeichen(resultSet.getString(DBTables.Fahrzeug.COL_KENNZEICHEN))
                        .setBaujahr(resultSet.getInt(DBTables.Fahrzeug.COL_BAUJAHR));

                fahrzeugList.add(fahrzeug);
            }

        } catch (SQLException e) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                    resultSet.close(); } catch (Exception exc) {
                Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        }
        return fahrzeugList;
    }
}
