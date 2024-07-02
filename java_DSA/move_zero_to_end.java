package java_DSA;

public class move_zero_to_end {

    public static void printArray(int[] arr){         // for ptinting array method 
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    public static int[] moveZeroToEnd(int[] arr){      // i point to nonzero element and j point to zeroth element
        int end = arr.length; 
        int j = 0;
        for(int i = 0 ; i < end ; i++){                
            if (arr[i]!=0 && arr[j]==0 ){
                int temp = arr[i];
                arr[i]= arr[j];
                arr[j] = temp;
            }
            if(arr[j] != 0){
                j++;
            }
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,4,12,0,3,4,0,0,3,0,8};
        int[] editedArray = moveZeroToEnd(arr);
        printArray(editedArray);
    }
}
