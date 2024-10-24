class Item {
    private int number;
    private String name;
    private double price;
    private static int count = 0; // Static variable to count objects

    // Parameterized constructor
    public Item(int number, String name, double price) {
        this.number = number;
        this.name = name;
        this.price = price;
        count++;
        System.out.println("Object Count: " + count);
    }

    // Method to display item details
    public void display() {
        System.out.println("Item Number: " + number + ", Name: " + name + ", Price: $" + price);
    }

    // Static method to get the object count
    public static int getCount() {
        return count;
    }

    public static void main(String[] args) {
        // Create objects using parameterized constructor
        Item item1 = new Item(1, "Laptop", 1200.00);
        item1.display();

        Item item2 = new Item(2, "Smartphone", 800.00);
        item2.display();

        Item item3 = new Item(3, "Headphones", 150.00);
        item3.display();

        // Display total number of objects created
        System.out.println("Total Items Created: " + Item.getCount());
    }
}
