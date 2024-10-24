import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class FileChange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the path of the text file: ");
        String filePath = scanner.nextLine();

        ArrayList<String> lines = new ArrayList<>();

        // Read the file using Scanner
        try (Scanner fileScanner = new Scanner(new File(filePath))) {
            while (fileScanner.hasNextLine()) {
                lines.add(fileScanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            return;
        }

        // Reverse the order of lines
        Collections.reverse(lines);
        for (String line : lines) {
            System.out.println(changeCase(line));
        }

        scanner.close();
    }

    // Method to change the case of each character in the string
    private static String changeCase(String line) {
        StringBuilder changedLine = new StringBuilder();
        for (char c : line.toCharArray()) {
            changedLine.append(Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c));
        }
        return changedLine.toString();
    }
}
