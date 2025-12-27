package com.controller;
import java.util.*;
import com.model.*;
public class HotelBookingManagementSystem {
    Map<String, Guest> guests = new LinkedHashMap<>();
    Map<String, Room> rooms = new LinkedHashMap<>();
    Map<String, Booking> bookings = new LinkedHashMap<>();
    public void createGuest(String id, String name) {
        if (guests.containsKey(id)) {
            System.err.println("Guest already exists");
        } else {
            guests.put(id, new Guest(id, name));
            System.out.println("Guest created successfully");
        }
    }
    public void addRoom(String type, String roomNumber, double price) {
        if (rooms.containsKey(roomNumber)) {
            System.err.println("Room already exists");
            return;
        }
        Room room = null;
        if (type.equalsIgnoreCase("Normal")) {
            room = new NormalRoom(roomNumber, price);
        } else if (type.equalsIgnoreCase("Deluxe")) {
            room = new DeluxeRoom(roomNumber, price);
        } else {
            System.err.println("Invalid room type");
            return;
        }
        rooms.put(roomNumber, room);
        System.out.println("Room added successfully");
    }
    public void viewAvailableRooms() {
        for (Room r : rooms.values()) {
            if (r.isAvailable()) {
                System.out.println(r);
            }
        }
    }
    public void bookRoom(String bookingId, String guestId, String roomNumber, int days) {
        if (!guests.containsKey(guestId)) {
            System.err.println("Guest not found");
            return;
        }
        if (!rooms.containsKey(roomNumber)) {
            System.err.println("Room not found");
            return;
        }
        Room room = rooms.get(roomNumber);
        if (!room.isAvailable()) {
            System.err.println("Room already booked");
            return;
        }
        double bill = room.calculateBill(days);
        Booking booking = new Booking(bookingId, guests.get(guestId), room, days, bill);
        bookings.put(bookingId, booking);
        room.setAvailable(false);
        System.out.println("Room booked successfully");
        System.out.println("Bill amount: " + bill);
    }
    public void checkIn(String bookingId) {
        if (bookings.containsKey(bookingId)) {
            Booking b = bookings.get(bookingId);
            b.setStatus("CHECKED_IN");
            System.out.println("Check-in successful");
        } else {
            System.err.println("Invalid booking ID");
        }
    }
    public void checkOut(String bookingId) {
        if (bookings.containsKey(bookingId)) {
            Booking b = bookings.get(bookingId);
            b.setStatus("CHECKED_OUT");
            b.getRoom().setAvailable(true);
            System.out.println("Check-out successful");
        } else {
            System.err.println("Invalid booking ID");
        }
    }
    public void viewBookings() {
        for (Booking b : bookings.values()) {
            System.out.println(b);
        }
    }
}