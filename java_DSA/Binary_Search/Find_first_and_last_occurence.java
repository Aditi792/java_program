package java_DSA.Binary_Search;

/*
 * Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
If target is not found in the array, return [-1, -1].
You must write an algorithm with O(log n) runtime complexity.

Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]

Example 2:
Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]

Example 3:
Input: nums = [], target = 0
Output: [-1,-1]
 */
public class Find_first_and_last_occurence {


    //for getting the first value
    public static int firstOccur(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        int first = -1;
        while(left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == target) {
                first = mid;
                right = mid-1; //eliminate the right as it always present in left side.
            }
            else if (arr[mid] < target){
                left = mid + 1;
            }
            else right = mid -1;
        }
        return first;
    }

    //for getting the last value
    public static int lastOccur(int[] arr,int target){
        int left = 0;
        int right = arr.length-1;
        int last = -1;
        while(left<=right){
            int mid = (left + right)/2;
            if(arr[mid] == target) {
                last = mid;
                left = mid +1;  //eliminate the left as it always present in right side.
            }
            else if (arr[mid] < target){
                left = mid + 1;
            }
            else right = mid -1;
        }
        return last;
    }

    public static int[] firstLast(int[] arr , int target){
        int first = firstOccur(arr, target);
        if(first == -1) return new int[]{-1,-1};
        int last = lastOccur(arr, target);
        return new int[]{first,last};
    }


    public static void main(String[] args) {
        int[] nums = {5,7,7,8,8,10};
        for(int num : firstLast(nums, 10))System.out.print(num+" ");//5,5
    }
}
