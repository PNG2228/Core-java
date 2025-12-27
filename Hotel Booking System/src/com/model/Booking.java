package com.model;
public class Booking {
    private String bookingId;
    private Guest guest;
    private Room room;
    private int days;
    private double bill;
    private String status;
    public Booking(String bookingId, Guest guest, Room room, int days, double bill) {
        this.bookingId = bookingId;
        this.guest = guest;
        this.room = room;
        this.days = days;
        this.bill = bill;
        this.status = "BOOKED";
    }
    public Room getRoom() {
        return room;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString() {
        return "Booking [bookingId=" + bookingId +
               ", guest=" + guest +
               ", room=" + room +
               ", days=" + days +
               ", bill=" + bill +
               ", status=" + status + "]";
    }
}
