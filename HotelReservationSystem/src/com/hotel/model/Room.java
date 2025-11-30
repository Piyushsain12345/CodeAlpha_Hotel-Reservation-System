package com.hotel.model;

public class Room {
    private int roomId;
    private String category;   // Standard, Deluxe, Suite
    private double price;
    private boolean available;

    public Room(int roomId, String category, double price, boolean available) {
        this.roomId = roomId;
        this.category = category;
        this.price = price;
        this.available = available;
    }

    public int getRoomId() { return roomId; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
    public boolean isAvailable() { return available; }

    public void setAvailable(boolean available) { this.available = available; }

    @Override
    public String toString() {
        return roomId + " | " + category + " | " + price + " | " + (available ? "Available" : "Booked");
    }
}