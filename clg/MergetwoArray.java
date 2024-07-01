package clg;

import java.util.Arrays;

class MergeTwoArray{
    public static void main(String []args){
        int[][] A = {{3, 12, 8}, {1, 4, 7}};
        int[][] B = {{2, -5}, {9, -10, 11}};
        
        sort2DArray(A);
        System.out.println("Sorted Array A:");
        for (int i = 0; i < A.length; i++) {
            System.out.println(Arrays.toString(A[i]));
        }
        sort2DArray(B);
        System.out.println("Sorted Array B:");
        for (int i = 0; i < B.length; i++) {
            System.out.println(Arrays.toString(B[i]));
        }
        
        int[][] C = mergeSortedArrays(A, B);
        
        System.out.println("Merged and Sorted Array C:");
        for (int i = 0; i < C.length; i++) {
            System.out.println(Arrays.toString(C[i]));
        }
    }
    public static void sort2DArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            Arrays.sort(arr[i]);
        }
    }
    
    public static int[][] mergeSortedArrays(int[][] A, int[][] B) {
        int totalRows = A.length + B.length;
        int[][] mergedArray = new int[totalRows][];
        int index = 0;
        
        for (int i = 0; i < A.length; i++) {
            mergedArray[index++] = A[i];
        }
        for (int i = 0; i < B.length; i++) {
            mergedArray[index++] = B[i];
        }
        
        Arrays.sort(mergedArray, (a, b) -> a[0] - b[0]);
        
        return mergedArray;
    }
 }
 
