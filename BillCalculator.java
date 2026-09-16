public class BillCalculator {
    public static double calculateBill(int units) {
        double bill = 0;

        // First 100 units
        if (units <= 100) {
            bill = units * 3.0;
        }
        // 101 to 200 units
        else if (units <= 200) {
            bill = (100 * 3.0)
                    + ((units - 100) * 5.0);
        }
        // 201 to 300 units
        else if (units <= 300) {
            bill = (100 * 3.0)
                    + (100 * 5.0)
                    + ((units - 200) * 7.0);
        }
        // More than 300 units
        else {
            bill = (100 * 3.0)
                    + (100 * 5.0)
                    + (100 * 7.0)
                    + ((units - 300) * 10.0);
        }
        return bill;
    }
}
