public class Payment {

    String paymentStatus;
    
    public Payment(String payment) {

        if (payment.equalsIgnoreCase("yes")) {
            paymentStatus = "PAID";
        } else {
            paymentStatus = "PENDING";
        }
    }

    public void displayPaymentStatus() {
        System.out.println("Payment Status: " + paymentStatus);
    }
}
