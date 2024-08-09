package java_DSA.Binary_Search;

/*
 * Given a sorted array arr[] of size n without duplicates, and given a value x. Floor of x is defined as the largest element k in arr[] such that k is smaller than or equal to x. Find the index of k(0-based indexing).

Examples

Input: n = 7, x = 0 arr[] = {1,2,8,10,11,12,19}
Output: -1
Explanation: No element less than 0 is found. So output is "-1".

Input: n = 7, x = 5 arr[] = {1,2,8,10,11,12,19}
Output: 1
Explanation: Largest Number less than 5 is 2 (i.e k = 2), whose index is 1(0-based indexing).
Your Task:
The task is to complete the function findFloor() which returns an integer denoting the index value of K or return -1 if there isn't any such number.
 */
public class flloor_upperBound {

    //TC - O(logn)  SC- O(1)
    public static int findFloor(long arr[], int n, long x) {
        int left = 0;
        int right = n - 1;
        int maxindx = -1;
        while(left <= right){
            int mid = (right + left) /  2;
            if (arr[mid] <= x){
                maxindx = mid;
                left = mid + 1;
            }
            else{
                right = mid-1;
            }
        }
        return maxindx;
    }

    public static void main(String[] args) {
        long nums[] = {1,2,3,4,5,6,7,8};
        System.out.println(findFloor(nums, 8, 5));   //4
    }
}
