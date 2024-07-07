package java_Collections.wiproPBL;


import java.util.Vector;
import java.util.Iterator;

class Employese{
    int empid;
    String empName;
    float salary;

    public Employese(int empid , String empName , float salary){
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

public class vector {
    public static void main(String[] args) {
        Vector<Employese> veclist= new Vector<>();
        
        veclist.add(new Employese(1, "John Doe", 50000));
        veclist.add(new Employese(2, "Jane Smith", 60000));
        veclist.add(new Employese(3, "Michael Johnson", 55000));
        
        
        
        for(Employese e : veclist){
            e.getEmployeeDetails();
            System.out.println();
        }
        
        Iterator <Employese> it = veclist.iterator();  // here iterate an object , thst why we store it in an object and then print employee details.
        while(it.hasNext()){
            Employese emp = it.next();
            emp.getEmployeeDetails();
            System.out.println();
        }
    }
}

