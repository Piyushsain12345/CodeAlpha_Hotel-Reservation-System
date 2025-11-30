package com.hotel.model;

public class Reservation {
    private int bookingId;
    private int roomId;
    private String customerName;
    private String date;

    public Reservation(int bookingId, int roomId, String customerName, String date) {
        this.bookingId = bookingId;
        this.roomId = roomId;
        this.customerName = customerName;
        this.date = date;
    }

    public int getBookingId() { return bookingId; }
    public int getRoomId() { return roomId; }
    public String getCustomerName() { return customerName; }
    public String getDate() { return date; }

    @Override
    public String toString() {
        return bookingId + " | Room: " + roomId + " | " + customerName + " | " + date;
    }
}