import java.util.Scanner;
class Person {
    String name, aadhar, pan;
    Person(String name, String aadhar, String pan) {
        this.name = name;
        this.aadhar = aadhar;
        this.pan = pan;
    }
    void display() {
        System.out.println("Name: " + this.name + ", Aadhar: " + this.aadhar + ", PAN: " + this.pan);
    }
}
class PersonDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person[] people = new Person[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter Name, Aadhar, PAN for person " + (i + 1) + ":");
            people[i] = new Person(sc.next(), sc.next(), sc.next());
        }
        for (Person p : people) {
            p.display();
        }
    }
}
