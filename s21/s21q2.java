  class Employee {
    private int id;
    private String name;
    private String deptName;
    private double salary;

    // Static variable to keep count of Employee objects
    private static int objectCount = 0;

    // Default constructor
    public Employee() {
        this(0, "Unknown", "Not Assigned", 0.0); // Call parameterized constructor
    }

    // Parameterized constructor
    public Employee(int id, String name, String deptName, double salary) {
        this.id = id;
        this.name = name;
        this.deptName = deptName;
        this.salary = salary;
        objectCount++;
        System.out.println("Number of Employee objects created: " + objectCount);
    }

    // Method to display employee details
    public void display() {
        System.out.println("ID: " + id + ", Name: " + name + ", Department: " + deptName + ", Salary: $" + salary);
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "Alice", "HR", 60000);
        emp1.display();

        Employee emp2 = new Employee(2, "Bob", "IT", 75000);
        emp2.display();

        Employee emp3 = new Employee(); // Default constructor
        emp3.display();
    }
}
