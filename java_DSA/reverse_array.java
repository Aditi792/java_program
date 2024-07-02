package java_DSA;

public class reverse_array {

    public static void printArray(int[] arr){         // for ptinting array method 
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }


    public static int[] reverseArray(int[] arr , int start,int end) {  // reverse Array method
        while(start < end){
            int temp = arr[start];                                    //set two pointer start and end , then swap the value between them
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        return arr;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        printArray(arr);
        int[] originalArray = reverseArray(arr,0,arr.length-1);
        printArray(originalArray);

    }
}
