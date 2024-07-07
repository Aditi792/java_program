package java_DSA.array;

/*
 * Given an array arr containing n integers and an integer k. 
 * Your task is to find the length of the longest Sub-Array with the sum of the elements equal to the given value k.
 * Input :
arr[] = {10, 5, 2, 7, 1, 9}, k = 15
Output : 4
Explanation:
The sub-array is {5, 2, 7, 1}.


This is useful if the array contains only positive numbers.
 */
public class Longest_PositiveNumber_SubarraySize_target {
        public static int lenOfLongSubarr (int A[], int K) {
            int N = A.length;
            int sum = 0 ;
            int j = 0;             //here we use two pointer approch. where j = start subarray index
            int len = 0;
            int prevlen = 0;
            for(int i = 0 ; i < N ; i++){  //i = end subarray irerator index
                sum += A[i];            //cal the sum of the element
                if (sum == K){          // if the sum is same as target k , 
                    prevlen = i-j+1;   //then it set the len of the subarray with start index to end index
                    if(prevlen >len){   //if it found target sum again ,then it compare the length with the previous one .
                        len = prevlen;   // assign the higher value to len
                    }
                }
                if (sum > K){      // if sum of element is greater than the target then increase the start index and minus the value from first.
                    sum -= A[j];
                    j++;
                }
            }
            return len;
        }
    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        System.out.print("Longest Subarray size is : " + lenOfLongSubarr(arr, 10));
    }
}
