package java_DSA.array;

public class check_sorted_array{

    public static boolean checkSortedArray(int[] arr ) {
        for(int i = 1 ; i < arr.length ; i++){
            if(arr[i] >= arr[i-1]){          // compare next element with the previous element if true do nothing.

            }else{
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,7,8,8};
        System.out.println("Array is sorted ? " + checkSortedArray(arr));
    }
}