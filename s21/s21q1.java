import java.util.Scanner;
class InvalidDateException extends Exception {
    public InvalidDateException(String message) {
        super(message);
    }
}
class MyDate {
    private int day, month, year;
    public void acceptDate() throws InvalidDateException {
        Scanner scanner = new Scanner(System.in);  
        System.out.print("Enter day (dd): ");
        day = scanner.nextInt();
        System.out.print("Enter month (mm): ");
        month = scanner.nextInt();
        System.out.print("Enter year (yyyy): ");
        year = scanner.nextInt();
        if (!isValidDate()) {
            throw new InvalidDateException("Invalid date: " + day + "/" + month + "/" + year);
        }
    }
    public void displayDate() {
        System.out.println("Date: " + day + "/" + month + "/" + year);
    }
    private boolean isValidDate() {
        if (month < 1 || month > 12) return false;
        if (day < 1 || day > getDaysInMonth()) return false;
        return true;
    }
    private int getDaysInMonth() {
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12: return 31;
            case 4: case 6: case 9: case 11: return 30;
            case 2: return (isLeapYear()) ? 29 : 28;
            default: return 0;
        }
    }
    private boolean isLeapYear() {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
}
class DateTest {
    public static void main(String[] args) {
        MyDate date = new MyDate();
        try {
            date.acceptDate();
            date.displayDate();
        } catch (InvalidDateException e) {
            System.out.println(e.getMessage());
        }
    }
}
