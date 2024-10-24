import java.util.Scanner;
class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns for the first matrix: ");
        int cols1 = scanner.nextInt();
        System.out.print("Enter number of columns for the second matrix: ");
        int cols2 = scanner.nextInt();

        int[][] matrix1 = inputMatrix(rows, cols1, scanner);
        int[][] matrix2 = inputMatrix(cols1, cols2, scanner);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Matrices");
            System.out.println("2. Multiply Matrices");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    addMatrices(matrix1, matrix2);
                    break;

                case 2:
                    multiplyMatrices(matrix1, matrix2);
                    break;

                case 3:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice! Please choose again.");
            }
        }
    }

    static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the matrix (" + rows + "x" + cols + "):");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }

    static void addMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1.length != matrix2.length || matrix1[0].length != matrix2[0].length) {
            System.out.println("Matrices cannot be added.");
            return;
        }
        int[][] sum = new int[matrix1.length][matrix1[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[0].length; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }
        System.out.println("Sum of matrices:");
        printMatrix(sum);
    }

    static void multiplyMatrices(int[][] matrix1, int[][] matrix2) {
        if (matrix1[0].length != matrix2.length) {
            System.out.println("Matrices cannot be multiplied.");
            return;
        }
        int[][] product = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix2[0].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        System.out.println("Product of matrices:");
        printMatrix(product);
    }

    static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}

//javac s5q2.java
//java MatrixOperations

