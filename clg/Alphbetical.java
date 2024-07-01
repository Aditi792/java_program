package clg;

import java.util.Arrays;
import java.util.Scanner;

public class Alphbetical {
    public static void main(String ...args){
        System.out.println("Enter the String : ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char a[]=s.toCharArray();

        Arrays.sort(a);
        System.out.println("In Alphabetical Order , it is : "+ new String(a));

        sc.close();
    }
}
