import java.util.Scanner;
class Bank {
    private double balance = 0.0;
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: $" + amount);
        } else {
            System.out.println("Amount must be positive.");
        }
    }
    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrew: $" + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }
    void displayBalance() {
        System.out.println("Current Balance: $" + balance);
    }
}
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank bank = new Bank();
        while (true) {
            System.out.print("\n1. Deposit\n2. Withdraw\n3. Balance\n4. Exit\nChoose: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Deposit Amount: ");
                    bank.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Withdraw Amount: ");
                    bank.withdraw(sc.nextDouble());
                    break;
                case 3:
                    bank.displayBalance();
                    break;
                case 4:
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
