import java.util.Scanner;
class HarmonicTerm {
    private double value;

    // Constructor to initialize the term
    public HarmonicTerm(int n) {
        this.value = 1.0 / n;
    }

    // Getter to return the value of the term
    public double getValue() {
        return value;
    }

    // Display method
    public void display() {
        System.out.printf("Term value: %.5f\n", value);
    }
}


public class HarmonicSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Create an array to store HarmonicTerm objects
        HarmonicTerm[] terms = new HarmonicTerm[n];
        double sum = 0.0;

        // Calculate each term and sum up the series
        for (int i = 1; i <= n; i++) {
            terms[i - 1] = new HarmonicTerm(i);
            sum += terms[i - 1].getValue();
        }

        // Display each term
        System.out.println("\nHarmonic Series Terms:");
        for (HarmonicTerm term : terms) {
            term.display();
        }

        // Display the sum of the series
        System.out.printf("\nSum of the Harmonic Series: %.5f\n", sum);

        // Close the scanner
        scanner.close();
    }
}

