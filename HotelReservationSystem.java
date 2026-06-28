import java.util.Scanner;

public class HotelReservationSystem {

    public static void main(String[] args) {

        Hotel hotel = new Hotel();

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== HOTEL RESERVATION SYSTEM =====");
            System.out.println("1. View Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Cancel Booking");
            System.out.println("4. View Bookings");
            System.out.println("5. Exit");

            System.out.print("Enter Choice: ");

            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    hotel.viewRooms();
                    break;

                case 2:
                    hotel.bookRoom();
                    break;

                case 3:
                    hotel.cancelBooking();
                    break;

                case 4:
                    hotel.viewBookings();
                    break;

                case 5:
                    System.out.println("Thank You!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}