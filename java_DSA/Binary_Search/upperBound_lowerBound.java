package java_DSA.Binary_Search;

/*
 * Given a sorted array arr[] of size n without duplicates, and given a value x. 
 * 
 * Floor of x is defined as the largest element k in arr[] such that k is smaller than or equal to x. Find the index of k(0-based indexing).
 * 
 * ceil of x is defined as the smallest element k in arr[] such that k is greater than x. Find the index of k(0-based indexing).
 */

public class upperBound_lowerBound {

    static int[] findFloor(long arr[], int n, long x) {
        int left = 0;
        int right = n - 1;
        int upper = -1;
        int lower = -1;
        while(left <= right){
            int mid = (right + left) /  2;
            if (arr[mid] <= x){
                upper = mid;
                left = mid + 1;
            }
            else if (arr[mid] > x){
                lower = mid;
                right = mid-1;
            }
        }
        return new int[]{upper,lower};
    }


    public static void main(String[] args) {
        long nums[] = {1,2,3,4,5,6,7,8};
        for(int num :findFloor(nums, 8, 5))System.out.print(num + " ");  //4 5 (index)
    }
}
