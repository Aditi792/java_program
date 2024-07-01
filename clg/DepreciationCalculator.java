
import java.util.Scanner;

public class DepreciationCalculator {

    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for the purchase price
        System.out.print("Enter the purchase price: ");
        double purchasePrice = scanner.nextDouble();

        // Prompt the user for the salvage value
        System.out.print("Enter the salvage value: ");
        double salvageValue = scanner.nextDouble();

        // Prompt the user for the years of service
        System.out.print("Enter the number of years of service: ");
        int yearsOfService = scanner.nextInt();

        // Calculate the yearly depreciation
        double depreciation = (purchasePrice - salvageValue) / yearsOfService;

        // Display the result
        System.out.printf("The yearly depreciation is: %.2f\n", depreciation);

        // Close the scanner
        scanner.close();
    }
}

