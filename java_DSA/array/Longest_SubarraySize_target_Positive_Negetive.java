package java_DSA.array;

import java.util.HashMap;

/*
 * Given an array arr containing n integers and an integer k. 
 * Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value k.


Input :
arr[] = {10, 5, 2, 7, 1, 9}, k = 15
Output : 4
Explanation:
The sub-array is {5, 2, 7, 1}.

This is the better approach for positive and negetive numbers in array.
 */

public class Longest_SubarraySize_target_Positive_Negetive {

    public static int longSubArraySize(int[] arr , int K){

        HashMap <Integer ,Integer> subArr = new HashMap<>();

        int n = arr.length;
        int maxlen=0;
        int sum = 0;
        int rem = 0;

        for(int  i=0 ; i<n ; i++){
            sum += arr[i];
            if(sum == K){
                maxlen = Math.max(maxlen, i+1 );
            }
            rem = sum-K;
            
            if (subArr.containsKey(rem)){
                int len = subArr.get(rem);
                maxlen = Math.max(maxlen, i-len) ;
            }

            if( !subArr.containsKey(sum)){
                subArr.put(sum, i);
            }  
        }
        return maxlen;

    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        System.out.print("Longest Subarray size is : " + longSubArraySize(arr, 10));
    }
}
