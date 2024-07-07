package java_Collections;

import java.util.LinkedList;

class EmployeeDb{

    LinkedList<Employeee> list = new LinkedList<>();

    public boolean showEmployee(int empid){
        for(Employeee e : list){
            if(e.empid == empid){
                e.getEmployeeDetails();
                return true;
            }
        }
        return false;
    }

    public void addEmployeee(Employeee e){
        list.add(e);
    }

    public String removeEMployee(int empId){
        for(Employeee e : list){
            if(e.empid == empId){
                list.remove(e);
                return "Employee removed successfully";
            }
        }
        return "employee not found ";
    }
}


class Employeee{
    int empid;
    String empName;
    float salary;

    public Employeee(int empid , String empName , float salary){
        this.empid = empid;
        this.empName = empName;
        this.salary = salary;

    }

    public void getEmployeeDetails(){
        System.out.println("Employee id is : " + empid);
        System.out.println("Employee name is : " + empName);
        System.out.println("Employee salary is : " + salary);
    }

}


public class Linked_List_employee {
    public static void main(String[] args) {
        Employeee emp1 = new Employeee(1, "aditi",  1000);
        Employeee emp2 = new Employeee(2, "aditi1",  1000);

        EmployeeDb emp = new EmployeeDb();
        emp.addEmployeee(emp1);
        emp.addEmployeee(emp2);

        emp.removeEMployee(2);

        emp.showEmployee(1);
    }
}

/*
 * Employee id is : 1
Employee name is : aditi
Employee salary is : 1000.0
 */