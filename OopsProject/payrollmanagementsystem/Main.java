import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayRoll payroll = new PayRoll();

        FullTimeEmployee emp1 = new FullTimeEmployee("Taha", 1, 10000.0);
        PartTimeEmployee emp3 = new PartTimeEmployee("Sameer", 2, 100.0, 2.0);
        payroll.addEmployee(emp3);
        payroll.addEmployee(emp1);


        payroll.showMenu();
        int choice = 0;
        while (choice != 8) {
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    payroll.displayemployee();
                    break;
                case 2:
                    payroll.displayfulltimeemploye();
                    break;
                case 3:
                    payroll.displayparttimeemploye();
                    break;
                case 4:
                    payroll.Searchemploy();
                    break;
                case 5:
                    payroll.createFullTimeEmployee();
                    break;
                case 6:
                    payroll.createPartTimeEmployee();
                    break;
                case 7:
                    payroll.removeemployee();
                    break;
                case 8:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        sc.close();
    }
}
