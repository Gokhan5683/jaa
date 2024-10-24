import java.util.Arrays;
import java.util.Scanner;
public class CitySorter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        String[] cities = new String[n];
        for (int i = 0; i < n; i++) {
            cities[i] = scanner.nextLine();
        }
        Arrays.sort(cities);
        for (String city : cities) {
            System.out.println(city);
        }
    }
}
