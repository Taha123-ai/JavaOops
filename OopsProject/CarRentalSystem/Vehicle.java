public class Vehicle {
    private String carid;
    private String carname;
    private String carmodel;
    private double priceperday;
    private boolean isavailable;

    Vehicle(){

    };
    Vehicle(String carid, String carname, String carmodel, double priceperday) {
        this.carid = carid;
        this.carname = carname;
        this.carmodel = carmodel;
        this.priceperday = priceperday;
        isavailable = true;
    }

    public String getCarid() {
        return carid;
    }

    public String getCarname() {
        return carname;
    }

    public String getCarmodel() {
        return carmodel;
    }

    public double getPriceperday() {
        return priceperday;
    }

    public boolean getisavailable() {
        return isavailable;
    }
    public void setisavailable() {
         isavailable=false;
    }
    public double Bill(int day){
        return priceperday*day;
    }


    @Override
    public String toString() {
        return  "\n  Car ID        : " + carid +
                "\n  Car Name      : " + carname +
                "\n  Car Model     : " + carmodel +
                "\n  Price Per Day : $" + priceperday +
                "\n  Availability  : " + (isavailable ? "Available" : "Rented") +
                "\n";
    }
   
}
