package java_DSA.Binary_Search;
/*
 * There is an integer array nums sorted in ascending order (with distinct values).

Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].
Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4

Example 2:
Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1

Example 3:
Input: nums = [1], target = 0
Output: -1


######## values are unique ############
 */

public class search_in_rotated_sorted_array_I {

    //for worst case when target value is not present in array then TC-O(n)
    //otherwise it takes TC-O(log n)
    //we can do this also in simple linear search , for that case TC will be O(n) for all the cases.

    public static int linearWay(int[] nums,int target){
        int left = 0;
        int right = nums.length -1;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[left] < target) left++;
            else if (nums[right]> target) right--;
            else if(nums[left] == target ){
                return left;
            }
            else if(nums[right] == target){
                return right;
            }
        }
        return -1;
    }


    //for this case TC - o(log n)
    public static int binaryWay(int[] nums , int target){
        int low = 0;
        int high = nums.length - 1;
        int result = -1;
        while(low <= high){
            int mid = (low+high)/2;
            if(nums[mid] == target){
                result = mid;
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
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(linearWay(arr, 0));
        System.out.println(binaryWay(arr, 0));
    }
}
