import java.io.File;
import java.io.IOException;
import java.util.Scanner;

class FileChecker {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a file or directory path as a command line argument.");
            return;
        }

        String path = args[0];
        File file = new File(path);

        if (file.isDirectory()) {
            deleteTextFiles(file);
        } else if (file.isFile()) {
            displayFileDetails(file);
        } else {
            System.out.println("The provided path is neither a file nor a directory.");
        }
    }

    private static void deleteTextFiles(File directory) {
        File[] files = directory.listFiles();
        if (files == null) {
            System.out.println("Error accessing the directory.");
            return;
        }

        int deletedCount = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Are you sure you want to delete all text files in this directory? (yes/no): ");
        String confirmation = scanner.nextLine();

        if (confirmation.equalsIgnoreCase("yes")) {
            for (File file : files) {
                if (file.isFile() && file.getName().endsWith(".txt")) {
                    if (file.delete()) {
                        deletedCount++;
                    }
                }
            }
            System.out.println(deletedCount + " text file(s) deleted.");
        } else {
            System.out.println("Delete operation canceled.");
        }
    }

    private static void displayFileDetails(File file) {
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("File Size: " + file.length() + " bytes");
    }
}
