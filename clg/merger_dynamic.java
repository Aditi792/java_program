package clg;

import java.util.Arrays;
import java.util.Scanner;

public class merger_dynamic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input dimensions for the first array
        System.out.println("Enter the number of rows and columns for the first array:");
        int rowsA = scanner.nextInt();
        int colsA = scanner.nextInt();

        // Initialize and input the first array
        int[][] a = new int[rowsA][colsA];
        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                a[i][j] = scanner.nextInt();
            }
        }

        // Input dimensions for the second array
        System.out.println("Enter the number of rows and columns for the second array:");
        int rowsB = scanner.nextInt();
        int colsB = scanner.nextInt();

        // Initialize and input the second array
        int[][] b = new int[rowsB][colsB];
        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                b[i][j] = scanner.nextInt();
            }
        }

        // Convert 2D arrays to 1D arrays and sort them
        int[] sortedA = convertAndSort(a);
        int[] sortedB = convertAndSort(b);

        // Merge the sorted arrays
        int[] mergedArray = mergeArrays(sortedA, sortedB);

        // Print the merged array
        System.out.println("Merged array in ascending order:");
        System.out.println(Arrays.toString(mergedArray));
        scanner.close();
    }

    // Function to convert 2D array to 1D and sort it
    private static int[] convertAndSort(int[][] array) {
        int size = array.length * array[0].length;
        int[] result = new int[size];
        int index = 0;
        for (int[] row : array) {
            for (int element : row) {
                result[index++] = element;
            }
        }
        Arrays.sort(result);
        return result;
    }

    // Function to merge two sorted arrays
    private static int[] mergeArrays(int[] a, int[] b) {
        int[] merged = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                merged[k++] = a[i++];
            } else {
                merged[k++] = b[j++];
            }
        }

        while (i < a.length) {
            merged[k++] = a[i++];
        }

        while (j < b.length) {
            merged[k++] = b[j++];
        }

        return merged;
    }
}
