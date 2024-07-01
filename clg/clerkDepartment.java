package clg;
import java.util.Scanner;

class Staff {
    protected int code;
    private String name;
    Scanner sc = new Scanner(System.in);

    public Staff getData() {
        System.out.println("Enter staff info : Code and Name");
        code = sc.nextInt();
        sc.nextLine();
        name = sc.nextLine();
        return this;
    }

    public void showInfo() {
        System.out.println("Code : " + code + "\nName : " + name);
    }
}

class Clerk extends Staff {
    private String department;

    public Clerk clerkInfo() {
        System.out.println("Clerk : ");
        getData();
        System.out.println("Department : ");
        department = sc.nextLine();
        return this;
    }

    public void Info1() {
        showInfo();
        System.out.println("Staff Type : Clerk");
        System.out.println("Clerk Department : " + department);
    }
}

class Officer extends Staff {
    private String grade;

    public Officer officerInfo() {
        System.out.println("Officer : ");
        getData();
        System.out.println("Grade : ");
        grade = sc.nextLine();
        return this;
    }

    public void Info2() {
        showInfo();
        System.out.println("Staff Type : Officer");
        System.out.println("Officer Grade : " + grade);
    }
}

class Teacher extends Staff {
    private String subject;
    private String department;

    public Teacher teacherInfo() {
        System.out.println("Teacher : ");
        getData();
        System.out.println("Subject and department:");
        subject = sc.nextLine();
        department = sc.nextLine();
        return this;
    }

    public void Info3() {
        showInfo();
        System.out.println("Staff Type : Teacher");
        System.out.println("Teacher subject " + subject + " and Department : " + department);
    }
}

public class clerkDepartment {
    public static void main(String[] args) {
        Staff st[] = createEmployeeObject();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter staff code to be searched");
        int code = sc.nextInt();
        Staff re = getEmployeeInfo(st, code);
        if(re != null){
            if (re instanceof Clerk){
                ((Clerk) re).Info1();
            }
            else if(re instanceof Officer)
                ((Officer)re).Info2();
            else if(re instanceof  Teacher)
                ((Teacher) re).Info3();
        }
        else
            System.out.println("Inavlid record");
sc.close();
    }

    public static Staff[] createEmployeeObject() {
        Staff emp[] = {
                new Staff().getData(),
                new Clerk().clerkInfo(),
                new Officer().officerInfo(),
                new Teacher().teacherInfo(),
        };
        return emp;
    }

    public static Staff getEmployeeInfo(Staff[] s, int code) {
        for (Staff st : s) {
            if (st.code == code) {
                return st;
            }
        }
        return null;
    }
}