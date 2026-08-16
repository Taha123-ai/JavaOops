public class Rental {
    private Vehicle vehicle;
    private int Bookingday;
    private double TotalAmount;

    Rental(Vehicle vehicle, int Bookingday, double TotalAmount) {
        this.vehicle = vehicle;
        this.Bookingday = Bookingday;
        this.TotalAmount = TotalAmount;
    }

    public double getBookingday() {
        return Bookingday;
    }

    public void setbookingday(int days) {
        Bookingday = days;
    }

    public String toString() {
        return "\n  Car ID        :      " + vehicle.getCarid() +
                "\n  Car Name      :      " + vehicle.getCarname() +
                "\n  Car Model     :      " + vehicle.getCarmodel() +
                "\n  Total Amount  :      " + TotalAmount +
                "\n  Total Booking Days : " + getBookingday() +
                "\n";
    }
}
