package java_DSA.array;

//import java.util.HashMap;

public class two_sum {

    public static boolean TwoSum(int[] arr , int target){

        int n=arr.length;

        //for brute force solution with TC = O(n^2) SC = O(1)
        /*
        for(int i=0 ; i < n ; i ++){
            for(int j = i+1 ; j<n ; j++){
                if(arr[i] + arr[j] == target){
                    return true;
                }
            }
        }
        return false;


        
    /*
        //better option with TC = O(n) and SC= O(n)

        int need = 0;
        HashMap <Integer,Integer> check = new HashMap<>();
        for(int i =0 ; i<n ; i++){
            need = target - arr[i];
            if( !check.containsKey(need)){
                check.put(arr[i], i);
            }
            else{
                return true;
            }
        }
        return false;
    }
    */ 



        // optimal solution for true false return

        
        int left = 0;
        int right = arr.length-1;
        while(left < right){
            if(arr[left] + arr[right] > target){
                right--;
            }
            if(arr[left] + arr[right] < target){
                left++;
            }
            if(arr[left] + arr[right] == target){
                return true;
            }
        }
        return false;
    }




    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        if(TwoSum(nums, 10)){
            System.out.println("Integer are present which sum gives the target output.");
        }
        else{
            System.out.println("Integer are not present in the array");
        }
    }
}
