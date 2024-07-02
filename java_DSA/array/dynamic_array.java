package java_DSA.array;

public class dynamic_array {


    public static void printArray(int[] arr){         // for ptinting array method 
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static int[] addValueInDynamicArray(int[] arr,int capacity) {
        if (arr.length > capacity ){
            int[] temp = new int[capacity * 2];       //creating  adouble size array 
            for(int i = 0 ; i < arr.length ; i++){     
                temp[i] = arr[i];                        // copy elemnet from the previous array
            }
            arr = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
       int[] arr = {5,0,8,7} ;
       int[] resize_array = addValueInDynamicArray(arr,5);
       System.out.print("Size of the array is : "+ arr.length);
       printArray(resize_array);

    }
}
