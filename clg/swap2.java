package clg;

import java.util.Scanner;

class question2{
    int x;
    question2(int x){
        this.x = x;
    }
}

public class swap2 {
    public static void main(String[] args) {

        System.out.println("Enter the 1st number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int n2 = sc.nextInt();

        question2 s1 = new question2(n1);
        question2 s2 = new question2(n2);
        System.out.println("Before Swapping 1st number: "+s1.x);
        System.out.println("Before Swapping 2nd number: "+s2.x);

        swapping(s1, s2);

        System.out.println("After Swapping 1st number: "+s1.x);
        System.out.println("After Swapping 2nd number: "+s2.x);
        
        sc.close();
    }

    static void swapping(question2 s1, question2 s2){
        s1.x = s1.x + s2.x; // s1.x becomes 30
        s2.x = s1.x - s2.x; // s2.x becomes 10
        s1.x = s1.x - s2.x; // s1.x becomes 20
    }
    
} 
