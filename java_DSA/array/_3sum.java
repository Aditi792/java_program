package java_DSA.array;


/*
 * Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

Notice that the solution set must not contain duplicate triplets.

Example 1:

Input: nums = [-1,0,1,2,-1,-4]
Output: [[-1,-1,2],[-1,0,1]]
Explanation: 
nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
The distinct triplets are [-1,0,1] and [-1,-1,2].
Notice that the order of the output and the order of the triplets does not matter.
Example 2:

Input: nums = [0,1,1]
Output: []
Explanation: The only possible triplet does not sum up to 0.
Example 3:

Input: nums = [0,0,0]
Output: [[0,0,0]]
Explanation: The only possible triplet sums up to 0.
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _3sum {

    public static List<List<Integer>> threeSum(int[] arr){
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int n = arr.length;
        for(int i = 0 ; i <n ; i++){

            //remove duplicates:
            if(i!=0 && arr[i] == arr[i-1])continue;

            int j = i+1;
            int k = n-1;

            //moving two pointer
            while(j<k){
                int sum = arr[i] + arr[j] + arr[k];
                if(sum > 0){
                    k--;
                }else if(sum < 0){
                    j++;
                }else{
                    List <Integer> ans = Arrays.asList(arr[i],arr[j],arr[k]);
                    list.add(ans);
                    j++;
                    k--;

                    //remove duplicates:

                    //The inner while loops for skipping duplicates after finding a valid triplet should be nested inside the outer while loop to ensure that all consecutive duplicates are skipped correctly.
                    
                    while( j < k && arr[j]==arr[j-1]) j++; 
                    while(j<k && arr[k] == arr[k+1] ) k--;
                }
            }
        }
        return list;
    }
    public static void main(String[] args) {

        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
        
    }
}


//[[-1, -1, 2], [-1, 0, 1]]