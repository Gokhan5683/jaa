package s10q2;
public class StudentInfo {
    int rollno;
    String name, studentClass;
    double percentage;
    public StudentInfo(int rollno, String name, String studentClass, double percentage) {
        this.rollno = rollno;
        this.name = name;
        this.studentClass = studentClass;
        this.percentage = percentage;
    }
    public void displayInfo() {
        System.out.println("Roll No: " + rollno + ", Name: " + name + ", Class: " + studentClass + ", Percentage: " + percentage + "%");
    }
}
