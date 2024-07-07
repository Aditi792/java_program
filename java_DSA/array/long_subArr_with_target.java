package java_DSA.array;

import java.util.ArrayList;

/*
 * Given an array arr containing n integers and an integer k. Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value k.
 * Input :
arr[] = {10, 5, 2, 7, 1, 9}, k = 15
Output : 4
Explanation:
The sub-array is {5, 2, 7, 1}.
 */

 class long_subArr_with_target{

    public static int lenOfLongSubarr(int A[], int K) {
        int N = A.length;
        ArrayList <Integer> arr = new ArrayList<>();
        int s = 0;int len = 0;
        for (int i = 0 ; i< N-1 ; i++){
            for(int j = i+1 ; j<N ; j++){
                s +=A[j];
                if(K != s ){
                    arr.add(A[j]);
                }
                else{
                    len = Math.max(arr.size(),lenOfLongSubarr(A, K));

                }
            }
            
        }
        return len;
    }




    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        System.out.println(lenOfLongSubarr(arr, 15));
    }
 }