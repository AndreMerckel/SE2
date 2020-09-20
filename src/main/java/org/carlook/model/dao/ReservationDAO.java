package org.carlook.model.dao;

import org.carlook.controller.exception.DatabaseException;
import org.carlook.factories.DTOFactory;
import org.carlook.factories.Factories;
import org.carlook.model.objects.dto.KundeDTO;
import org.carlook.model.objects.dto.ReservationDTO;
import org.carlook.model.objects.entities.Fahrzeug;
import org.carlook.model.objects.entities.Kunde;
import org.carlook.services.db.JDBCConnection;
import org.carlook.services.util.DBTables;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Reservation Zugriffsklasse fuer DB
 */
public class ReservationDAO extends AbstractDAO {

    private static ReservationDAO reservationDAO;

    private final String table = DBTables.KundeReserviertFahrzeug.TAB;

    private ReservationDAO() {

    }

    /**
     * Realisierung Singleton-Patter
     */
    public static synchronized ReservationDAO getInstance() {

        if (reservationDAO == null) reservationDAO = new ReservationDAO();
        return reservationDAO;
    }

    /**
     * fuegt eine Reservierung in der DB hinzu
     * @param reservationDTO
     * @throws DatabaseException
     */
    public void register(ReservationDTO reservationDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String sqlBefehl;

        sqlBefehl = "INSERT INTO " + table + " (" + DBTables.Fahrzeug.COL_KENNZEICHEN + "," + DBTables.Kunde.COL_KUNDENNUMMER + ") VALUES (?,?)";
        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        try {
            preparedStatement.setString(1, reservationDTO.getFahrzeug().getKennzeichen());
            preparedStatement.setInt(2, reservationDTO.getKunde().getKundennummer());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }

    /**
     * liefert eine Liste an ReservaionDTO Objekte in Abhaengigkeit zum Fahrzeug
     * @param fahrzeug
     * @throws DatabaseException
     */
    public List<ReservationDTO> getReservationsByKennzeichen(Fahrzeug fahrzeug) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String email, sqlBefehl;

        sqlBefehl = "SELECT * FROM " + table +
                " WHERE " + DBTables.Fahrzeug.COL_KENNZEICHEN + " = ?;";

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        try {
            preparedStatement.setString(1, fahrzeug.getKennzeichen());

            resultSet = preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        List<ReservationDTO> list = fetch(resultSet);
        assert resultSet != null;
        return fetch(resultSet);
    }

    /**
     * iefert eine Liste an ReservaionDTO Objekte in Abhaengigkeit zum Fahrzeug
     * @param kundeDTO
     * @throws DatabaseException
     */
    public List<ReservationDTO> getReservationByKundennummer(KundeDTO kundeDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String email, sqlBefehl;

        sqlBefehl = "SELECT * FROM " + table +
                " WHERE " + DBTables.Kunde.COL_KUNDENNUMMER + " = ?;";

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;

        try {
            preparedStatement.setInt(1, kundeDTO.getKundennummer());

            resultSet = preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return fetch(resultSet);
    }

    /**
     * konvergiert ein ResultSet in einer Liste von Reservation Objekte
     * @param resultSet
     * @throws DatabaseException
     */
    public List<ReservationDTO> fetch(ResultSet resultSet) throws DatabaseException {
        List<ReservationDTO> reservationList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                Kunde kunde = Factories.createNewKunde().setKundennummer(resultSet.getInt(DBTables.Kunde.COL_KUNDENNUMMER));
                Fahrzeug fahrzeug = Factories.createNewFahrzeug().setKennzeichen(Factories.createNewKennzeichen().setKennzeichen(resultSet.getString(DBTables.Fahrzeug.COL_KENNZEICHEN)));

                reservationList.add(DTOFactory.createNewReservationDTO().setFahrzeug(fahrzeug).setKunde(kunde));
            }

        } catch (SQLException e) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (Exception exc) {
                Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        }
        return reservationList;
    }

    /**
     * liefert diee Kundennummer der Reservierung in Abhaengigkeit des Fahrzeuges
     * @param fahrzeug
     * @throws DatabaseException
     */
    public int getKundennummerByFahrzeug(Fahrzeug fahrzeug) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        List<org.carlook.model.objects.entities.Fahrzeug> fahrzeugeList = new ArrayList<>();

        String sqlBefehl = "Select * FROM " + table + ", " + DBTables.Fahrzeug.TAB + " WHERE " + table + "." + DBTables.Fahrzeug.COL_KENNZEICHEN + " = " + DBTables.Fahrzeug.COL_KENNZEICHEN + " AND " + table + "." + DBTables.Fahrzeug.COL_KENNZEICHEN + " = '?':";
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        int res = 0;

        try {
            statement.setString(1, fahrzeug.getKennzeichen());
            resultSet = statement.executeQuery();

            assert resultSet != null;
            if (resultSet.next()) ;
            res = resultSet.getInt(DBTables.Kunde.COL_KUNDENNUMMER);
        } catch (SQLException throwables) {
            Logger.getLogger(FahrzeugDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (Exception exc) {
                Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, sqlBefehl, exc);
            }
        }
        return res;
    }

    /**
     * checkt, Reservierungbereits vorhanden ist
     * @param reservationDTO
     * @throws DatabaseException
     */
    public boolean isReserved(ReservationDTO reservationDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();

        String sqlBefehl = "Select * FROM " + table + " WHERE " + DBTables.Fahrzeug.COL_KENNZEICHEN + " = ? AND " + DBTables.Kunde.COL_KUNDENNUMMER + " = ?;";
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        boolean res = false;

        try {
            statement.setString(1, reservationDTO.getFahrzeug().getKennzeichen());
            statement.setInt(2, reservationDTO.getKunde().getKundennummer());
            resultSet = statement.executeQuery();

            res = resultSet.next();

        } catch (SQLException throwables) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (Exception exc) {
                Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, sqlBefehl, exc);
            }
        }
        return res;
    }

    /**
     * liefert eine Liste von Kennzeichen, die ein Kunde reserviert hat
     * @param kundennummer
     * @throws DatabaseException
     */
    public List<String> getKennzeichenByKundennummer(int kundennummer) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        List<String> fahrzeugeList = new ArrayList<>();

        String sqlBefehl = "Select * FROM " + table + " WHERE " + DBTables.Kunde.COL_KUNDENNUMMER + " = ?;";
        PreparedStatement statement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;
        boolean res = false;

        try {
            statement.setInt(1, kundennummer);
            resultSet = statement.executeQuery();
            while (resultSet.next()) {
                fahrzeugeList.add(resultSet.getString(DBTables.Fahrzeug.COL_KENNZEICHEN));
            }

        } catch (SQLException throwables) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                    resultSet.close();
            } catch (Exception exc) {
                Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, sqlBefehl, exc);
            }
        }
        return fahrzeugeList;
    }

    /**
     * entfernt eine Reservierung von der DB
     * @param reservationDTO
     * @throws DatabaseException
     */
    public void deleteReservation(ReservationDTO reservationDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String sqlBefehl;

        sqlBefehl = "DELETE FROM " + table + " WHERE " + DBTables.Kunde.COL_KUNDENNUMMER + " = ? AND " + DBTables.Fahrzeug.COL_KENNZEICHEN + " =  ?;";
        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        try {
            preparedStatement.setInt(1, reservationDTO.getKunde().getKundennummer());
            preparedStatement.setString(2, reservationDTO.getFahrzeug().getKennzeichen());

            preparedStatement.executeUpdate();

        } catch (SQLException throwables) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }
}