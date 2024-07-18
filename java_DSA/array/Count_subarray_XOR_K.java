package java_DSA.array;
/*
 * Given an array of integers A and an integer B.
Find the total number of subarrays having bitwise XOR of all elements equals to B.

Return the total number of subarrays having bitwise XOR equals to B.

Input 1:

 A = [4, 2, 2, 6, 4]
 B = 6
 Output: 4

Input 2:

 A = [5, 6, 7, 8, 9]
 B = 5
 Output : 2

 Explanation 1:

 The subarrays having XOR of their elements as 6 are:
 [4, 2], [4, 2, 2, 6, 4], [2, 2, 6], [6]
Explanation 2:

 The subarrays having XOR of their elements as 5 are [5] and [5, 6, 7, 8, 9]

 */
import java.util.HashMap;

public class Count_subarray_XOR_K {

    //with TC O(n^2) , SC O(1)

    public static int CountSubArr(int[] arr,int K){
        int count = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            int BXOR = 0;
            for(int j = i ; j<arr.length ; j++){
                BXOR = BXOR ^ arr[j];
                if(BXOR == K) count++;
            }
        }
        return count;
    }

    //with TC O(n) , SC O(n)

    public static int solve(int[] A, int B) {
        HashMap <Integer,Integer> mapp = new HashMap<>();
        int count = 0;
        int XOR = 0;
        mapp.put(XOR,1);
        for(int i = 0 ; i<A.length ; i++){
            XOR = XOR ^ A[i];
            int rem = XOR ^ B;
            if(mapp.containsKey(rem)){
                count += mapp.getOrDefault(rem, 0);
            } 
            else{
                mapp.put(XOR, mapp.getOrDefault(XOR, 0)+1);
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9};
        System.out.println(CountSubArr(arr, 6));
        System.out.println(solve(arr, 5));
    }
}