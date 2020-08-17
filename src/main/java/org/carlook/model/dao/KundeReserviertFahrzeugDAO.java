package org.carlook.model.dao;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.model.objects.dto.FahrzeugDTO;
import org.carlook.model.objects.dto.KundeDTO;
import org.carlook.model.objects.dto.ReservationDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.util.DBTables;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class KundeReserviertFahrzeugDAO extends AbstractDAO implements FetchFahrzeugInterface {

    private static KundeReserviertFahrzeugDAO kundeReserviertFahrzeugDAO;
    private String table = DBTables.KundeReserviertFahrzeug.TAB;

    private KundeReserviertFahrzeugDAO() {}

    public static synchronized KundeReserviertFahrzeugDAO getInstance() {

        if (kundeReserviertFahrzeugDAO == null) kundeReserviertFahrzeugDAO = new KundeReserviertFahrzeugDAO();
        return kundeReserviertFahrzeugDAO;
    }

    public void register(ReservationDTO reservationDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String sqlBefehl;

        sqlBefehl = "INSERT INTO " + table + " (" + DBTables.Fahrzeug.COL_KENNZEICHEN +"," + DBTables.Kunde.COL_KUNDENNUMMER + ") VALUES (?,?)";
        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        try {
            preparedStatement.setString(1, reservationDTO.getFahrzeugDTO().getKennzeichen());
            preparedStatement.setInt(2, reservationDTO.getKundeDTO().getKundennummer());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            Logger.getLogger(KundeReserviertFahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }

    public List<Fahrzeug> getFahrzeugByKunde(KundeDTO kundeDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        List<Fahrzeug> fahrzeugeList = new ArrayList<>();

        String sqlBefehl = "Select * FROM " + table + ", " + DBTables.Fahrzeug.TAB + " WHERE " + table + "." + DBTables.Fahrzeug.COL_KENNZEICHEN + " = " + DBTables.Fahrzeug.COL_KENNZEICHEN + " AND " + table + "." + DBTables.Kunde.COL_KUNDENNUMMER + " = ?:";
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;

        try {
            statement.setInt(1,kundeDTO.getKundennummer());
            resultSet = statement.executeQuery();
        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                    resultSet.close(); } catch (Exception exc) {
                Logger.getLogger(KundeReserviertFahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, exc);
            }
        }
        return fetchFahrzeuge(resultSet);
    }

    public int getKundennummerByFahrzeug(FahrzeugDTO fahrzeugDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        List<Fahrzeug> fahrzeugeList = new ArrayList<>();

        String sqlBefehl = "Select * FROM " + table + ", " + DBTables.Fahrzeug.TAB + " WHERE " + table + "." + DBTables.Fahrzeug.COL_KENNZEICHEN + " = " + DBTables.Fahrzeug.COL_KENNZEICHEN + " AND " + table + "." + DBTables.Fahrzeug.COL_KENNZEICHEN + " = '?':";
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        int res = 0;

        try {
            statement.setString(1,fahrzeugDTO.getKennzeichen());
            resultSet = statement.executeQuery();

            assert resultSet != null;
            if (resultSet.next());
                res = resultSet.getInt(DBTables.Kunde.COL_KUNDENNUMMER);
        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                    resultSet.close(); } catch (Exception exc) {
                Logger.getLogger(KundeReserviertFahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, exc);
            }
        }
        return res;
    }


}
