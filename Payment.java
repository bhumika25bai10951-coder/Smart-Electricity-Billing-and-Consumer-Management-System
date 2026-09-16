public class Payment {

    String paymentStatus;

    // Constructor
    public Payment(String payment) {

        if (payment.equalsIgnoreCase("yes")) {
            paymentStatus = "PAID";
        } else {
            paymentStatus = "PENDING";
        }
    }

    // Display payment status
    public void displayPaymentStatus() {

        System.out.println("Payment Status    : " + paymentStatus);
    }
}
