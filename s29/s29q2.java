import java.util.Scanner;

class Vehicle {
    String company;
    double price;

    Vehicle(String company, double price) {
        this.company = company;
        this.price = price;
    }

    void display() {
        System.out.println("Company: " + company + ", Price: " + price);
    }
}

class LightMotorVehicle extends Vehicle {
    double mileage;

    LightMotorVehicle(String company, double price, double mileage) {
        super(company, price);
        this.mileage = mileage;
    }

    void display() {
        super.display();
        System.out.println("Mileage: " + mileage + " km/l");
    }
}

class HeavyMotorVehicle extends Vehicle {
    double capacity;

    HeavyMotorVehicle(String company, double price, double capacity) {
        super(company, price);
        this.capacity = capacity;
    }

    void display() {
        super.display();
        System.out.println("Capacity: " + capacity + " tons");
    }
}

class VDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of vehicles: ");
        int n = sc.nextInt();
        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.print("\nEnter type (1 for Light, 2 for Heavy): ");
            int type = sc.nextInt();
            System.out.print("Company: ");
            String company = sc.next();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (type == 1) {
                System.out.print("Mileage (km/l): ");
                vehicles[i] = new LightMotorVehicle(company, price, sc.nextDouble());
            } else if (type == 2) {
                System.out.print("Capacity (tons): ");
                vehicles[i] = new HeavyMotorVehicle(company, price, sc.nextDouble());
            }
        }

        System.out.println("\nVehicle Information:");
        for (Vehicle v : vehicles) {
            if (v != null) {
                v.display();
                System.out.println("----------------");
            }
        }
    }
}
