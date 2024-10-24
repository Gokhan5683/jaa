// Marker interface
interface ProductMarker {}

class Product implements ProductMarker {
    private static int count = 0; // Static variable to count products
    private int productId;
    private String productName;
    private double productCost;
    private int productQuantity;

    // Default constructor
    public Product() {
        this.productId = 0;
        this.productName = "Unknown";
        this.productCost = 0.0;
        this.productQuantity = 0;
        count++; // Increment count
    }

    // Parameterized constructor
    public Product(int productId, String productName, double productCost, int productQuantity) {
        this.productId = productId;
        this.productName = productName;
        this.productCost = productCost;
        this.productQuantity = productQuantity;
        count++; // Increment count
    }

    // Method to display product details
    public void display() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Cost: $" + productCost);
        System.out.println("Product Quantity: " + productQuantity);
        System.out.println();
    }

    // Static method to get the count of products
    public static int getCount() {
        return count;
    }

    // Main method for testing
    public static void main(String[] args) {
        Product product1 = new Product(1, "Laptop", 999.99, 10);
        Product product2 = new Product(2, "Smartphone", 499.99, 20);
        Product product3 = new Product(); // Using default constructor

        // Displaying products
        product1.display();
        product2.display();
        product3.display();

        // Displaying the total number of products
        System.out.println("Total Products Created: " + Product.getCount());
    }
}

//javac s9q2.java
//java Product

