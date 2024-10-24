import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Student {
    // Attributes
    int rollNo;
    String name;
    String studentClass;
    float percentage;

    // Method to display student information
    void displayInfo() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Class: " + studentClass);
        System.out.println("Percentage: " + percentage + "%");
    }
}

class StudentInfo {
    public static void main(String[] args) {
        // Create a BufferedReader to read input from the console
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Student student = new Student(); // Create a new Student object

        try {
            // Read student information from the console
            System.out.print("Enter Roll Number: ");
            student.rollNo = Integer.parseInt(reader.readLine()); // Read and parse roll number

            System.out.print("Enter Name: ");
            student.name = reader.readLine(); // Read name

            System.out.print("Enter Class: ");
            student.studentClass = reader.readLine(); // Read class

            System.out.print("Enter Percentage: ");
            student.percentage = Float.parseFloat(reader.readLine()); // Read and parse percentage

            // Display the student information
            System.out.println("\nStudent Information:");
            student.displayInfo();

        } catch (IOException e) {
            System.out.println("Error reading input: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Please enter valid numbers for Roll Number and Percentage.");
        }
    }
}
