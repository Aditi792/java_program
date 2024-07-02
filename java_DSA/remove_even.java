package java_DSA;

public class remove_even {

    public static void printArray(int[] arr){         // for ptinting array method 
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }



    public static int[] removeEven(int[] arr){      // removeEven method
        int oddCount = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] % 2 != 0 ){
                oddCount++;    // count odd number
            }
        }

        int result[] = new int[oddCount]; // create an array for storing odd numbers
        int idx = 0;
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i] % 2 != 0 ){
                result[idx] = arr[i];  // add odd value to the new arry from the catual array 
                idx++;
            }
        }
        return result;
    }




    public static void main(String[] args) {
        
        int[] originalArray = {12,13,14,15,2,3,4,5,6,7,8};
        printArray(originalArray);
        int[] removeEvenArray = removeEven(originalArray);
        printArray(removeEvenArray);

    }
}
