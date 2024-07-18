package java_DSA.array;
/*
 * Given an array of intervals where intervals[i] = [starti, endi], merge all overlapping intervals, and return an array of the non-overlapping intervals that cover all the intervals in the input.

Example 1:

Input: intervals = [[1,3],[2,6],[8,10],[15,18]]
Output: [[1,6],[8,10],[15,18]]
Explanation: Since intervals [1,3] and [2,6] overlap, merge them into [1,6].
Example 2:

Input: intervals = [[1,4],[4,5]]
Output: [[1,5]]
Explanation: Intervals [1,4] and [4,5] are considered overlapping.


 */


 /*

    for bettern knowing the array concept 


  * public static void main(String[] args) {
        // Example intervals array
        int[][] intervals = {
            {1, 3},
            {2, 6},
            {8, 10},
            {15, 18}
        };

        // Iterating through intervals array
        for (int i = 0; i < intervals.length; i++) {
            int[] currentInterval = intervals[i]; // Assign current interval to currentInterval variable

            //currentInterval represents one interval from the intervals array.It allows you to access and manipulate the start (currentInterval[0]) and end (currentInterval[1]) of the interval as needed for any processing logic.

            
            System.out.println("Current Interval: [" + currentInterval[0] + ", " + currentInterval[1] + "]" // Print current interval


    Output:

    Current Interval: [1, 3]
    Current Interval: [2, 6]
    Current Interval: [8, 10]
    Current Interval: [15, 18]
  */


import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Merge_Interval {


    // using array of integers

      public static int[][] mergeArray(int[][] intervals) {
        if (intervals.length <= 1) {
            return intervals;
        }
        // Sort intervals by their start time
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();             //This declares a variable named merged of type List<int[]>. This means merged is a list that can hold elements of type int[] (arrays of integers).The angle brackets <int[]> specify that this ArrayList will store arrays of integers
        merged.add(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            int[] currentInterval = intervals[i];
            int[] lastMerged = merged.get(merged.size() - 1);

            if (currentInterval[0] <= lastMerged[1]) {
                // There is overlap, merge intervals
                lastMerged[1] = Math.max(lastMerged[1], currentInterval[1]);
            } else {
                // No overlap, add current interval to the result
                merged.add(currentInterval);
            }
        }
        return merged.toArray(new int[merged.size()][]);
    }
    





    //using list 

    public static List<List<Integer>> merge (int[][] arr){

        List<List<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        Arrays.sort(arr,new Comparator<int[]>() {
            public int compare(int[] a , int[] b){
                return a[0] - b[0];
            }       
        });

        for(int i = 0 ; i<n ; i++){
            if(ans.isEmpty() || arr[i][0] > ans.get(ans.size() -1).get(1)){       // if arr last index is greater than the ans last index
                ans.add(Arrays.asList(arr[i][0],arr[i][1]));              //insert the arr list in the ans .
            }else{
                ans.get(ans.size() - 1).set(1,
                                            Math.max(ans.get(ans.size() - 1).get(1), arr[i][1]));  //if arr index 1(Last index) is lesser tha the ans last index than increase the last index, which index is greater.
            }
        }

        return ans;
    }





    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        List<List<Integer>> ans = merge(arr);
        System.out.print("The merged intervals are: \n");
        for (List<Integer> it : ans) {
            System.out.print("[" + it.get(0) + ", " + it.get(1) + "] ");
        }
        System.out.println();


        int[][] mergedIntervals = mergeArray(arr);

        // Print the merged intervals
        for (int[] interval : mergedIntervals) {
            System.out.print("[" + interval[0] + ", " + interval[1] + "]"+ " ");
        }
    }


    
}
//[1, 6] [8, 10] [15, 18] 
//[1, 6] [8, 10] [15, 18]