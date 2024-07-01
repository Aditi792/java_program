
import java.util.InputMismatchException;
import java.util.Scanner;

public class SalvageValueCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Prompt the user for the number of items
            System.out.print("Enter the number of items: ");
            int numberOfItems = scanner.nextInt();

            // Loop through each item to calculate salvage value
            for (int i = 1; i <= numberOfItems; i++) {
                System.out.println("\nItem " + i + ":");

                // Prompt the user for the purchase price
                System.out.print("Enter the purchase price: ");
                double purchasePrice = scanner.nextDouble();

                // Prompt the user for the years of service
                System.out.print("Enter the number of years of service: ");
                int yearsOfService = scanner.nextInt();

                // Prompt the user for the annual depreciation
                System.out.print("Enter the annual depreciation: ");
                double annualDepreciation = scanner.nextDouble();

                // Validate inputs
                if (purchasePrice < 0 || yearsOfService <= 0 || annualDepreciation < 0) {
                    System.out.println("Invalid input. Please enter positive values for purchase price and annual depreciation, and a positive non-zero value for years of service.");
                    i--;
                    continue;
                }

                // Calculate the salvage value
                double salvageValue = purchasePrice - (annualDepreciation * yearsOfService);

                // Display the result
                System.out.printf("The salvage value for item %d is: %.2f\n", i, salvageValue);
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter numeric values.");
        } finally {
            // Close the scanner
            scanner.close();
        }
    }
}
