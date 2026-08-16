import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carsystem carsystem = new Carsystem();
        System.out.println("\n<<< WELCOME TO CAR RENTAL SYSTEM >>>\n");
        Vehicle car1 = new Vehicle("C001", "Maruti Suzuki", "2016", 1000);
        Vehicle car2 = new Vehicle("C002", "Hyundai Creta", "2019", 1800);
        Vehicle car3 = new Vehicle("C003", "Tata Nexon", "2020", 1600);
        Vehicle car4 = new Vehicle("C004", "Honda City", "2018", 1500);
        Vehicle car5 = new Vehicle("C005", "Toyota Fortuner", "2021", 3500);
        Vehicle car6 = new Vehicle("C006", "Mahindra Thar", "2022", 2500);
        Vehicle car7 = new Vehicle("C007", "Kia Seltos", "2020", 2000);
        Vehicle car8 = new Vehicle("C008", "Tata Harrier", "2019", 2200);
        Vehicle car9 = new Vehicle("C009", "MG Hector", "2021", 2400);
        Vehicle car10 = new Vehicle("C010", "Skoda Slavia", "2022", 1900);

        Vehicle[] arrVehicles = { car1, car2, car3, car4, car5, car6, car7, car8, car9, car10 };
        for (Vehicle car : arrVehicles) {
            carsystem.addcar(car);
        }

        carsystem.mainmenu();
       
        sc.close();
    }
}