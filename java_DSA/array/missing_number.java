package java_DSA.array;


/* find the number which is missing in the array.
 * given array of n-1 distinct number in the range of 1 to n
*/


public class missing_number {

    /*  this return with o(n^2) time complexity 


    public static int missingNumber(int[] arr){
        n = arr.length+1;
        int newArr[] = new int[n];
        int missNum = 0 ;
        for(int i = 0 ; i<arr.length ; i++){
            newArr[arr[i]] = 1;
        }
        for(int j = 0 ; j<newArr.length ; j++){
            if (newArr[j] == 0){
                missNum = j;
            }
        }
        return missNum;
    }
*/

// we find it with o(n) time complexity . but using sum of n natural number formula (n(n+1)/2) 

    public static int missNum(int[] arr) {
        int len = arr.length;
        int n = len + 1;
        int sumOf_N_Numbers = (n * (n + 1))/2;
        for (int i = 0 ; i < len ; i++){
            sumOf_N_Numbers -= arr[i];
        }
        return sumOf_N_Numbers;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,4,5,6,7};
        System.out.print("Missing Number is : " + missNum(arr));
    }
}
