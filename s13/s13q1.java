import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class FileWordLineCounter {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file name.");
            return;
        }

        int wordCount = 0, lineCount = 0;

        try (Scanner scanner = new Scanner(new File(args[0]))) {
            while (scanner.hasNextLine()) {
                lineCount++;
                String line = scanner.nextLine();
                wordCount += line.split("\\s+").length;
            }
            System.out.println("Lines: " + lineCount + ", Words: " + wordCount);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist.");
        }
    }
}
