package java_DSA.array;

/*
 * You are given an array nums consisting of positive integers.
Return the total frequencies of elements in nums such that those elements all have the maximum frequency.
The frequency of an element is the number of occurrences of that element in the array.

Example 1:

Input: nums = [1,2,2,3,1,4]
Output: 4
Explanation: The elements 1 and 2 have a frequency of 2 which is the maximum frequency in the array.
So the number of elements in the array with maximum frequency is 4.
Example 2:

Input: nums = [1,2,3,4,5]
Output: 5
Explanation: All elements of the array have a frequency of 1 which is the maximum.
So the number of elements in the array with maximum frequency is 5.
 */

import java.util.HashMap;

public class Count_elemnt_max_frequency {

    public static int maxFrequencyElements(int[] nums) {
        int result = 0,max =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num,map.getOrDefault(num,0)+1);
            max = Math.max(max,map.get(num));
        }
        //max = Collections.max(map.values());
        for(int i : map.values()){
            if(i == max) result+=max;
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,4};
        System.out.println(maxFrequencyElements(arr));
    }
    
}
