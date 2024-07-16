package java_DSA.array;

import java.util.ArrayList;
import java.util.List;

/*
 * Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:

1               every row no. have same number of column.
11
121
1331
14641
 
Example 1:
Input: numRows = 5
Output: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]

Example 2:
Input: numRows = 1
Output: [[1]]
 */

public class pascal_triangle {


    // this is for generating the ans from the given row and column.
    public static int ansGenerator(int row , int col){  
        int ans = 1;
        for(int i = 0 ; i <col ; i++){   
            ans = ans * (row-i);
            ans = ans / (i+1);
        }
        return ans; // (5*4*3) / (1*2*3)
    }

    // this is for generate the row .
    public static List<Integer> rowGenerator(int row){
        List<Integer> list = new ArrayList<>();
        int ans = 1;
        list.add(1);
        for(int col = 1 ; col < row ; col++ ){
            ans =ans * (row - col);
            ans = ans / col;
            list.add(ans);
        }
        return list;
    }

    // this is for generate the pascal triangle from the rowgenerator.
    public static List<List<Integer>> pascalTriangle(int numRows){
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 1 ; i<=numRows ; i++){
            list.add(rowGenerator(i));
        }
        return list;
    }



    public static void main(String[] args) {
        
        System.out.println(pascalTriangle(6));
        System.out.println(ansGenerator(5, 3));
    }
}

/*
 * [[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1], [1, 5, 10, 10, 5, 1]] // Indexing start from 0.
10
 */