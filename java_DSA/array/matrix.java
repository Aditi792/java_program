package java_DSA.array;

public class matrix {
    public static void main(String[] args) {

        int[][] matrix = {  { 3, 2, 1, 7 },
					  { 9, 11, 5, 4 },
					  { 6, 0, 13, 17 },
					  { 7, 21, 14, 15 } };

        for(int row[]: matrix){
            for(int col : row){
                System.out.print(col + "\t");
            }
            System.out.println();
        }
    }
}
