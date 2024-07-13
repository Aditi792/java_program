package java_DSA.array;

/*
 * You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).

You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

example 1

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]
 */

public class rotate_matrix {
    public static void main(String[] args) {
        
        int matrix[][] = {{1,2,3},
                        {4,5,6},
                        {7,8,9}};
        int n = matrix.length;

        /* it will take extra space .
        
        int n = matrix.length;
        int m = matrix[0].length;

        int newMatrix[][] = new int[n][m];

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<m ; j++){
                newMatrix[j][n-i-1] = matrix[i][j];
            }
        }

        */

        //transpose the matrix . row become col  
        for(int i = 0 ; i<n ; i++){
            for(int j = i ; j<n ; j++){    //because it is square matrix. all the row and col rae same.
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
//for reverse the matrix 

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n/2; j++){  // use n/2 because if we use n then it will return the original row. suppose there have len 3 row...[1,2,3] then first iteration it will reverse [3,2,1] .. at that stage row is completely reversed. so use n/2 method [3/2 = 1 times]. is use n then iterate 3time(n<3)...for(j=0)1st iteration [3,2,1] , them (j=1)2nd iteration [3,2,1] .. then (j=2)3rd iteration [1,2,3]...return the oroginal row again.
                
                int temp = 0;
                temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-j-1];
                matrix[i][n-j-1]= temp;

            }
        }

        // for printing matrix 

        for(int i = 0 ; i<n ; i++){
            for(int j = 0 ; j<n ; j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

    }
}
