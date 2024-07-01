import java.io.Console;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] count = new int[5];
        int spoiltBallots = 0;

        System.out.println("Welcome to the Election!");

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("0. Exit");
            System.out.println("1. Vote for Candidate 1");
            System.out.println("2. Vote for Candidate 2");
            System.out.println("3. Vote for Candidate 3");
            System.out.println("4. Vote for Candidate 4");
            System.out.println("5. Vote for Candidate 5");
            System.out.print("Enter your choice: ");

            int choice = getMaskedInput();

            switch (choice) {
                case 0:
                    exit = true;
                    break;
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                    count[choice - 1]++;
                    break;
                default:
                    spoiltBallots++;
            }
        }

        System.out.println("\nVotes for each candidate:");
        for (int i = 0; i < count.length; i++) {
            System.out.println("Candidate " + (i + 1) + ": " + count[i]);
        }
        System.out.println("Spoilt ballots: " + spoiltBallots);

        scanner.close();
    }

    private static int getMaskedInput() {
        Console console = System.console();
        if (console == null) {
            System.out.println("No console available.");
            return -1;
        }

        char[] input = console.readPassword();
        String inputStr = new String(input);

        try {
            return Integer.parseInt(inputStr.trim());
        } catch (NumberFormatException e) {
            return -1;
        }
    }
}