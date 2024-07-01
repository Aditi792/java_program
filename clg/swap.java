package clg;

import java.util.Scanner;

class question1{
    int x;
    question1(int x){
        this.x = x;
    }
    public void swapping(question1 s2){
        this.x = this.x + s2.x; // s1.x becomes 30
        s2.x = this.x - s2.x; // s2.x becomes 10
        this.x = this.x - s2.x; // s1.x becomes 20
    }

}

public class swap{
    public static void main(String[] args) {
        
        System.out.println("Enter the 1st number : ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.println("Enter the 2nd number : ");
        int n2 = sc.nextInt();

        question1 s1 = new question1(n1);
        question1 s2 = new question1(n2);

        System.out.println("Before Swapping 1st number: "+s1.x);
        System.out.println("Before Swapping 2nd number: "+s2.x);

        s1.swapping(s2);

        System.out.println("After Swapping 1st number: "+s1.x);
        System.out.println("After Swapping 2nd number: "+s2.x);
        sc.close();
    }
}