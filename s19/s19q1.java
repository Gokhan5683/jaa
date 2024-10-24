import java.util.*;
import java.util.Scanner;

class DiagonalSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get the size of the matrix
        System.out.print("Enter the size of the matrix (n x n): ");
        int n = scanner.nextInt();
        
        // Initialize the matrix
        int[][] matrix = new int[n][n];
        
        // Input the matrix
        System.out.println("Enter the elements of the matrix row by row:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        
        // Calculate the sum of diagonal elements
        int diagonalSum = 0;
        for (int i = 0; i < n; i++) {
            diagonalSum += matrix[i][i];  // Main diagonal elements
        }
        
        // Display the result
        System.out.println("Sum of diagonal elements: " + diagonalSum);
        
        scanner.close();
    }
}

//javac s19q1.java
//java DiagonalSum

