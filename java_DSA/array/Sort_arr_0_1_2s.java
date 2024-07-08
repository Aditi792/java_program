package java_DSA.array;

/*
 * Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent, with the colors in the order red, white, and blue.

We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.

You must solve this problem without using the library's sort function.

Example 1:

Input: nums = [2,0,2,1,1,0]
Output: [0,0,1,1,2,2]
 */


class Sort_arr_0_1_2s{

    public static void printArray(int[] arr){         // for ptinting array method 
        for(int i = 0 ; i < arr.length ; i++){
            System.out.println(arr[i] + " ");
        }
    }


    public static int[] sortColors(int[] nums) {

        //normal way sorting 

        /*
        int count0=0,count1=0,count2=0;
        for(int i = 0 ; i<nums.length ; i++){
            if(nums[i] == 0)                         //count every 0 , 1 and 2 in the array
                count0++;
            if(nums[i] == 1)
                count1++;
            if(nums[i] == 2)
                count2++;
        }
        for(int i = 0 ; i<count0 ; i++){            //place 0's in first , then 1's and then 2's
            nums[i] = 0;
        }
         for(int i = count0 ; i<count1+count0 ; i++){
            nums[i] = 1;
        }
         for(int i = count1+count0 ; i<nums.length ; i++){
            nums[i] = 2;
        }
        */

        //optimal way using Dutch National Flag Algorithm .this is a three pointer approach.

        int low = 0,mid = 0,high = nums.length-1;

        while(mid <= high){
            if(nums[mid] == 0){
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                mid++;
                low++;
            }
            else if(nums[mid] == 1){
                mid++;
            }
            else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] = temp;
                high--;
            }
        }
        return nums;
    }


    public static void main(String[] args) {
        
        int arr[] = {0,1,2,1,2,0,0,1,1,0,2};
        System.out.println("Sorted array is : ");
        printArray(sortColors(arr));
    }
}


//Sorted array is : 
//[0,0,0,0,1,1,1,1,2,2,2]