package java_DSA.array;

public class remove_duplicate_from_sorted_array {


    public static void printArray(int[] arr){         // for ptinting array method 
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }

    // return the unique element sorted array 

    public static int[] removeDuplicate(int[] arr) {        // remove duplicate from original array and print unique number sorted array same order as original array
        int i = 0 ;
        int n  = arr.length;
        int[] uniqueArr = new int[n];
        uniqueArr[0] = arr[0];
        for(int j=0 ; j <arr.length ; j++){
            if (arr[j] != uniqueArr[i]){
                uniqueArr[i+1] = arr[j];
                i++;
            }
        }
        return uniqueArr;
    }

    // count unique element 

    public static int countUniqueElement(int[] arr) {        // count the unique element from the sorted array 
        int i = 0 ;
        for(int j=0 ; j <arr.length ; j++){
            if (arr[j] != arr[i]){
                arr[i+1] = arr[j];
                i++;
            }
        }
        return i+1;
    }


    public static void main(String[] args) {
        int arr[] = {0,0,1,1,1,2,2,3,3,4};
        printArray(removeDuplicate(arr));
        System.out.println("Unique number in the array is : " + countUniqueElement(arr));
        System.out.println();
    }
}
