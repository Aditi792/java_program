package java_DSA.array;

public class right_rotate {

    public static int[] rightRotate(int[] nums, int k) {

        int n = nums.length;
        k = k%n;                    //for avoid an ArrayIndexOutOfBoundsException when k is greater than n or when i runs from 0 to k-1.
        int temp[] = new int[k];
        for(int i=0 ; i < temp.length ; i++){
            temp[i] = nums[n-k+i];
        }

        for (int i = n - 1; i >= k; i--) {           //This loop should start from the end of the array and move elements forward, not backwards, to avoid overwriting
            nums[i] = nums[i - k];
        }

        int j = 0;
        for(int i = 0 ; i < temp.length ; i++){
            nums[i]=temp[j];
            j++;
        }
        return nums;
    }



        public static void printArray(int[] arr){         // for ptinting array method 
            for(int i = 0 ; i < arr.length ; i++){
                System.out.println(arr[i] + " ");
            }
            System.out.println();
        }

 /*   
        // optimal Solution

    
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
    
        public static int[] rightRotate(int[] arr ,int n , int d) { 
            reverseArray(arr, 0, n-d);                          // first reverse the first rotated element
            reverseArray(arr, n-d+1, n);                        // second rotate the rest of the rotated element
            reverseArray(arr, 0, n);                            // rotate the whole array 
            return arr;
        }
            */
    



        public static void main(String[] args) {
            int arr[] = {1,2,3,4,5,6,7,8};
            printArray(rightRotate(arr, 3));
        }
}
    
/*
 * right rotate like , suppose the array is : [1,2,3,4,5,6]
 * after right rotate with 3 place it would be : [4,5,6,1,2,3]
 */