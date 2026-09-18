Electricity Bill Management System

1. Problem Statement

Managing electricity bills manually can be time-consuming and may lead to calculation errors. Electricity departments need to maintain customer information, meter readings, unit consumption, bill amounts, and payment status.

The Smart Electricity Bill Management System is developed as a Java-based console application to simplify the electricity billing process. The system takes customer details and meter readings as input, calculates the electricity units consumed, applies the defined tariff rates, adds fixed charges and tax, and generates the final bill.

The system also allows the payment status of the generated bill to be displayed as PAID or PENDING.

---

2. Scope of the Project

The scope of this project includes the basic management and calculation of electricity bills.

The system can:

* Store and display customer information.
* Store previous and current meter readings.
* Calculate electricity units consumed.
* Calculate electricity charges according to different unit slabs.
* Add fixed charges and tax.
* Generate and display the final electricity bill.
* Display the payment status.
* Validate meter readings.

The current version is a console-based Java application. It can later be extended with database connectivity, graphical user interface, multiple customer records, and online payment functionality.

---

3. Target Users

The main target users of this system are:

Electricity Department Staff:
Staff can use the system to enter customer details, meter readings, and generate electricity bills.

Electricity Consumers:
Consumers can use the system to view their electricity consumption, bill amount, and payment status.

Students / Learners:
The project can also be used as an educational application to understand Java programming and Object-Oriented Programming concepts.

---

4. High-Level Features

4.1 Customer Management:
The system accepts and displays:

* Customer ID
* Customer Name
* Meter Number
* Address

4.2 Meter Reading Management:
The system accepts:
* Previous meter reading
* Current meter reading

It automatically calculates:
Units Consumed = Current Reading - Previous Reading

The system also checks that the current reading is not smaller than the previous reading.

4.3 Electricity Bill Calculation

The system calculates electricity charges based on the number of units consumed.

The example tariff used in the project is:

| Units     |     Rate |
| --------- | -------: |
| 0–100     |  ₹3/unit |
| 101–200   |  ₹5/unit |
| 201–300   |  ₹7/unit |
| Above 300 | ₹10/unit |

Additional charges include:
* Fixed charge: ₹100
* Tax: 5% of energy charges

Note: These tariff values are example values used for academic purposes and can be modified according to project requirements.

4.4 Bill Generation:
The system generates a bill containing:

* Customer details
* Meter readings
* Units consumed
* Energy charges
* Fixed charges
* Tax
* Total bill amount

4.5 Payment Status:
The system accepts the payment status from the user and displays:
PAID
or
PENDING

---

5. Project Workflow:
Customer Details
       ↓
Meter Readings
       ↓
Calculate Units
       ↓
Calculate Energy Charges
       ↓
Add Fixed Charges
       ↓
Calculate Tax
       ↓
Calculate Total Bill
       ↓
Payment Status
       ↓
Display Final Bill

---

6. Technologies Used

* Programming Language:Java
* Programming Concept:Object-Oriented Programming
* Input Handling:Scanner
* Application Type:Console-Based Application
* Development Environment:VS Code / Java IDE

---

7. Java Classes
The project is divided into five Java classes:
Main.java
Customer.java
BillCalculator.java
Bill.java
Payment.java

Main.Java:
Controls the complete application and takes input from the user.

Customer.java:
Stores customer information.

BillCalculator.java:
Calculates electricity charges based on units consumed.

Bill.java:
Calculates and displays the complete bill.

Payment.java:
Handles the payment status of the bill.

---

8. Expected Outcome:
The expected outcome of this project is a simple Java application that can automatically calculate an electricity bill from meter readings and display the complete bill information.
The project demonstrates how Java classes can be divided into separate modules to create a structured and maintainable application.

---

9. Future Scope:
The project can be further improved by adding:

* MySQL database connectivity.
* Admin and customer login.
* Multiple customer management.
* Add, update, delete and search operations.
* Monthly electricity bill history.
* Graphical User Interface (GUI).
* PDF bill generation.
* Online payment system.
* Consumption reports and charts.
* Automated notifications.

---

10. Conclusion
The Smart Electricity Bill Management System provides a simple computerized solution for electricity bill calculation. It reduces manual calculations and provides a structured way to manage customer information, meter readings, bill calculation, and payment status.

The project also provides practical experience with Java, Object-Oriented Programming, modular programming, input handling, and basic validation.
