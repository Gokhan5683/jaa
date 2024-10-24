class College {
    private int cno;
    private String cname;
    private String caddr;

    public College(int cno, String cname, String caddr) {
        this.cno = cno;
        this.cname = cname;
        this.caddr = caddr;
    }

    public void displayCollegeDetails() {
        System.out.println("College Number: " + cno);
        System.out.println("College Name: " + cname);
        System.out.println("College Address: " + caddr);
    }
}

class Department extends College {
    private int dno;
    private String dname;

    public Department(int cno, String cname, String caddr, int dno, String dname) {
        super(cno, cname, caddr);
        this.dno = dno;
        this.dname = dname;
    }

    public void displayDepartmentDetails() {
        displayCollegeDetails();
        System.out.println("Department Number: " + dno);
        System.out.println("Department Name: " + dname);
    }
}

public class Main {
    public static void main(String[] args) {
        Department department = new Department(101, "ABC College", "123 College St", 10, "Computer Science");
        department.displayDepartmentDetails();
    }
}
