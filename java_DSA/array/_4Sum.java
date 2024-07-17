package java_DSA.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * Given an array nums of n integers, return an array of all the unique quadruplets [nums[a], nums[b], nums[c], nums[d]] such that:

0 <= a, b, c, d < n
a, b, c, and d are distinct.
nums[a] + nums[b] + nums[c] + nums[d] == target
You may return the answer in any order.

Example 1:

Input: nums = [1,0,-1,0,-2,2], target = 0
Output: [[-2,-1,1,2],[-2,0,0,2],[-1,0,0,1]]
Example 2:

Input: nums = [2,2,2,2,2], target = 8
Output: [[2,2,2,2]]
 */

public class _4Sum {

    public static List<List<Integer>> fourSum(int[] nums , int target) {
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        for(int i = 0; i<n ;i++){

            if( i > 0 && nums[i] == nums[i-1])continue;  // this is for checking duplicate element in i pointer .

            for(int j = i+1 ; j<n ; j++){

                if(j > i+1 && nums[j] == nums[j-1]) continue; // this is for checking duplicate element in j pointer .

                int k = j+1;
                int l = n-1;

                while( k < l){
                    long sum = nums[i];
                    sum += nums[j];
                    sum += nums[k];
                    sum += nums[l];

                    if(sum < target) k++;
                    else if (sum > target) l--;
                    else{           // when sum == target
                        List<Integer> ans = Arrays.asList(nums[i],nums[j],nums[k],nums[l]);  // we can also do this like first create arraylist and then add every values in it one by one.

                        list.add(ans);

                        k++;
                        l--;

                        while(k < l && nums[k] == nums[k-1]) k++;
                        while (k < l && nums[l] == nums[l+1])l--;

                    }
                }

            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[] nums = {4, 3, 3, 4, 4, 2, 1, 2, 1, 1};
        int target = 9;

        System.out.println(fourSum(nums, target));
    }
}


//[[1, 1, 3, 4], [1, 2, 2, 4], [1, 2, 3, 3]]