import java.util.ArrayList;
import java.util.Scanner;

public class PayRoll {
    Scanner sc = new Scanner(System.in);
    public ArrayList<Employee> employeelist;

    PayRoll() {
        employeelist = new ArrayList<>();
    }

    public void showMenu() {

        System.out.println("\n==============================================");
        System.out.println("       EMPLOYEE PAYROLL MANAGEMENT SYSTEM");
        System.out.println("==============================================");
        System.out.println("  1. View All Employees");
        System.out.println("  2. View Full-Time Employees");
        System.out.println("  3. View Part-Time Employees");
        System.out.println("  4. Search Employee");
        System.out.println("  5. Add FULL-TIME Employee");
        System.out.println("  6. Add PART-TIME Employee");
        System.out.println("  7. Remove Employee");
        System.out.println("  8. Exit");
        System.out.println("==============================================");

    }

    public void displayfulltimeemploye() {
        boolean present = false;
        if (employeelist.isEmpty()) {
            System.out.println("No Full-Time-Employess Yet! Start Hiring.");
        } else {
            for (Employee employee : employeelist) {
                if (employee.gettype() == "FullTime Employee") {
                    System.out.println(employee);
                    present = true;
                }
            }
            if (!present) {
                System.out.println("No Full-Time-Employess Yet! Start Hiring.");
            }
        }
    }

    public void displayparttimeemploye() {
        boolean present = false;
        if (employeelist.isEmpty()) {
            System.out.println("No Part-Time-Employess Yet! Start Hiring.");
        } else {
            for (Employee employee : employeelist) {
                if (employee.gettype() == "PartTime Employee") {
                    System.out.println(employee);
                    present = true;
                }
            }
            if (!present) {
                System.out.println("No Part-Time-Employess Yet! Start Hiring.");
            }
        }
    }

    public void addEmployee(Employee employee) {
        employeelist.add(employee);
    }

    public void createFullTimeEmployee() {

        System.out.println("\n----- Add Full-Time Employee -----");

        System.out.print("Name   : ");
        String name = sc.next();

        System.out.print("ID     : ");
        int id = sc.nextInt();

        System.out.print("Salary : ₹");
        double salary = sc.nextDouble();

        FullTimeEmployee employee = new FullTimeEmployee(name, id, salary);
        addEmployee(employee);

        System.out.println("\n✓ " + name.toUpperCase() + " added successfully!");
    }

    public void createPartTimeEmployee() {

        System.out.println("\n----- Add Part-Time Employee -----");

        System.out.print("Name        : ");
        String name = sc.next();

        System.out.print("ID          : ");
        int id = sc.nextInt();

        System.out.print("Hours Work  : ");
        double hourWork = sc.nextDouble();

        System.out.print("Hourly Rate : ₹");
        double hourlyRate = sc.nextDouble();

        PartTimeEmployee employee = new PartTimeEmployee(name, id, hourlyRate, hourWork);

        addEmployee(employee);

        System.out.println("\n✓ " + name.toUpperCase() + " added successfully!");
    }

    public void removeemployee() {
        System.out.println("-----Removing pannel-----");
        System.out.print("Enter Employe Id : ");
        int Id = sc.nextInt();

        Employee employetoremove = null;
        for (Employee employee : employeelist) {
            if (employee.getId() == Id) {
                employetoremove = employee;
                break;
            }
        }
        if (employetoremove != null) {
            employeelist.remove(employetoremove);
            System.out.println("Employe with id " + Id + " removed.");
        } else {
            System.out.println("ID not found.");
        }
    }

    public void displayemployee() {
        if (employeelist.isEmpty()) {
            System.out.println("No Employess Yet! Start Hiring.");
        }
        for (Employee employee : employeelist) {
            System.out.println(employee);
        }
    }

    public void Searchemploy() {
        System.out.println("\n------SEARCH EMPLOYE-------");
        System.out.print("ENTER EMPLOYE ID : ");
        int id = sc.nextInt();
        boolean isthere = false;
        for (Employee employee : employeelist) {
            if (employee.getId() == id) {
                isthere = true;
                System.out.println(employee);
            }
        }
        if (!isthere) {
            System.out.println("Employee not found!");
        }
    }
}
