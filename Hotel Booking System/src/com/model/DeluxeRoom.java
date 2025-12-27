package com.model;

public class DeluxeRoom extends Room {

    public DeluxeRoom(String roomNumber, double price) {
        super(roomNumber, "Deluxe", price);
    }

    @Override
    public double calculateBill(int days) {
        return (getPrice() * days) + 500;
    }
}
