package clg;

import java.util.Scanner;
class Sorting_Objects{
    int x;
    Sorting_Objects(int a){
        x = a;
    }
    static void sorting(Sorting_Objects [] arr,int len){
        int temp = 0;
        for(int i=0;i<len;i++){
            for(int j=1;j<(len-i);j++){
                if(arr[j-1].x > arr[j].x){
                    temp = arr[j-1].x;
                    arr[j-1].x = arr[j].x;
                    arr[j].x = temp;
                }
            }
        }
        System.out.print("\nAfter Sorting: ");
        for(int i=0;i<len;i++){
            System.out.print(arr[i].x+" ");
        }
    }
    
}

public class question7_sorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of objects: ");
        int n = sc.nextInt();

        Sorting_Objects sta[] = new Sorting_Objects[n];

        for(int i=0;i<n;i++){
            System.out.print("Enter the value in object "+(i+1)+": ");
            sta[i] = new Sorting_Objects(sc.nextInt());
        }

        System.out.print("Before Sorting: ");
        for(int i=0;i<sta.length;i++){
            System.out.print(sta[i].x+" ");
        }


        Sorting_Objects.sorting(sta,n);
        sc.close();
    }
}
