class Employee {
    String name;
    double salary;

    Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double getSalary() {
        return salary;
    }
}

class Manager extends Employee {
    double travelAllowance, houseRentAllowance;

    Manager(String name, double salary, double travel, double rent) {
        super(name, salary);
        travelAllowance = travel;
        houseRentAllowance = rent;
    }

    double getSalary() {
        return salary + travelAllowance + houseRentAllowance;
    }
}

class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 50000);
        System.out.println(emp.name + "'s Salary: " + emp.getSalary());

        Manager mgr = new Manager("Jane", 70000, 10000, 15000);
        System.out.println(mgr.name + "'s Salary: " + mgr.getSalary());
    }
}
