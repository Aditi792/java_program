package clg;
import java.util.Scanner;


public class StudentTestResults {
    public static void main(String[] args) {
        final int numStudents = 50;
        final int numSubjects = 5; // You can change this to the actual number of subjects

        Scanner scanner = new Scanner(System.in);

        // Initialize arrays to store the marks and roll numbers
        int[][] marks = new int[numStudents][numSubjects];
        int[] totalMarks = new int[numStudents];
        int[] rollNumbers = new int[numStudents];

        // Input the data
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter roll number for student " + (i + 1) + ":");
            rollNumbers[i] = scanner.nextInt();

            System.out.println("Enter marks for student " + (i + 1) + " in " + numSubjects + " subjects:");
            for (int j = 0; j < numSubjects; j++) {
                marks[i][j] = scanner.nextInt();
            }
        }

        // Calculate total marks for each student
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < numSubjects; j++) {
                totalMarks[i] += marks[i][j];
            }
        }

        // Determine the highest marks in each subject and the roll number of the student who secured it
        int[] highestMarks = new int[numSubjects];
        int[] highestMarksRollNumbers = new int[numSubjects];

        for (int j = 0; j < numSubjects; j++) {
            for (int i = 0; i < numStudents; i++) {
                if (marks[i][j] > highestMarks[j]) {
                    highestMarks[j] = marks[i][j];
                    highestMarksRollNumbers[j] = rollNumbers[i];
                }
            }
        }

        // Find the student with the highest total marks
        int highestTotalMarks = 0;
        int highestTotalMarksRollNumber = 0;

        for (int i = 0; i < numStudents; i++) {
            if (totalMarks[i] > highestTotalMarks) {
                highestTotalMarks = totalMarks[i];
                highestTotalMarksRollNumber = rollNumbers[i];
            }
        }
        scanner.close();
        // Output the results
        System.out.println("Total marks obtained by each student:");
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Roll Number: " + rollNumbers[i] + ", Total Marks: " + totalMarks[i]);
        }

        System.out.println("\nHighest marks in each subject and the roll number of the student who secured it:");
        for (int j = 0; j < numSubjects; j++) {
            System.out.println("Subject " + (j + 1) + ": Highest Marks = " + highestMarks[j] + ", Roll Number = " + highestMarksRollNumbers[j]);
        }

        System.out.println("\nStudent who obtained the highest total marks:");
        System.out.println("Roll Number: " + highestTotalMarksRollNumber + ", Total Marks: " + highestTotalMarks);
    }
}

