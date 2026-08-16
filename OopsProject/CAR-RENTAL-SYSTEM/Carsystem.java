import java.util.ArrayList;
import java.util.Scanner;

public class Carsystem {
    Scanner sc = new Scanner(System.in);
    // Scanner sc1 = new Scanner(System.in);
    ArrayList<Vehicle> carlist;
    ArrayList<Rental> rentcarlist;

    Carsystem() {
        carlist = new ArrayList<>();
        rentcarlist = new ArrayList<>();
    }

    public void showMenu() {
        System.out.println("\n------CUSTOMER PANNEL------\n");
        System.out.println("1. All CARS");
        System.out.println("2. RENT CAR");
        System.out.println("3. ALL RENTED CAR");
        System.out.println("4. EXIT");

        int choice = 0;
        while (choice != 4) {
            System.out.print("Select Number: ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= 4) {
                switch (choice) {
                    case 1:
                        getcarlist();
                        break;
                    case 2:
                        rentcar();
                        break;
                    case 3:
                        getrentedcarlist();
                        break;
                    case 4:
                        System.out.println("Exiting.");
                        System.out.println("\nThankyou for choosing us.\n");
                        mainmenu();
                        break;
                    default:
                        System.out.println("Select Valid Choice.");
                        break;
                }
            }
        }
    }

    public void addcar(Vehicle car) {
        carlist.add(car);
    }

    public void getcarlist() {
        if (carlist.isEmpty()) {
            System.out.println("No Cars in Database.");
        } else {
            for (Vehicle vehicle : carlist) {
                System.out.println(vehicle);
            }
        }
    }

    public void mainmenu() {
        System.out.println("---------------");
        System.out.println("1. ADMIN");
        System.out.println("2. CUSTOMER");
        System.out.println("3. EXIT");

        int choice1 = 0;
        while (choice1 != 3) {
            System.out.print("\nSelect Options: ");
            int choice = sc.nextInt();
            choice1 = choice;
            switch (choice1) {
                case 1:
                    adminpannel();
                    break;
                case 2:
                    showMenu();
                    break;
                case 3:
                    System.out.println("Exiting.");
                    System.out.println("\nThankyou for choosing us.\n");
                    break;
                default:
                    System.out.println("Select Valid Choice.");
                    break;

            }
        }
    }

    public void rentcar() {
        System.out.println("\n----CAR RENTING PANNEL----");
        System.out.print("Enter the Car ID: ");
        String id = sc.next();
        boolean isId = false;
        for (Vehicle vehicle : carlist) {
            if (vehicle.getCarid().equals(id)) {
                isId = true;
                if (vehicle.getisavailable()) {
                    System.out.println("Car - " + vehicle.getCarid() + " " + vehicle.getCarname() + " is available.");
                    System.out.println("Price Per Day : " + vehicle.getPriceperday());
                    System.out.print("For how much days " + vehicle.getCarname() + " recquired : ");
                    int day = sc.nextInt();
                    System.out.println("Total Amount to pay : " + vehicle.Bill(day));
                    System.out.print("Confirm Booking (Y/N)- ");
                    String confirm = sc.next();
                    if (confirm.equalsIgnoreCase("Y")) {
                        vehicle.setisavailable();
                        System.out.println("Car Rented Successfully.");
                        Rental ob = new Rental(vehicle, day, vehicle.Bill(day));
                        rentcarlist.add(ob);
                        System.out.println("------------------------------");
                    } else if (confirm.equalsIgnoreCase("N")) {
                        System.out.println("Booking cancelled.");
                        System.out.println("-------------------------------");
                    } else {
                        System.out.println("Wrong selects.");
                    }
                } else {
                    System.out
                            .println("Car - " + vehicle.getCarid() + " " + vehicle.getCarname() + " is Not Available.");
                }
            }
        }
        if (!isId) {
            System.out.println("Car with id " + id + " not found.");
        }
    }

    public void adminpannel() {
        System.out.println("\n------ADMIN PANNEL------\n");
        Admin obaAdmin = new Admin();
        System.out.print("Enter username : ");
        String name = sc.next();
        System.out.print("Enter Password(4 Digit) : ");
        int Password = sc.nextInt();

        if (obaAdmin.getName().equals(name) && obaAdmin.getPassword() == Password) {
            System.out.println("\n***Welcome " + obaAdmin.getName() + "***" + "\n");
            System.out.println("1. All CARS");
            System.out.println("2. ADD NEW CAR");
            System.out.println("3. REMOVE CAR");
            System.out.println("4. All RENTED CARS");
            System.out.println("5. Back");
            System.out.println("6. EXIT");

            int choice = 0;
            while (choice != 6) {
                System.out.print("Select Number: ");
                choice = sc.nextInt();
                if (choice >= 1 && choice <= 6) {
                    switch (choice) {
                        case 1:
                            getcarlist();
                            break;
                        case 2:
                            addnewcar();
                            break;
                        case 3:
                            removecar();
                            break;
                        case 4:
                            unavailablecar();
                            break;
                        case 5:
                            System.out.println("\nLogging Out..\n");
                            mainmenu();
                            System.out.println("-----------------------");
                            break;
                        case 6:
                            System.out.println("Exiting.");
                            System.out.println("\nThankyou for contribution.\n");
                            System.out.println("-----------------------");

                            break;
                        default:
                            System.out.println("Select Valid Choice.");
                            break;
                    }
                }
            }

        } else {
            System.out.println("Wrong Login Credentials.");
            mainmenu();
        }

    }

    public void unavailablecar() {
        System.out.println("******RENTED CARS******");
        if (rentcarlist.isEmpty()) {
            System.out.println("No Car has been Rented..");
            System.out.println("-----------------------");

        } else {
            for (Rental vehicle : rentcarlist) {
                System.out.println(vehicle);
            }
            System.out.println("-----------------------");

        }
    }

    public void getrentedcarlist() {
        if (rentcarlist.isEmpty()) {
            System.out.println("No Rented Cars in Available.");
            System.out.println("-----------------------");
        } else {
            for (Rental vehicle : rentcarlist) {
                System.out.println(vehicle);
            }
            System.out.println("-----------------------");
        }
    }

    public void addnewcar() {
        System.out.println("<<<<<<<ADD CAR>>>>>>>");
        System.out.print("Enter car ID: ");
        String carid = sc.next();
        System.out.print("Enter Carname:");
        String carname = sc.next();
        System.out.print("Car Model : ");
        String carmodel = sc.next();
        System.out.print("Enter Price Per Day : ");
        double priceperday = sc.nextDouble();

        Vehicle vehicleob = new Vehicle(carid, carname, carmodel, priceperday);
        carlist.add(vehicleob);
        System.out.println("Car - " + vehicleob.getCarid() + " " + vehicleob.getCarname() + " added.");
        System.out.println("--------------------------------");
    }

    public void removecar() {
        System.out.println("---------CAR REMOVING PANNEL-----------");
        System.out.print("Enter Id : ");
        String id = sc.next();
        boolean ispresent = false;
        for (Vehicle vehicle : carlist) {
            if (vehicle.getCarid().equals(id)) {
                ispresent = true;
                System.out.println("Car - " + vehicle.getCarid() + " " + vehicle.getCarname() + " Found.");
                System.out.print("Car Removing Permission(Y/N) : ");
                String permission = sc.next();
                if (permission.equalsIgnoreCase("Y")) {
                    System.out
                            .println("Car - " + vehicle.getCarid() + " " + vehicle.getCarname() + " has been deleted.");
                    carlist.remove(vehicle);
                    System.out.println("-----------------------");
                    break;
                } else if (permission.equalsIgnoreCase("N")) {
                    System.out.println("Permission Denied.");
                    System.out.println("-----------------------");
                    break;
                } else {
                    System.out.println("Wrong selection.");
                    System.out.println("-----------------------");

                }
            }
        }
        if (!ispresent) {
            System.out.println("Car - " + id + " with such id NOT found.");
        }
    }
}
