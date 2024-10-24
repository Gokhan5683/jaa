import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
class CopyFileContents {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter source file name: ");
        String sourceFileName = scanner.nextLine();

        System.out.print("Enter destination file name: ");
        String destinationFileName = scanner.nextLine();

        try (Scanner fileReader = new Scanner(new File(sourceFileName));
             FileWriter fileWriter = new FileWriter(destinationFileName)) {

            while (fileReader.hasNextLine()) {
                fileWriter.write(fileReader.nextLine() + System.lineSeparator());
            }

            System.out.println("Contents copied successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
