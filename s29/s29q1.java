import java.util.ArrayList;
import java.util.Scanner;

class Customer {
    int custNo;
    String name, contact, address;

    Customer(int custNo, String name, String contact, String address) {
        this.custNo = custNo;
        this.name = name;
        this.contact = contact;
        this.address = address;
    }

    void display() {
        System.out.println("Customer No: " + custNo);
        System.out.println("Name: " + name);
        System.out.println("Contact: " + contact);
        System.out.println("Address: " + address);
    }
}

class CDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Customer> customers = new ArrayList<>();

        // Sample customers
        customers.add(new Customer(1, "Alice", "1234567890", "123 Elm St"));
        customers.add(new Customer(2, "Bob", "0987654321", "456 Oak St"));

        System.out.print("Enter contact number: ");
        String searchContact = sc.nextLine();

        for (Customer c : customers) {
            if (c.contact.equals(searchContact)) {
                c.display();
                return;  // Exit after finding the customer
            }
        }

        System.out.println("Customer not found.");
        sc.close();
    }
}
