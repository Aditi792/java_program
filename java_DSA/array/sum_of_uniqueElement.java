package java_DSA.array;

public class sum_of_uniqueElement {

    public static int sumOfUnique(int[] nums) {
       int arr[] = new int[101];
       for(int i = 0 ; i<nums.length;i++){
            arr[nums[i]] +=1;
        }
        int sumUniElement = 0;
        for(int j = 0 ; j<arr.length;j++){
            if(arr[j] == 1){
                sumUniElement += j;
            }
       }
       return sumUniElement;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,2};
        System.out.println(sumOfUnique(nums));

    }
}

// output will be 4 . bcz of [1,3] are unique element in the array