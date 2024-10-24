import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
class DateTimeDisplay {
    public static void main(String[] args) {
        ZonedDateTime now = ZonedDateTime.now();

        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEEE MMMM dd yyyy");
        DateTimeFormatter formatter4 = DateTimeFormatter.ofPattern("E MMMM dd\nHH:mm:ss z yyyy");
        DateTimeFormatter formatter5 = DateTimeFormatter.ofPattern("dd/MM/yy hh:mm:ss a Z");

        System.out.println("Current date is : " + now.format(formatter1));
        System.out.println("Current date is : " + now.format(formatter2));
        System.out.println("Current date is : " + now.format(formatter3));
        System.out.println("Current date and time is : " + now.format(formatter4));
        System.out.println("Current date and time is : " + now.format(formatter5));
    }
}
