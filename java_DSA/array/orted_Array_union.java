package java_DSA.array;

import java.util.ArrayList;

public class orted_Array_union {

    public static ArrayList<Integer> union(int[] arr1,int[] arr2){
        int n = arr1.length;
        int m = arr2.length;
        ArrayList<Integer> union = new ArrayList<>();
        int i = 0 ; int j = 0;
        while(i<n && j<m){
            if(arr1[i] <= arr2 [j]){                     
                if(union.size() == 0 || union.get(union.size() -1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }else{
                if(union.size() == 0 || union.get(union.size() -1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        }

            while(i< n){                                       // check for the condition where arr1 is greater than arr2
                if(union.get(union.size() -1) != arr1[i]){
                    union.add(arr1[i]);
                }
                i++;
            }
            while(j < m){                                    // check for the condition where arr2 is greater than arr1
                if( union.get(union.size() -1) != arr2[j]){
                    union.add(arr2[j]);
                }
                j++;
            }
        return union;    
    }
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5} ;
        int arr2 [] = {1, 2, 3, 6, 7};
        System.out.println(union(arr1, arr2));
    }
}


// output [1,2,3,4,5,6,7]