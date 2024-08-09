package java_DSA.Binary_Search;
/*
 * Given an unsorted array arr[] of integers and an integer x, find the floor and ceiling of x in arr[].

Floor of x is the largest element which is smaller than or equal to x. Floor of x doesn’t exist if x is smaller than smallest element of arr[].
Ceil of x is the smallest element which is greater than or equal to x. Ceil of x doesn’t exist if x is greater than greatest element of arr[].

Return an array of integers denoting the [floor, ceil]. Return -1 for floor or ceiling if the floor or ceiling is not present.

Examples:

Input: x = 7 , arr[] = [5, 6, 8, 9, 6, 5, 5, 6]
Output: 6, 8
Explanation: Floor of 7 is 6 and ceil of 7 is 8.

Input: x = 10 , arr[] = [5, 6, 8, 8, 6, 5, 5, 6]
Output: 8, -1
Explanation: Floor of 10 is 8 but ceil of 10 is not possible.

here both the cases check the equal condition . so we have to use equal condition separately.
 */

public class floor_ceil_upper_lower_value {
    
    //TC=O(n)  SC= O(1)
    public static int[] getFloorAndCeil(int x, int[] arr) {
        int floor = -1;
        int ceil = -1;
        for(int i=0 ; i <arr.length ;i++ ){
            
            if(arr[i] < x){
                floor = Math.max(floor,arr[i]);
            }
            else if(arr[i] > x){
                if(ceil == -1){
                    ceil = arr[i];
                }else{
                    ceil = Math.min(ceil,arr[i]);
                }
            }
            else{
                floor = arr[i];
                ceil = arr[i];
            }
        }
        return new int[]{floor,ceil};
    }


    public static void main(String[] args) {
        int nums[] = {1,2,3,5,6,7,8};
        for(int num : getFloorAndCeil(5,nums))System.out.print(num + " ");  //5 5  (value)

        System.out.println();

        for(int num : getFloorAndCeil(4,nums))System.out.print(num + " ");  //3 5  (value)
    }
}
