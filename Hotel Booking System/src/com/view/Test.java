package com.view;

import java.util.Scanner;
import com.controller.HotelBookingManagementSystem;

public class Test {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        HotelBookingManagementSystem hms = new HotelBookingManagementSystem();
        int choice = 0;

        while (true) {
            System.out.println("**************************************************");
            System.out.println("****** Welcome to Hotel Booking System ***********");
            System.out.println("**************************************************");
            System.out.println("**********     1. Create Guest        ************");
            System.out.println("**********     2. Add Room            ************");
            System.out.println("**********     3. View Available Rooms************");
            System.out.println("**********     4. Book Room           ************");
            System.out.println("**********     5. Check In            ************");
            System.out.println("**********     6. Check Out           ************");
            System.out.println("**********     7. View All Bookings   ************");
            System.out.println("**********     8. Exit                ************");
            System.out.println("**************************************************");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("Enter guest id");
                    String gid = sc.next();
                    System.out.println("Enter guest name");
                    String gname = sc.next();
                    hms.createGuest(gid, gname);
                    break;

                case 2:
                    System.out.println("Enter room type (Normal/Deluxe)");
                    String roomType = sc.next();
                    System.out.println("Enter room number");
                    String roomNumber = sc.next();
                    System.out.println("Enter room price");
                    double price = sc.nextDouble();
                    hms.addRoom(roomType, roomNumber, price);
                    break;

                case 3:
                    hms.viewAvailableRooms();
                    break;

                case 4:
                    System.out.println("Enter booking id");
                    String bookingId = sc.next();
                    System.out.println("Enter guest id");
                    String guestId = sc.next();
                    System.out.println("Enter room number");
                    String bookRoomNo = sc.next();
                    System.out.println("Enter number of days");
                    int days = sc.nextInt();
                    hms.bookRoom(bookingId, guestId, bookRoomNo, days);
                    break;

                case 5:
                    System.out.println("Enter booking id");
                    String checkInId = sc.next();
                    hms.checkIn(checkInId);
                    break;

                case 6:
                    System.out.println("Enter booking id");
                    String checkOutId = sc.next();
                    hms.checkOut(checkOutId);
                    break;

                case 7:
                    hms.viewBookings();
                    break;

                case 8:
                    System.out.println("Thank you for using Hotel Booking System");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Please enter valid choice");
            }
        }
    }
}
