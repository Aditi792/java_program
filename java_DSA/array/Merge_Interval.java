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
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Merge_Interval {

    public static List<List<Integer>> merge (int[][] arr){

        List<List<Integer>> ans = new ArrayList<>();

        int n = arr.length;

        Arrays.sort(arr,new Comparator<int[]>() {
            public int compare(int[] a , int[] b){
                return a[0] - b[0];
            }
            
        });

        for(int i = 0 ; i<n ; i++){
            if(ans.isEmpty() || arr[i][0] > ans.get(ans.size() -1).get(1)){          // if arr last index is greater than the ans last index
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
    }
    
}
