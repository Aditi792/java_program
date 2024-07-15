package java_DSA.array;
/*
 * Given an array of integers nums and an integer k, return the total number of subarrays whose sum equals to k.

A subarray is a contiguous non-empty sequence of elements within an array.

Example 1:

Input: nums = [1,1,1], k = 2
Output: 2
Example 2:

Input: nums = [1,2,3], k = 3
Output: 2
 */

import java.util.HashMap;

public class subArray_sum_equals_key {

    public static void main(String[] args) {

        int arr[] = {1,2,3,-3,6,1,1,1,-6};
        int sum = 0;
        int count = 0;
        int n = arr.length;
        int target = 3;
        HashMap<Integer,Integer> list = new HashMap<>();

        for(int i = 0 ; i<n ; i++){
            sum+= arr[i];

            int rem = sum-target;

            // Add the number of subarrays to be remained
            count += list.getOrDefault(rem,0);

            // Update the count of prefix sum in the map.
            list.put(sum,list.getOrDefault(sum, 0)+1);
        
        }

        System.out.println("Target value appear max time : "+ count);
    }
   
}
