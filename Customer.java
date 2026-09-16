public class Customer {

    int customerId;
    String name;
    String meterNumber;
    String address;

    // Constructor
    public Customer(int customerId, String name, String meterNumber, String address) {
        this.customerId = customerId;
        this.name = name;
        this.meterNumber = meterNumber;
        this.address = address;
    }

    // Display customer details
    public void displayCustomer() {
        System.out.println("Customer ID       : " + customerId);
        System.out.println("Customer Name     : " + name);
        System.out.println("Meter Number      : " + meterNumber);
        System.out.println("Address           : " + address);
    }
}
