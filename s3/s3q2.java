import java.util.*;
class InpatientException extends Exception {
    public InpatientException(String message) {
        super(message);
    }
}

// Patient class definition
class Patient {
    String name;
    int age;
    double oxygenLevel;
    int hrctReport;

    // Constructor
    public Patient(String name, int age, double oxygenLevel, int hrctReport) {
        this.name = name;
        this.age = age;
        this.oxygenLevel = oxygenLevel;
        this.hrctReport = hrctReport;
    }

    // Method to check health status
    public void checkHealthStatus() throws InpatientException {
        if (oxygenLevel < 95 && hrctReport > 10) {
            throw new InpatientException(name + " is COVID positive and needs to be hospitalized.");
        } else {
            System.out.println("Patient Information:");
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Oxygen Level: " + oxygenLevel + "%");
            System.out.println("HRCT Report: " + hrctReport);
        }
    }
}

// Main class
class Main {
    public static void main(String[] args) {
        // Creating a patient object
        Patient patient1 = new Patient("John Doe", 45, 92.5, 12);

        try {
            // Check patient's health status
            patient1.checkHealthStatus();
        } catch (InpatientException e) {
            // Handle custom exception
            System.out.println(e.getMessage());
        }
    }
}

//javac s3q2.java
//java Main


