import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

class BankAccount {
    private double balance = 50000.0;
    private int pin = 1234;
    private boolean isLocked = false;
    
    // VERIFIED TELEGRAM SETTINGS
    private  final String botToken = "//bottoken"; 
    private final String chatId ="//chatid";
    
    

    // CORE: Professional SMS Alert System
    public void sendPhoneAlert(String type, double amount, String status, String alertLevel) {
        try {
            int txnId = new Random().nextInt(900000) + 100000;
            String now = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss").format(LocalDateTime.now());

            // Professional Formatting based on Alert Level
            String header = alertLevel.equals("CRITICAL") ? "🚫 *ACCOUNT BLOCKED*" : 
                           (alertLevel.equals("HIGH") ? "⚠️ *SECURITY ALERT*" : "🏦 *TAHA SAVINGS BANK*");
            
            String messageText = header + "\n" +
                                 "---------------------------\n" +
                                 "Activity: " + type + "\n" +
                                 "Status: " + status + "\n" +
                                 (amount > 0 ? "Amount: ₹" + String.format("%.2f", amount) + "\n" : "") +
                                 "Ref: TXN" + txnId + "\n" +
                                 "Time: " + now + "\n" +
                                 "---------------------------\n" +
                                 (alertLevel.equals("CRITICAL") ? "❗ *Your account is disabled due to 3 failed PIN attempts. Contact branch.*" : 
                                 (alertLevel.equals("HIGH") ? "❗ *Unauthorized login attempt detected. If not you, block card.*" : 
                                 "💰 *Avail Bal: ₹" + String.format("%.2f", balance) + "*"));

            URI uri = new URI("https", "api.telegram.org", 
                "/bot" + botToken + "/sendMessage", 
                "chat_id=" + chatId + "&text=" + messageText + "&parse_mode=Markdown", null);

            URL url = uri.toURL();
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setConnectTimeout(5000);
            conn.getInputStream().close();
            System.out.println(">> [SMS] High-Priority Alert Sent to Phone! ✅");
        } catch (Exception e) {
            System.out.println(">> [SMS] Alert failed. (Check Internet/Token)");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Dispensing Cash... 💸");
            sendPhoneAlert("CASH DEBITED", amount, "SUCCESS", "NORMAL");
        } else {
            System.out.println("❌ ERROR: Insufficient Balance!");
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Credited to Account! 🏦");
            sendPhoneAlert("CASH CREDITED", amount, "SUCCESS", "NORMAL");
        }
    }

    public void changePin(int oldP, int newP) {
        if (this.pin == oldP) {
            this.pin = newP;
            System.out.println("PIN Changed Successfully! ✅");
            sendPhoneAlert("PIN UPDATE", 0.0, "SUCCESS", "NORMAL");
        } else {
            System.out.println("❌ ERROR: Incorrect Old PIN.");
        }
    }

    public void lockAccount() { this.isLocked = true; }
    public boolean isAccountLocked() { return isLocked; }
    public int getPin() { return pin; }
    public double getBalance() { return balance; }
}

public class TahaMasterATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount user = new BankAccount();
        int attempts = 0;

        System.out.println("======= WELCOME TO TAHA'S DIGITAL BANK =======");

        while (attempts < 3) {
            System.out.print("\nEnter PIN (Attempt " + (attempts + 1) + "/3): ");
            int enteredPin = sc.nextInt();

            if (enteredPin == user.getPin()) {
                System.out.println("\n✅ Access Granted!");
                boolean session = true;
                while (session) {
                    System.out.println("\n1.Withdraw  2.Deposit  3.Balance  4.Change PIN  5.Exit");
                    System.out.print("Select Action: ");
                    int choice = sc.nextInt();
                    switch (choice) {
                        case 1 -> { System.out.print("Amount (₹): "); user.withdraw(sc.nextDouble()); }
                        case 2 -> { System.out.print("Amount (₹): "); user.deposit(sc.nextDouble()); }
                        case 3 -> System.out.println("Balance: ₹" + String.format("%.2f", user.getBalance()));
                        case 4 -> {
                            System.out.print("Old PIN: "); int o = sc.nextInt();
                            System.out.print("New PIN: "); int n = sc.nextInt();
                            user.changePin(o, n);
                        }
                        case 5 -> session = false;
                        default -> System.out.println("Invalid Choice.");
                    }
                }
                break; 
            } else {
                attempts++;
                System.out.println("❌ INCORRECT PIN!");
                if (attempts < 3) {
                    user.sendPhoneAlert("FAILED LOGIN ATTEMPT", 0.0, "DENIED", "HIGH");
                } else {
                    user.lockAccount();
                    System.out.println("\n🚨 ACCOUNT BLOCKED! Maximum attempts reached.");
                    user.sendPhoneAlert("ACCOUNT LOCKOUT", 0.0, "CRITICAL", "CRITICAL");
                }
            }
        }
        System.out.println("Terminating Session... Please collect your card.");
        sc.close();
    }
}

