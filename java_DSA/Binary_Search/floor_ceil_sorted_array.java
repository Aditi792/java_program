package java_DSA.Binary_Search;
/*
 * You're given a sorted array 'a' of 'n' integers and an integer 'x'.
Find the floor and ceiling of 'x' in 'a[0..n-1]'.
Note:
Floor of 'x' is the largest element in the array which is smaller than or equal to 'x'.
Ceiling of 'x' is the smallest element in the array greater than or equal to 'x'.

Sample Input 1 :
6 8
3 4 4 7 8 10
Sample Output 1 :
8 8
Explanation of sample input 1 :
Since x = 8 is present in the array, it will be both floor and ceiling.


Sample Input 2 :
6 2
3 4 4 7 8 10
Sample Output 2 :
-1 3
Explanation of sample input 2 :
Since no number is less than or equal to x = 2 in the array, its floor does not exist. The ceiling will be 3.

 */

public class floor_ceil_sorted_array {
    
    //TC - O(logn)  SC - O(1)
    public static int[] getFloorAndCeil(int[] a, int n, int x) {
        int ceil = -1;
        int floor = -1;
        int left = 0;
        int right = n - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (a[mid] > x) {
                if (ceil == -1) {
                    ceil = a[mid];
                } else {
                    ceil = Math.min(ceil, a[mid]);
                }
                right = mid - 1;
            } else if (a[mid] < x) {
                floor = Math.max(floor, a[mid]);
                left = mid + 1;
            } else {
                ceil = a[mid];
                floor = a[mid];
                right = mid - 1;
                left = mid + 1;
            }
        }
        return new int[] { floor, ceil };
    }


    public static void main(String[] args) {
        int nums[] = {1,2,3,5,6,7,8};
        for(int num : getFloorAndCeil(nums,7,5))System.out.print(num + " ");  //5 5  (value)

        System.out.println();

        for(int num : getFloorAndCeil(nums,7,4))System.out.print(num + " ");  //3 5  (value)
    }
}
