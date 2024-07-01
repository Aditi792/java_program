package clg;

import java.util.Scanner;
class pattern1{
    float x;
    pattern1(float a){
        x = a;
    }

    public static void calc(pattern1 []arr, int len, float x){
        float result = 0.0f;
        for(int i=0;i<len;i++){
            arr[i] = new pattern1((float)Math.pow(x,(i+1)));
        }
        for(int i=0;i<len;i++){
            result = result + arr[i].x;
        }
        System.out.print("Result is sum of power is : "+result);
    }
}

public class question8_pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n , in x^n: ");
        int n = sc.nextInt();

        pattern1 pta[] = new pattern1[n];

        System.out.print("Enter the value of x , in x^n: ");
        float x  = sc.nextFloat();

        pattern1.calc(pta, n, x);

        sc.close();
    }
}
