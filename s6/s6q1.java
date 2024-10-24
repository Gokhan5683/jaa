class Employee {
    int id;
    String name, designation;
    double salary;
    Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Designation: " + designation + ", Salary: " + salary;
    }
}
public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee(101, "John Doe", "Software Engineer", 75000);
        System.out.println(emp);
    }
}
