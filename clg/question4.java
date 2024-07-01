package clg;

import java.util.Scanner;

class addition2{
    float x;
    addition2(float x){
        this.x = x;
    }
}

public class question4 {
    public static void main(String[] args) {

        System.out.println("Enter the 1st number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int n2 = sc.nextInt();  


        
        addition2 a1 = new addition2(n1);
        addition2 a2 = new addition2(n2);
        adding(a1, a2);

        sc.close();
    }
    
    static void adding(addition2 a1, addition2 a2){
        System.out.println("Addition of "+a1.x+" and "+a2.x+" is: "+(a1.x + a2.x));
    }
}