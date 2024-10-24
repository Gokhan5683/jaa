package s10q2;
import java.util.Scanner;
public class StudentPer {
    public double calculatePercentage(int[] marks) {
        int total = 0;
        for (int mark : marks) total += mark;
        return total / 6.0;
    }
    public void inputStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Roll No: ");
        int rollno = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Class: ");
        String studentClass = sc.nextLine();
        int[] marks = new int[6];
        for (int i = 0; i < 6; i++) {
            System.out.print("Subject " + (i + 1) + " Marks: ");
            marks[i] = sc.nextInt();
        }
        double percentage = calculatePercentage(marks);
        StudentInfo student = new StudentInfo(rollno, name, studentClass, percentage);
        student.displayInfo();
        sc.close();
    }
}
