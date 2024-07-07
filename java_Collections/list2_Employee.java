package java_Collections;

import java.util.ArrayList;

class EmployeeDB{

    ArrayList <Employee> list = new ArrayList<>();   //This declares an ArrayList that will hold objects of type Employee. Employee is assumed to be a predefined class.

    // public EmployeeDB(){
    //     list  = new ArrayList<>();
    // }

    public boolean addEmployee(Employee e){  //This is a method that takes an Employee object e as a parameter and returns a boolean value.
        return list.add(e);      //This adds the Employee object e to the ArrayList list. 
    }

    public boolean deleteEmployee(int empID){
        for(Employee e : list){       // it iterates over each Employee object e in the ArrayList list
            if(e.empID == empID){
                list.remove(e);
                return true;
            }
        }
        return false;
    }

    public String showPaySlip(int empid){
        for(Employee e : list){
            if(e.empID == empid){
                return "Employee salary of the empID "+ empid + "is "+ e.salary;
            }
        }
        return "Employee not found";
    }
}



class Employee{
    int empID;
    String empNAme;
    String email;
    String gender;
    float salary;
    public Employee(int empID, String empNAme, String email, String gender, float salary) {
        this.empID = empID;
        this.empNAme = empNAme;
        this.email = email;
        this.gender = gender;
        this.salary = salary;
    }

    public void getEmployeeDetails(){
        System.out.println("Employee id is : " + empID +"\n" +
                        "Employee name is : " + empNAme + "\n"+
                        "Employee email is : "+ email + "\n"+
                        "Employee gender is : " + gender + "\n"+
                        "Employee salary is : "+salary + "\n");
    }
}

public class list2_Employee {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "aditi", "aditi@gmail.com", "female", 1000);
        Employee emp2 = new Employee(2, "aditi1", "aditi@gmail.com", "female", 1000);

        EmployeeDB emp = new EmployeeDB();
        emp.addEmployee(emp1);
        emp.addEmployee(emp2); 
        
        emp1.getEmployeeDetails();
        emp2.getEmployeeDetails();

        System.out.println(emp.showPaySlip(1));
        System.out.println(emp.showPaySlip(2));

        emp.deleteEmployee(2);

        System.out.println(emp.showPaySlip(2));
    }
}
