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

public class ReservationDAO extends AbstractDAO {

    private static ReservationDAO reservationDAO;
    private String table = DBTables.KundeReserviertFahrzeug.TAB;

    private ReservationDAO() {}

    public static synchronized ReservationDAO getInstance() {

        if (reservationDAO == null) reservationDAO = new ReservationDAO();
        return reservationDAO;
    }

    public void create(ReservationDTO reservationDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String email, sqlBefehl;

        sqlBefehl = "INSERT INTO " + table + " (" +
                DBTables.Kunde.COL_KUNDENNUMMER + "," + DBTables.Fahrzeug.COL_KENNZEICHEN + ") VALUES (?,?)";

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);

        try {
            preparedStatement.setInt(1,reservationDTO.getKundennummer());
            preparedStatement.setString(2,reservationDTO.getKennzeichen());

            preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, null, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
    }

    public List<ReservationDTO> getReservationsByKennzeichen(FahrzeugDTO fahrzeugDTO) throws DatabaseException {
            JDBCConnection.getInstance().openConnection();
            String email, sqlBefehl;

            sqlBefehl = "SELECT * FROM " + table +
                    " WHERE " + DBTables.Fahrzeug.COL_KENNZEICHEN + " = ?;";

            PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
            ResultSet resultSet = null;
            try {
                preparedStatement.setString(1,fahrzeugDTO.getKennzeichen());

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

    public List<ReservationDTO> getReservationByKundennummer(KundeDTO kundeDTO) throws DatabaseException {
        JDBCConnection.getInstance().openConnection();
        String email, sqlBefehl;

        sqlBefehl = "SELECT * FROM " + table +
                " WHERE " + DBTables.Kunde.COL_KUNDENNUMMER + " = ?;";

        PreparedStatement preparedStatement = getPreparedStatement(sqlBefehl);
        ResultSet resultSet = null;

        try {
            preparedStatement.setInt(1,kundeDTO.getKundennummer());

            resultSet = preparedStatement.executeQuery();
        } catch (SQLException throwables) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, sqlBefehl, throwables);
        } finally {
            JDBCConnection.getInstance().closeConnection();
        }
        return fetch(resultSet);
    }

    public List<ReservationDTO> fetch(ResultSet resultSet) throws DatabaseException {
        List<ReservationDTO> reservationList = new ArrayList<>();
        try {
            while (resultSet.next()) {
                ReservationDTO reservationDTO = new ReservationDTO()
                        .setKundennummer(resultSet.getInt(DBTables.Kunde.COL_KUNDENNUMMER))
                        .setKennzeichen(resultSet.getString(DBTables.Fahrzeug.COL_KENNZEICHEN));
                reservationList.add(reservationDTO);
            }

        } catch (SQLException e) {
            Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, null, e);
        } finally {
            JDBCConnection.getInstance().closeConnection();
            try {
                if (resultSet != null)
                    resultSet.close(); } catch (Exception exc) {
                Logger.getLogger(ReservationDAO.class.getName()).log(Level.SEVERE, null, exc);
            }
        }
        return reservationList;
    }

}
