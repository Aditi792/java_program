package java_DSA.array;

/*
 * Given an integer array nums, find a 
subarray
 that has the largest product, and return the product.
The test cases are generated so that the answer will fit in a 32-bit integer.


Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */

public class Maximum_product_subarray {
    
// time complexity O(n^2) SC - O(1)

    public static int MaxProduct(int[] nums) {
        if(nums.length == 1) return nums[0];
        int product ,maxi=0;
        for(int i = 0 ; i<nums.length ; i++){
            product = 1;
            for(int j = i ; j<nums.length ; j++){
                product *= nums[j];
                maxi = Math.max(product,maxi);
            }
            
        }
        return maxi;
    }


// time complexity O(n) SC - O(1)

    public static int maxProduct(int[] nums) {
        int prefix = 1, suffix = 1 ,n = nums.length,maxi=Integer.MIN_VALUE;
        if(n == 1)return nums[0];
        for(int i = 0;i<n ; i++){
            if(prefix == 0 )prefix = 1;
            if(suffix == 0)suffix = 1;
            prefix *= nums[i];
            suffix *= nums [n-i-1];
            maxi = Math.max(maxi,Math.max(prefix,suffix));
        }
        return maxi;
    }


    /*The above code uses a prefix and suffix approach to find the maximum product subarray. While this approach works for most cases, it doesn't handle large products properly due to integer overflow issues and doesn't reset properly when encountering zeros.

    To fix this, we need to carefully handle zeros and reset the prefix and suffix products. We also need to ensure that the maximum product is computed correctly, avoiding overflow issues.*/

    public static int MaaxProduct(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Initialize variables to store the global maximum product, current maximum product, and current minimum product
        int globalMax = nums[0];
        int currentMax = nums[0];
        int currentMin = nums[0];

        // Iterate through the array starting from the second element
        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            // If the current number is negative, swap the current maximum and minimum
            if (num < 0) {
                int temp = currentMax;
                currentMax = currentMin;
                currentMin = temp;
            }

            // Update the current maximum and minimum products
            currentMax = Math.max(num, currentMax * num);
            currentMin = Math.min(num, currentMin * num);

            // Update the global maximum product
            globalMax = Math.max(globalMax, currentMax);
        }

        return globalMax;
    }




    public static void main(String[] args) {

        int[] nums = {2,3,-1,0,-2,4,2};
        System.out.println(maxProduct(nums));  //8
        System.out.println(MaaxProduct(nums)); //8
        System.out.println(MaxProduct(nums));  //8
    }
}
