package com.model;
public abstract class Room {
    private String roomNumber;
    private String roomType;
    private double price;
    private boolean available;
    public Room(String roomNumber, String roomType, double price) {
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.price = price;
        this.available = true;
    }
    public String getRoomNumber() {
        return roomNumber;
    }
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    public String getRoomType() {
        return roomType;
    }
    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public boolean isAvailable() {
        return available;
    }
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public abstract double calculateBill(int days);
    @Override
    public String toString() {
        return "Room [roomNumber=" + roomNumber +
               ", roomType=" + roomType +
               ", price=" + price +
               ", available=" + available + "]";
    }
}
