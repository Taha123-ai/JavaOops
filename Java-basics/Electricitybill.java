import java.util.Scanner;

public class Electricitybill {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter '1' for Rural(DS-I) Bill.");
        System.out.println("Enter '2' for Urban(DS-II) Bill.");
        int option = scanner.nextInt();
        if (option == 1) {
            System.out.print("Enter your used unit->");
            double unit = scanner.nextInt();
            if (unit <= 125) {
                System.out.println("Mukhyamantri Vidyut Upbhokta Sahayata Yojana Free 125KW");
                System.out.println("Total amount= RS.00");
            } else {
                double uc = unit - 125;
                double revisedbill = ((uc * 7.96) + 120 + (0.06 * uc));
                double ec = (unit - 125) * 7.96;
                double bs = ((unit * 7.96) + 120 + (0.06 * unit));
                System.out.println("Total unit consumed: " + unit + "unit");
                System.out.println("Subsidy by Government: 125unit");
                System.out.println("Energy charges: Rs." + ec);
                System.out.println("Fixed charges: Rs.120");
                System.out.println("Tax Rebate: Rs." + uc * 0.06);
                System.out.println("Total Bill Before subsidy: Rs." + bs);
                System.out.println("TOTAL BILL: Rs." + revisedbill);

            }
        } else {
            System.out.println("Enter your consumed unit->");
            double unitu = scanner.nextDouble();
            if (unitu <= 125) {
                System.out.println("Your consumed unit is " + unitu + "KW");
                System.out.println("Mukhyamantri Vidyut Upbhokta Sahayata Yojana Free 125KW");
                System.out.println("TOTAL BILL AMOUNT: RS.00");
            } else {
                double uc = unitu - 125;
                double revisedbill = (((unitu - 125) + 240) + (0.06 * uc));
                double ec = uc * 8.95;
                double bs = ((unitu * 8.95) + 240 + (0.06 * unitu));
                System.out.println("Total unit consumed: " + unitu + "unit");
                System.out.println("Subsidy by Government: 125unit");
                System.out.println("Energy charges: Rs." + ec);
                System.out.println("Fixed charges: Rs.240");
                System.out.println("Tax Rebate: Rs." + uc * 0.06);
                System.out.println("Total Bill Before subsidy: Rs." + bs);
                System.out.println("TOTAL BILL: Rs." + revisedbill);
            }
        }
        scanner.close();
    }
}
