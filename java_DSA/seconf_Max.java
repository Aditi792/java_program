package java_DSA;

public class seconf_Max {

    public static int secondMaxVal(int[] arr) {
        int max = arr[0];
        int secondMax = arr[0];
        for (int i = 0 ; i < arr.length ; i++){
            if (arr[i] > max){
                secondMax = max;
                max = arr[i];
            }
            else if (arr[i] > secondMax && arr[i] != max){
                secondMax = arr[i];
            }
        }
        return secondMax;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,0,123,125,6,7,-4,8,9,10,};
        System.out.println("Maximum value in the array is : " + secondMaxVal(arr));
    }
}
