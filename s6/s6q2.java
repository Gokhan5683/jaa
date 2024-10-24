import java.util.ArrayList;
import java.util.Scanner;

abstract class Order {
    int id;
    String description;

    abstract void accept();
    abstract void display();
}

class PurchaseOrder extends Order {
    String customerName;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Purchase Order ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Description: ");
        description = sc.nextLine();
        System.out.print("Customer Name: ");
        customerName = sc.nextLine();
    }

    void display() {
        System.out.println("PO ID: " + id + ", Desc: " + description + ", Customer: " + customerName);
    }
}

class SalesOrder extends Order {
    String vendorName;

    void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sales Order ID: ");
        id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Description: ");
        description = sc.nextLine();
        System.out.print("Vendor Name: ");
        vendorName = sc.nextLine();
    }

    void display() {
        System.out.println("SO ID: " + id + ", Desc: " + description + ", Vendor: " + vendorName);
    }
}

class ODemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Order> orders = new ArrayList<>();

        for (int i = 0; i < 3; i++) {
            System.out.println("\nPurchase Order " + (i + 1) + ":");
            PurchaseOrder po = new PurchaseOrder();
            po.accept();
            orders.add(po);
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("\nSales Order " + (i + 1) + ":");
            SalesOrder so = new SalesOrder();
            so.accept();
            orders.add(so);
        }

        System.out.println("\nOrder Details:");
        for (Order order : orders) {
            order.display();
        }

        sc.close();
    }
}
