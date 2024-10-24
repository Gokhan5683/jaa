import java.util.*;
import java.util.Scanner;

// Define a functional interface
@FunctionalInterface
interface Square {
    int calculate(int number);
}

class SquareCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create the functional interface implementation using a lambda expression
        Square squareFunction = number -> number * number;

        // Accept user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Calculate and display the square
        System.out.println("The square of " + number + " is: " + squareFunction.calculate(number));
        
        scanner.close();
    }
}

//javac s16q1.java
//java SquareCalculator

