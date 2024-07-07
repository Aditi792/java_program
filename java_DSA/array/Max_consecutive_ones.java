package java_DSA.array;

/*
 * Given a binary array nums, return the maximum number of consecutive 1's in the array.
Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3. */



public class Max_consecutive_ones {

    public static int consOnes(int[] arr){
        int count = 0, max = 0;
        for(int i = 0 ; i< arr.length ; i++){
            if (arr[i] == 1){                        
                count++;
                if(count > max){
                    max = count;
                }
            }else{
                count = 0;
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int nums[] = {1,1,1,0,0,1,0,1,1,1,1,0};
        System.out.println("Max consecutive ones are : " + consOnes(nums));
    }
}
