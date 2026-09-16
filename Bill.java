public class Bill {

    int previousReading;
    int currentReading;
    int units;

    double energyCharge;
    double fixedCharge;
    double tax;
    double totalBill;

    // Constructor
    public Bill(int previousReading, int currentReading) {

        this.previousReading = previousReading;
        this.currentReading = currentReading;

        // Calculate units
        units = currentReading - previousReading;

        // Calculate charges
        energyCharge = BillCalculator.calculateBill(units);

        fixedCharge = 100;

        tax = energyCharge * 0.05;

        totalBill = energyCharge + fixedCharge + tax;
    }

    // Display bill
    public void displayBill() {

        System.out.println("--------------------------------------");

        System.out.println("Previous Reading  : " + previousReading);
        System.out.println("Current Reading   : " + currentReading);
        System.out.println("Units Consumed    : " + units);

        System.out.println("--------------------------------------");

        System.out.printf("Energy Charges    : Rs. %.2f%n", energyCharge);
        System.out.printf("Fixed Charges     : Rs. %.2f%n", fixedCharge);
        System.out.printf("Tax (5%%)          : Rs. %.2f%n", tax);

        System.out.println("--------------------------------------");

        System.out.printf("TOTAL BILL        : Rs. %.2f%n", totalBill);
    }
}
