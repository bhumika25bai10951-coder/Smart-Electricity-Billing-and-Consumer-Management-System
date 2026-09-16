import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=============================");
        System.out.println("ELECTRICITY BILL MANAGEMENT SYSTEM");
        System.out.println("======================================");

        System.out.print("Enter Customer ID: ");
        int customerId = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Meter Number: ");
        String meterNumber = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        Customer customer =
                new Customer(customerId, name, meterNumber, address);

        System.out.print("Enter Previous Meter Reading: ");
        int previousReading = sc.nextInt();

        System.out.print("Enter Current Meter Reading: ");
        int currentReading = sc.nextInt();

        if (currentReading < previousReading) {

            System.out.println(
                "\nError: Current reading cannot be less than previous reading."
            );

            sc.close();
            return;
        }

        Bill bill = new Bill(previousReading, currentReading);

        sc.nextLine();

        System.out.print("Has the bill been paid? (yes/no): ");
        String payment = sc.nextLine();

        Payment paymentObject = new Payment(payment);

        System.out.println("\n");
        System.out.println("======================================");
        System.out.println("ELECTRICITY BILL");
        System.out.println("================================");

        customer.displayCustomer();

        bill.displayBill();

        paymentObject.displayPaymentStatus();

        System.out.println("======================================");

        System.out.println("\nThank you for using the Electricity Bill Management System!");

        sc.close();
    }
}
