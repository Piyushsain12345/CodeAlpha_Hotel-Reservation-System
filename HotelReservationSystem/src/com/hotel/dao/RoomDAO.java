package com.hotel.dao;

import com.hotel.model.Room;
import java.sql.*;
import java.util.*;

public class RoomDAO {

    public List<Room> getAvailableRooms() {
        List<Room> list = new ArrayList<>();
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM rooms");
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                list.add(new Room(
                    rs.getInt("roomId"),
                    rs.getString("category"),
                    rs.getDouble("price"),
                    rs.getBoolean("available")
                ));
            }
        } catch (Exception e) { e.printStackTrace(); }
        return list;
    }

    public void updateAvailability(int roomId, boolean status) {
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(
                "UPDATE rooms SET available=? WHERE roomId=?");
            ps.setBoolean(1, status);
            ps.setInt(2, roomId);
            ps.executeUpdate();
        } catch (Exception e) { e.printStackTrace(); }
    }
}