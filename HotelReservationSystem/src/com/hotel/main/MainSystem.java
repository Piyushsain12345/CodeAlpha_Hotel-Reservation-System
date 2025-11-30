package com.hotel.main;

import com.hotel.dao.*;
import com.hotel.model.*;
import java.util.*;

public class MainSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RoomDAO roomDAO = new RoomDAO();
        ReservationDAO resDAO = new ReservationDAO();

        while (true) {
            System.out.println("\n=== HOTEL RESERVATION SYSTEM ===");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Exit");
            System.out.print("Choice: ");
            int choice = sc.nextInt();

            if (choice == 1) {
                roomDAO.getAvailableRooms().forEach(System.out::println);

            } else if (choice == 2) {
                System.out.print("Room ID: ");
                int roomId = sc.nextInt();
                sc.nextLine();

                System.out.print("Customer Name: ");
                String name = sc.nextLine();

                System.out.print("Date: ");
                String date = sc.nextLine();

                int bookingId = resDAO.bookRoom(roomId, name, date);

                if (bookingId != -1) {
                    roomDAO.updateAvailability(roomId, false);
                    System.out.println("Booking Successful! ID: " + bookingId);
                }

            } else {
                break;
            }
        }
        sc.close();
    }
}