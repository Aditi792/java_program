package java_DSA.array;

public class min_value {

    public static int minValue(int[] arr) {
        int min = arr[0];
        for(int i = 0 ; i < arr.length ; i++){
            if (arr[i]< min){
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,6,7,-4,8,9};
        System.out.println("Minimum value in the array is : " + minValue(arr));

    }
}
