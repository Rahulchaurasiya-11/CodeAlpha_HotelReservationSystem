import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Hotel {

    ArrayList<Room> rooms = new ArrayList<>();
    ArrayList<Booking> bookings = new ArrayList<>();

    Scanner sc = new Scanner(System.in);

    int bookingCounter = 1001;

    public Hotel() {

        rooms.add(new Room(101, "Standard", 1000));
        rooms.add(new Room(102, "Standard", 1000));
        rooms.add(new Room(201, "Deluxe", 2000));
        rooms.add(new Room(301, "Suite", 3500));
    }

    public void viewRooms() {

        System.out.println("\nAvailable Rooms:");

        for (Room r : rooms) {

            if (!r.booked) {

                System.out.println(
                        r.roomNo + " | "
                                + r.category + " | Rs."
                                + r.price);
            }
        }
    }

    public void bookRoom() {

        System.out.print("Enter Room Number: ");
        int roomNo = sc.nextInt();
        sc.nextLine();

        for (Room r : rooms) {

            if (r.roomNo == roomNo && !r.booked) {

                System.out.print("Enter Customer Name: ");
                String name = sc.nextLine();

                r.booked = true;

                Booking b = new Booking(
                        bookingCounter++,
                        name,
                        roomNo,
                        r.price);

                bookings.add(b);

                System.out.println("Booking Successful!");
                System.out.println("Booking ID: " + b.bookingId);

                return;
            }
        }

        System.out.println("Room Not Available!");
    }

    public void cancelBooking() {

        System.out.print("Enter Booking ID: ");
        int id = sc.nextInt();

        Iterator<Booking> iterator = bookings.iterator();

        while (iterator.hasNext()) {

            Booking b = iterator.next();

            if (b.bookingId == id) {

                for (Room r : rooms) {

                    if (r.roomNo == b.roomNo) {

                        r.booked = false;
                    }
                }

                iterator.remove();

                System.out.println("Booking Cancelled!");

                return;
            }
        }

        System.out.println("Booking Not Found!");
    }

    public void viewBookings() {

        System.out.println("\nCurrent Bookings:");

        for (Booking b : bookings) {

            System.out.println(
                    "Booking ID: " + b.bookingId
                            + " | Name: " + b.customerName
                            + " | Room: " + b.roomNo
                            + " | Amount: Rs." + b.amount);
        }
    }
}