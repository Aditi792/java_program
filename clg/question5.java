package clg;

import java.util.Scanner;

class addition3{
    float x;
    addition3(float x){
        this.x = x;
    }
}

public class question5 {
    public static void main(String[] args) {

        System.out.println("Enter the 1st number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int n2 = sc.nextInt();  


        addition3 a1 = new addition3(n1);
        addition3 a2 = new addition3(n2);
        addition3 a3 = adding(a1, a2);
        System.out.println("Addition of "+a1.x+" and "+a2.x+" is: "+a3.x);

        sc.close();
    }
    static addition3 adding(addition3 a1, addition3 a2){
        float result = a1.x + a2.x;
        return new addition3(result);
    }
}
