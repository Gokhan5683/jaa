import java.util.*;
import java.util.Scanner;
class Continent {
    String continentName;

    void input() {
        System.out.print("Enter Continent Name: ");
        continentName = new Scanner(System.in).nextLine();
    }
}

class Country extends Continent {
    String countryName;

    void input() {
        super.input();
        System.out.print("Enter Country Name: ");
        countryName = new Scanner(System.in).nextLine();
    }
}

class State extends Country {
    String stateName;

    void input() {
        super.input();
        System.out.print("Enter State Name: ");
        stateName = new Scanner(System.in).nextLine();
    }
}

class Place extends State {
    String placeName;

    void input() {
        super.input();
        System.out.print("Enter Place Name: ");
        placeName = new Scanner(System.in).nextLine();
    }

    void display() {
        System.out.println("\nContinent: " + continentName);
        System.out.println("Country: " + countryName);
        System.out.println("State: " + stateName);
        System.out.println("Place: " + placeName);
    }
}

class Main {
    public static void main(String[] args) {
        Place place = new Place();
        place.input();
        place.display();
    }
}

//javac s20q1.java
//java Main

