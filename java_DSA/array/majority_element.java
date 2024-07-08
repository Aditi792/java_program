package java_DSA.array;


/*
 * Given an array nums of size n, return the majority element.
The majority element is the element that appears more than ⌊n / 2⌋ times . 
You may assume that the majority element always exists in the array.

Example 1:

Input: nums = [3,2,3]
Output: 3

Example 2:

Input: nums = [2,2,1,1,1,2,2]
Output: 2
 */


public class majority_element {
    

    public static int majorityElement(int[] nums) {

// this is brute force solution which gives TC=O(n^2) 
        /*
        int n = nums.length;
        int count = 0;
        int max = 0;
        for(int i = 0;i<nums.length ; i ++){
            for(int j = 0 ; j<nums.length ;j++ ){
                if(nums[i] == nums[j]){
                    count++;
                }
                if(count > n/2){
                    max = nums[i];
                }
            }
        }
        return max;
        */

 // in better approch is used hahsing it gives SC = O(n) , TC = O(2n)

        /*
         * nt n = v.length;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int value = mpp.getOrDefault(v[i], 0);
            mpp.put(v[i], value + 1);
        }

        //searching for the majority element:
        for (Map.Entry<Integer, Integer> it : mpp.entrySet()) {
            if (it.getValue() > (n / 2)) {
                return it.getKey();
            }
    }
        return -1;
    }
         * 
         */


// this is optimal solution using Move's Voting Algorithm it gives TC = O(2n) and SC = O(1)

        int element = 0;
        int count = 0;
        int n  = nums.length;
        int max = 0;
        for(int i = 0 ; i<n ; i ++){
            if(count == 0){
                count = 1;
                element = nums[i];
            }
            else if (element == nums[i]) {
                count ++;
            }
            else if (element != nums[i]){
                count--;
            }
        }
        for(int i = 0 ; i<n ; i ++){
            if (nums[i] == element){
                count++;
            }
            if(count > n/2)
                max = element;
        }
        return max;
    }



    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 1, 2, 2};
        int ans = majorityElement(arr);
        System.out.println("The majority element is: " + ans);
    }
}
