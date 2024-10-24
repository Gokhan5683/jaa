// Base class Account
class Account {
    String custName;
    int accNo;

    // Default constructor
    public Account() {
        this.custName = "Unknown";
        this.accNo = 0;
    }

    // Parameterized constructor
    public Account(String custName, int accNo) {
        this.custName = custName;
        this.accNo = accNo;
    }

    // Method to display customer details
    public void displayDetails() {
        System.out.println("Customer Name: " + custName);
        System.out.println("Account Number: " + accNo);
    }
}

// Subclass SavingAccount
class SavingAccount extends Account {
    double savingBal;
    double minBal;

    // Default constructor
    public SavingAccount() {
        super();
        this.savingBal = 0.0;
        this.minBal = 0.0;
    }

    // Parameterized constructor
    public SavingAccount(String custName, int accNo, double savingBal, double minBal) {
        super(custName, accNo);
        this.savingBal = savingBal;
        this.minBal = minBal;
    }

    // Method to display savings account details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Saving Balance: " + savingBal);
        System.out.println("Minimum Balance: " + minBal);
    }
}

// Derived class AccountDetail
class AccountDetail extends SavingAccount {
    double depositAmt;
    double withdrawalAmt;

    // Default constructor
    public AccountDetail() {
        super();
        this.depositAmt = 0.0;
        this.withdrawalAmt = 0.0;
    }

    // Parameterized constructor
    public AccountDetail(String custName, int accNo, double savingBal, double minBal, double depositAmt, double withdrawalAmt) {
        super(custName, accNo, savingBal, minBal);
        this.depositAmt = depositAmt;
        this.withdrawalAmt = withdrawalAmt;
    }

    // Method to display all details
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Deposit Amount: " + depositAmt);
        System.out.println("Withdrawal Amount: " + withdrawalAmt);
    }
}
class Main {
    public static void main(String[] args) {
        // Create an object of AccountDetail class using parameterized constructor
        AccountDetail account = new AccountDetail("John Doe", 123456, 5000.0, 1000.0, 2000.0, 1500.0);

        // Display account details
        account.displayDetails();
    }
}
