package java_DSA.array;

public class left_rotate_optimal {

    public static void printArray(int[] arr){         // for ptinting array method 
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }


    public static int[] reverseArray(int[] arr , int start,int end) {  // reverse Array method
        while(start < end){
            int temp = arr[start];                                    
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }

    public static int[] leftRotate(int[] arr ,int n , int d) { 
        reverseArray(arr, 0, d-1);                          // first reverse the first rotated element
        reverseArray(arr, d, n);                                  // second rotate the rest of the rotated element
        reverseArray(arr, 0, n);                            // rotate the whole array 
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        printArray(leftRotate(arr, arr.length-1, 7));
    }
}


/*
 * array is [1,2,3,4,5,6,7,8] , suppose roateted place is 3 then,
 * after first rotation the array will be - [3,2,1,   4,5,6,7,8]
 * after second rotation the array will be - [3,2,1,  8,7,6,5,4]
 * after third rotation the array will be - [4,5,6,7,8,1,2,3]
 * 
 * which is 3 place rotation [4,5,6,7,8  1,2,3]
 */