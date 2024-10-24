import java.io.File;
import java.util.Scanner;

class FileInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter file name: ");
        File file = new File(scanner.nextLine());

        System.out.println("File exists: " + file.exists());
        if (file.exists()) {
            System.out.println("Readable: " + file.canRead());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Type: " + (file.isDirectory() ? "Directory" : "File"));
            System.out.println("Size: " + file.length() + " bytes");
        }

        scanner.close();
    }
}
