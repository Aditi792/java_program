package java_DSA.Binary_Search;
/*
 * There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

You must decrease the overall operation steps as much as possible.

 

Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true
Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false




######## values are not unique ############

so for this case it may be happen that an array is like [3,4,5,3,3,3,3]

for this type of edge cases we did not found the sorted part of the array.
as here mid = 3 , lo = 3 , high = 3

so,we didn't found which part is sorted for this,we have to shrink the left and right.
 */

public class search_in_rotated_sorted_array_II {
    //for this case TC - o(log n)
    public static boolean binaryWay(int[] nums , int target){
        int low = 0;
        int high = nums.length - 1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                return true;
            }

            //edge case
            if(nums[mid] == nums[low] && nums[mid] == nums[high]){  //shrink the low and high to avoid duplicate
                low++;
                high--;
                continue;
            }


            if (nums[low] <= nums[mid]){    //if left part is sorted
                if(nums[low] <= target && target <=nums[mid]){
                    high = mid-1;   //element exists
                }else{
                    low = mid +1;   //element does not exist
                }
            }else{    //if right part is sorted
                if(nums[mid] <= target && target <=nums[high]){
                    low = mid +1;  //element exists
                }else{
                    high = mid-1;  //element does not exist
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {3,3,4,5,6,3,3,3,3,3};
        System.out.println(binaryWay(arr, 7));
    }
}
