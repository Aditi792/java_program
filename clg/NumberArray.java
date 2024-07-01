
import java.util.Arrays;
import java.util.Scanner;

class Number {
    private int value;

    // Constructor
    public Number(int value) {
        this.value = value;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Display method
    public void display() {
        System.out.println("Value: " + value);
    }

    // Static method to sort an array of Number objects
    public static void sortNumbers(Number[] numbers) {
        Arrays.sort(numbers, (a, b) -> Integer.compare(a.getValue(), b.getValue()));
    }
}

public class NumberArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array of Number objects
        Number[] numbers = new Number[n];

        // Populate the array with user inputs
        for (int i = 0; i < n; i++) {
            System.out.print("Enter value for element " + (i + 1) + ": ");
            int value = scanner.nextInt();
            numbers[i] = new Number(value);
        }

        // Sort the array of Number objects
        Number.sortNumbers(numbers);

        // Display the sorted values
        System.out.println("\nSorted values:");
        for (Number number : numbers) {
            number.display();
        }

        // Close the scanner
        scanner.close();
    }
}
