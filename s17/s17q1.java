import java.util.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Customer {
    String name;
    String phoneNumber;

    Customer(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    void display() {
        System.out.println("Name: " + name + ", Phone Number: " + phoneNumber);
    }
}

class Depositor extends Customer {
    String accno;
    double balance;

    Depositor(String name, String phoneNumber, String accno, double balance) {
        super(name, phoneNumber);
        this.accno = accno;
        this.balance = balance;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Account Number: " + accno + ", Balance: " + balance);
    }
}

class Borrower extends Depositor {
    String loanNo;
    double loanAmt;

    Borrower(String name, String phoneNumber, String accno, double balance, String loanNo, double loanAmt) {
        super(name, phoneNumber, accno, balance);
        this.loanNo = loanNo;
        this.loanAmt = loanAmt;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Loan Number: " + loanNo + ", Loan Amount: " + loanAmt);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Borrower> customers = new ArrayList<>();

        System.out.print("Enter number of customers: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            System.out.print("Enter phone number: ");
            String phoneNumber = scanner.nextLine();
            System.out.print("Enter account number: ");
            String accno = scanner.nextLine();
            System.out.print("Enter balance: ");
            double balance = scanner.nextDouble();
            scanner.nextLine(); // Consume newline
            System.out.print("Enter loan number: ");
            String loanNo = scanner.nextLine();
            System.out.print("Enter loan amount: ");
            double loanAmt = scanner.nextDouble();
            scanner.nextLine(); // Consume newline

            Borrower customer = new Borrower(name, phoneNumber, accno, balance, loanNo, loanAmt);
            customers.add(customer);
        }

        System.out.println("\nCustomer Details:");
        for (Borrower customer : customers) {
            customer.display();
            System.out.println(); // For better spacing between customers
        }

        scanner.close();
    }
}

//javac s17q1.java
//java Main


