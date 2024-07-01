package clg;

import java.util.Scanner;

class addition{
    float x;
    addition(float x){
        this.x = x;
    }
    public void adding(addition a2){
        System.out.println("Addition of "+this.x+" and "+a2.x+" is: "+(this.x + a2.x));
    }
}

public class question3 {
    public static void main(String[] args) {

        System.out.println("Enter the 1st number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int n2 = sc.nextInt();

        addition a1 = new addition(n1);
        addition a2 = new addition(n2);
        a1.adding(a2);
        sc.close();
    }
}