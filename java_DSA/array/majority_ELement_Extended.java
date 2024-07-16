package java_DSA.array;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

Example 1:

Input: nums = [3,2,3]
Output: [3]
Example 2:

Input: nums = [1]
Output: [1]
Example 3:

Input: nums = [1,2]
Output: [1,2]           //return two element .


at max it can return two element because -----

supoose n = 8 , which means in array there have max 8 element .

so,if each element appears more than [n/3] times , means every element must be appear  [ >(8/3)=2 ] 3 times which is (>2).

so for presenting more than two element in the array, which appears at least 3 times then the array size will be.... 
 3+3+3=9. but the array size given is 8 . so , three element cant be present in the array which appears [>n/3] times.
 
 so we can say at max two element present in the array which appears [>n/3] times.

 this is the extended version of  move's voting algorithm.so in this all the approaches for solving this problem is also same as move's voting problem [>n/2].


 */

public class majority_ELement_Extended {

    public static List<Integer> majorityElement(int[] nums){
        int count1 = 0 , count2=0 , el1= 0, el2 = 0 ;
        int n = nums.length;
        for(int i = 0 ; i<n ; i++){
            if(count1 == 0 && el2 != nums[i]){       //if element2 contains the same element then element1 cannot set that element
                count1 = 1;
                el1 = nums[i];
            }
            else if (count2 == 0 && el1 != nums[i]){  //if element1 contains the same element then element2 cannot set that element
                count2 = 1;
                el2 = nums[i];
            }

            else if (el1 == nums[i]) count1++;
            else if (el2 == nums[1]) count2++;
            else{
                count1--;
                count2--;
            }
        }

        int cnt1=0,cnt2=0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0 ; i<n ; i++){
            if(el1 == nums[i]) cnt1++;
            if(el2 == nums[i]) cnt2++;
        }

        int min = (int) (n/3) ;
        if(el1 == el2) list.add(el1);   //if two element are same then add any one element.
        else{
            if(cnt1 > min) list.add(el1);
            if(cnt2 > min) list.add(el2);
        }
        return list;

    }

    public static void main(String[] args) {
        int arr[] = {1,1,1,2,2,3,3,3,4};
        List<Integer> ans = majorityElement(arr);
        System.out.print("The majority elements are: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
        System.out.println();
    }
    
}
