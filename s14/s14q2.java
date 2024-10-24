// Main class Student in the default package
import Sy.Sy;
import Ty.Ty;
import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    Sy sy;
    Ty ty;

    // Constructor to initialize the student's details
    public Student(int rollNumber, String name, Sy sy, Ty ty) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.sy = sy;
        this.ty = ty;
    }

    // Method to calculate total Computer marks and determine grade
    public String calculateGrade() {
        int totalComputerMarks = sy.computerTotal + ty.theory + ty.practicals;
        if (totalComputerMarks >= 70) {
            return "A";
        } else if (totalComputerMarks >= 60) {
            return "B";
        } else if (totalComputerMarks >= 50) {
            return "C";
        } else if (totalComputerMarks >= 40) {
            return "Pass Class";
        } else {
            return "FAIL";
        }
    }

    // Method to display student result
    public void displayResult() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("SY Computer Total: " + sy.computerTotal);
        System.out.println("TY Computer Theory: " + ty.theory);
        System.out.println("TY Computer Practicals: " + ty.practicals);
        System.out.println("Total Computer Marks: " + (sy.computerTotal + ty.theory + ty.practicals));
        System.out.println("Grade: " + calculateGrade());
        System.out.println("-----------------------------");
    }
}

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        Student[] students = new Student[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");

            System.out.print("Enter Roll Number: ");
            int rollNumber = sc.nextInt();
            sc.nextLine(); // Consume the newline character

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter SY Computer Marks: ");
            int syComputer = sc.nextInt();

            System.out.print("Enter SY Maths Marks: ");
            int syMaths = sc.nextInt();

            System.out.print("Enter SY Electronics Marks: ");
            int syElectronics = sc.nextInt();

            System.out.print("Enter TY Theory Marks: ");
            int tyTheory = sc.nextInt();

            System.out.print("Enter TY Practicals Marks: ");
            int tyPracticals = sc.nextInt();

            // Create Sy and Ty objects
            Sy sy = new Sy(syComputer, syMaths, syElectronics);
            Ty ty = new Ty(tyTheory, tyPracticals);

            // Create Student object and add to the array
            students[i] = new Student(rollNumber, name, sy, ty);
        }

        // Display results for all students
        System.out.println("Student Results:");
        System.out.println("=============================");
        for (Student student : students) {
            student.displayResult();
        }

        sc.close();
    }
}
