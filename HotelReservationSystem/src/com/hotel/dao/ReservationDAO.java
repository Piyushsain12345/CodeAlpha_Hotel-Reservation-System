package com.hotel.dao;

import com.hotel.model.Reservation;
import java.sql.*;

public class ReservationDAO {

    public int bookRoom(int roomId, String customerName, String date) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
               "INSERT INTO reservations(roomId, customerName, date) VALUES(?,?,?)",
               Statement.RETURN_GENERATED_KEYS
            );
            ps.setInt(1, roomId);
            ps.setString(2, customerName);
            ps.setString(3, date);
            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) return rs.getInt(1);

        } catch (Exception e) { e.printStackTrace(); }
        return -1;
    }
}