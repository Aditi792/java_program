package java_DSA.array;

/*
 * Given an m x n matrix, return all elements of the matrix in spiral order.

Input: Matrix[][] = { { 1, 2, 3 },
	              { 4, 5, 6 },
		      { 7, 8, 9 } }
			    
Output: 1, 2, 3, 6, 9, 8, 7, 4, 5.
Explanation: The output of matrix in spiral form.

In this approach, we will be using four loops to print all four sides of the matrix.

1st loop: This will print the elements from left to right.

2nd loop: This will print the elements from top to bottom.

3rd loop: This will print the elements from right to left.

4th loop: This will print the elements from bottom to top.
 */
import java.util.LinkedList;
import java.util.List;

class spiral_matrix{

    public static List<Integer> spiralOrder(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int top = 0 ,bottom = n-1;
        int left = 0,right = m-1;
        List <Integer> list = new LinkedList<>();

        while(top <= bottom && left <= right){

            for(int i = left ; i <= right ; i++){
                list.add(matrix[top][i]);
            }
            top++;

            for(int i = top ; i <= bottom ; i++){
                list.add(matrix[i][right]);
            }
            right--;

            if(top <= bottom){  //These conditions are added to check if the matrix is a single row.then whenever the elements in a single row are traversed they cannot be traversed again backward so the condition is checked in the right-to-left loop
                for(int i = right ; i >=left ; i--){
                    list.add(matrix[bottom][i]);
                }
                bottom--;
            }
            
            if(left <= right){ //These conditions are added to check if the matrix is a single column or a single row. When a single column is present, the condition is checked in the bottom-to-top loop as elements from bottom to top cannot be traversed again.
                for(int i = bottom ; i >= top ; i--){
                    list.add(matrix[i][left]);
                }
                left++;
            }
        }
        return list;
    }


    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3, 4},
                       {5, 6, 7, 8},
                       {9, 10, 11, 12},
                       {13, 14, 15, 16}};
        
        List<Integer> ans = spiralOrder(matrix);

        for(int i = 0;i<ans.size();i++){
            System.out.print(ans.get(i) + " ");
        }

        System.out.println();
    }
}