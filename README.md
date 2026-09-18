 Smart-Electricity-Billing-and-Consumer-Management-System
 Electricity Bill Management System

Project Overview

The "Smart Electricity Billing and Consumer Management System" is a simple Java-based console application designed to calculate and manage electricity bills.

The main purpose of this project is to make electricity bill calculation easier and reduce manual calculation errors. The system takes customer details and meter readings as input, calculates the electricity units consumed, generates the bill, and displays the payment status.

This project is developed using "Java and Object-Oriented Programming (OOP)" concepts.


Problem Statement:
Manual electricity bill calculation requires maintaining customer information, calculating consumed units, applying different electricity rates, and calculating the final bill amount.
Doing these calculations manually can take time and may result in errors.
This project provides a simple computerized solution where customer details and meter readings are entered into the system, and the electricity bill is automatically calculated.


Objectives

The main objectives of this project are:
* To automate electricity bill calculation.
* To store and display customer details.
* To calculate electricity units from meter readings.
* To apply different electricity rates according to units consumed.
* To calculate fixed charges and tax.
* To display the final electricity bill.
* To maintain payment status.
* To demonstrate Java Object-Oriented Programming concepts.


Features:

Customer Management
* Enter customer ID.
* Enter customer name.
* Enter meter number.
* Enter customer address.

Meter Reading:

* Enter previous meter reading.
* Enter current meter reading.
* Automatically calculate units consumed.

Bill Calculation:
The system calculates the electricity bill according to the following example tariff:

| Units Consumed |         Rate |
| -------------- | -----------: |
| 0–100          |  ₹3 per unit |
| 101–200        |  ₹5 per unit |
| 201–300        |  ₹7 per unit |
| Above 300      | ₹10 per unit |


The system also adds:
* Fixed charge = ₹100
* Tax = 5% of energy charges

Note:The tariff values used in this project are example values for academic purposes and can be changed according to the required tariff structure.

Bill Generation:

The system displays:

* Customer information
* Meter readings
* Units consumed
* Energy charges
* Fixed charges
* Tax
* Total bill
* Payment status

Payment Status:
The user can enter:

text
yes
or
text
no

The system then displays:

text
PAID
or
text
PENDING

Technologies Used

* Programming Language: Java
* Concept:Object-Oriented Programming
* Input:Java Scanner
* Data Type:Primitive data types and String
* Development Environment:VS Code / IntelliJ IDEA / Eclipse
* Version Control:Git and GitHub


Java Concepts Used

This project demonstrates several basic Java concepts:

* Classes and Objects
* Constructors
* Methods
* Encapsulation
* Conditional Statements
* Arithmetic Operations
* String Handling
* Scanner Class
* Static Methods
* Basic Validation
* Modular Programming


Project Structure

ElectricityBillManagement/
│
├── Main.java
├── Customer.java
├── BillCalculator.java
├── Bill.java
├── Payment.java
│
└── README.md


Description of Files

| File                  | Purpose                                             |
| --------------------- | --------------------------------------------------- |
| Main.java            | Takes input and controls the complete program       |
| Customer.java       | Stores and displays customer information            |
| BillCalculator.java | Calculates electricity charges                      |
| Bill.java           | Calculates units, tax, fixed charges and total bill |
| Payment.java        | Handles payment status                              |
| README.md           | Contains project documentation                      |


System Workflow:
START
  ↓
Enter Customer Details
  ↓
Enter Previous Meter Reading
  ↓
Enter Current Meter Reading
  ↓
Calculate Units Consumed
  ↓
Calculate Energy Charges
  ↓
Add Fixed Charges
  ↓
Calculate Tax
  ↓
Calculate Total Bill
  ↓
Enter Payment Status
  ↓
Display Electricity Bill
  ↓
END


Input:

The system requires the following information:

Customer ID
Customer Name
Meter Number
Address
Previous Meter Reading
Current Meter Reading
Payment Status

Output:

The system generates an electricity bill similar to:

======================================
           ELECTRICITY BILL
======================================
Customer ID       : 101
Customer Name     : Bhumika
Meter Number      : M1001
Address           : Bhopal
--------------------------------------
Previous Reading  : 1200
Current Reading   : 1450
Units Consumed    : 250
--------------------------------------
Energy Charges    : Rs. 1350.00
Fixed Charges     : Rs. 100.00
Tax (5%)          : Rs. 67.50
--------------------------------------
TOTAL BILL        : Rs. 1517.50
Payment Status    : PAID
======================================


Installation and Setup
Step 1: Install Java
Install the Java Development Kit (JDK) on your computer.
Check whether Java is installed:

bash
java -version

Also check the Java compiler:

bash
javac -version


Step 2: Clone the Repository

Clone the GitHub repository:

bash
git clone <your-github-repository-link>


Step 3: Open the Project
Open the project folder in VS Code or another Java IDE.

Step 4: Compile the Program

Open the terminal inside the project folder and run:

bash
javac *.java


Step 5: Run the Program\
Run:

bash
java Main


Testing:

The project can be tested using different meter readings.
Test Case 1: Valid Reading

text
Previous Reading: 1000
Current Reading: 1100

Expected:
Units Consumed: 100

Test Case 2: Higher Consumption

Previous Reading: 1200
Current Reading: 1500


Expected:
Units Consumed: 300

Test Case 3: Invalid Reading


Previous Reading: 1500
Current Reading: 1200


Expected:
Error: Current reading cannot be less than previous reading.

Test Case 4: Payment
Input:
yes

Expected:
Payment Status: PAID

Input:
no


Expected:
Payment Status: PENDING


Error Handling
The system performs basic validation of meter readings.
If the current meter reading is smaller than the previous reading, the program displays an error message and stops the billing process.

Error: Current reading cannot be less than previous reading.


Future Enhancements:
The current project is a basic console application. It can be improved by adding:
* Admin and customer login.
* Multiple customer records.
* Add, update, delete and search customers.
* Store data using files.
* Database connectivity using MySQL.
* Monthly bill history.
* Online payment functionality.
* Automatic bill generation.
* Graphical User Interface (GUI).
* PDF bill generation.
* Electricity consumption charts.
* Email/SMS bill notifications.


Learning Outcomes:

After completing this project, we can understand:

* How Java classes and objects work.
* How multiple Java classes communicate with each other.
* How methods can be used to divide a program into smaller parts.
* How conditional statements can be used for bill calculation.
* How user input can be handled using the Scanner class.
* How basic validation can be implemented.
* How to create a modular Java application.


Project Type:
Academic / Educational Project
Language:Java
Application Type:Console-Based Application
Domain:Electricity / Utility Management


Conclusion:
The "Electricity Bill Management System" provides a simple way to calculate and display electricity bills using Java. It reduces the need for manual calculations and demonstrates important Java programming and Object-Oriented Programming concepts.

The project can later be extended with database connectivity, a graphical interface, multiple users, payment processing, and bill history to create a more complete electricity management system.


References:
* Java programming concepts and Object-Oriented Programming concepts.
* Java Scanner and standard Java library documentation.
* Project concepts based on the requirements provided for the VITyarthi Build Your Own Project.
