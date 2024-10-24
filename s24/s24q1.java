// Abstract class Bank
abstract class Bank {
    abstract int getBalance();  // Abstract method to get balance
}
// BankA with balance Rs.100
class BankA extends Bank {
    int getBalance() {
        return 100;
    }
}
// BankB with balance Rs.150
class BankB extends Bank {
    int getBalance() {
        return 150;
    }
}
// BankC with balance Rs.200
class BankC extends Bank {
    int getBalance() {
        return 200;
    }
}
// Main class
class Main {
    public static void main(String[] args) {
        System.out.println("Bank A: Rs." + new BankA().getBalance());
        System.out.println("Bank B: Rs." + new BankB().getBalance());
        System.out.println("Bank C: Rs." + new BankC().getBalance());
    }
}
