import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

class Donor {
    String name;
    int age;
    String bloodGroup;
    LocalDate lastDonationDate;

    Donor(String name, int age, String bloodGroup, LocalDate lastDonationDate) {
        this.name = name;
        this.age = age;
        this.bloodGroup = bloodGroup;
        this.lastDonationDate = lastDonationDate;
    }

    boolean isEligible() {
        return bloodGroup.equals("A+ve") && lastDonationDate.isBefore(LocalDate.now().minusMonths(6));
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Blood Group: " + bloodGroup +
               ", Last Donation Date: " + lastDonationDate;
    }
}

class Main {
    private static final String FILE_NAME = "donors.txt";

    public static void main(String[] args) {
        List<Donor> donors = new ArrayList<>();
        donors.add(new Donor("Alice", 25, "A+ve", LocalDate.parse("2023-03-01")));
        donors.add(new Donor("Bob", 30, "B+ve", LocalDate.parse("2023-05-01")));
        donors.add(new Donor("Charlie", 28, "A+ve", LocalDate.parse("2022-10-01")));

        writeDonorsToFile(donors);
        List<Donor> eligibleDonors = readEligibleDonorsFromFile();

        System.out.println("Eligible Donors with Blood Group A+ve who haven't donated in the last 6 months:");
        for (Donor donor : eligibleDonors) {
            System.out.println(donor);
        }
    }

    private static void writeDonorsToFile(List<Donor> donors) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (Donor donor : donors) {
                writer.write(donor.name + "," + donor.age + "," + donor.bloodGroup + "," + donor.lastDonationDate);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static List<Donor> readEligibleDonorsFromFile() {
        List<Donor> eligibleDonors = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int age = Integer.parseInt(parts[1]);
                String bloodGroup = parts[2];
                LocalDate lastDonationDate = LocalDate.parse(parts[3]);

                Donor donor = new Donor(name, age, bloodGroup, lastDonationDate);
                if (donor.isEligible()) {
                    eligibleDonors.add(donor);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading from file: " + e.getMessage());
        }
        return eligibleDonors;
    }
}
