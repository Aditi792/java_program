package java_DSA.array;

public class set_Matrix_zeros {
    public static void main(String[] args) {

        int[][] matrix = {  { 3, 2, 1, 7 },
					  { 9, 11, 0, 4 },
					  { 6, 0, 13, 17 },
					  };

        int n = matrix[0].length; // length of col
        int m = matrix.length;  //length of rows
        boolean firstColZero = false;
        boolean firstRowZero = false;

        //i = row ; j = col

        for(int j = 0 ; j <n ; j ++){
            if(matrix[0][j] == 0){
                firstRowZero = true;
                break;
            }
        }

        for(int i=0 ; i<m ; i++){
            if(matrix[i][0] == 0){
                firstColZero = true;
                break;
            }
        }

        for(int i=1 ; i<m ; i++){
            for(int j=1 ; j <n ; j++){
                if(matrix[i][j] == 0){
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }

        for(int i = 1 ; i <m ; i++){
            for(int j = 1 ; j <n ; j++){
                if(matrix[i][j] != 0){
                    if(matrix[i][0] == 0 || matrix[0][j] == 0){
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        if(firstColZero){
            for(int i = 0 ; i<m ; i++){
                matrix[i][0] = 0;
            }
        }

        if(firstRowZero){
            for(int j = 0 ; j <n ; j++){
                matrix[0][j] = 0;
            }
        }

        for(int row[] : matrix){
            for(int col : row){
                System.out.print(col);
            }
            System.out.println();
        }
    }
}
