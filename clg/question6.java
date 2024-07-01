package clg;

import java.util.*;

class addition4{
    float x;
    addition4(float x){
        this.x = x;
    }
    public addition4 adding(addition4 a2){
        float result = this.x + a2.x;
        return new addition4(result);
    }
}

public class question6 {
    public static void main(String[] args) {

        System.out.println("Enter the 1st number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int n2 = sc.nextInt();  

        addition4 a1 = new addition4(n1);
        addition4 a2 = new addition4(n2);
        addition4 a3 = a1.adding(a2);
        System.out.println("Addition of "+a1.x+" and "+a2.x+" is: "+a3.x);
        sc.close();
    }
}
