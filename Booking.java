public class Booking {

    int bookingId;
    String customerName;
    int roomNo;
    double amount;

    public Booking(int bookingId,
                   String customerName,
                   int roomNo,
                   double amount) {

        this.bookingId = bookingId;
        this.customerName = customerName;
        this.roomNo = roomNo;
        this.amount = amount;
    }
}