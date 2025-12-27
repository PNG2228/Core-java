package com.model;

public class NormalRoom extends Room {

    public NormalRoom(String roomNumber, double price) {
        super(roomNumber, "Normal", price);
    }

    @Override
    public double calculateBill(int days) {
        return getPrice() * days;
    }
}
