import java.util.Scanner;

class HarmonicTerm1 {
    private double value;

    // Constructor to initialize the term
    public HarmonicTerm1(double base, int exponent) {
        this.value = 1.0 / Math.pow(base, exponent);
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

public class HarmonicSeries1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the value of x
        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        // Prompt the user for the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Create an array to store HarmonicTerm1 objects
        HarmonicTerm1[] terms = new HarmonicTerm1[n];
        double sum = 0.0;

        // Calculate each term and sum up the series
        for (int i = 1; i <= n; i++) {
            terms[i - 1] = new HarmonicTerm1(x, i);
            sum += terms[i - 1].getValue();
        }

        // Display each term
        System.out.println("\nHarmonic Series Terms:");
        for (HarmonicTerm1 term : terms) {
            term.display();
        }

        // Display the sum of the series
        System.out.printf("\nSum of the Harmonic Series: %.5f\n", sum);

        // Close the scanner
        scanner.close();
    }
}
