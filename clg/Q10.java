package clg;
import java.util.Scanner;

class BankAccount {
    private String name;
    private int accountNumber;
    private String accountType;
    private double balance;

    // Method to assign initial values
    public void initialize(String name, int accountNumber, String accountType, double balance) {
        this.name=name;
        this.accountNumber=accountNumber;
        this.accountType=accountType;
        this. balance= balance;
    }

    // Method to deposit amount
    // Method to deposit amount
    public void deposit(Scanner scanner) {
        System.out.println("Enter amount to deposit:");
        double amount = scanner.nextDouble();
        balance += amount;
        System.out.println("Deposit successful.");
    }

    // Method to withdraw amount after checking balance
    public void withdraw(Scanner scanner) {
        System.out.println("Enter amount to withdraw:");
        double amount = scanner.nextDouble();
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal successful.");
        } else {
            System.out.println("Insufficient balance.");
        }
    }


    // Method to display name and balance
    public void displayBalance() {
        System.out.println("Name: " + name);
        System.out.println("Balance: " + balance);
    }

    // Method to compute and deposit interest for saving account
    public void computeAndDepositInterest(double rate) {
        if (accountType.equalsIgnoreCase("saving")) {
            double interest = balance * (rate / 100);
            balance += interest;
            System.out.println("Interest computed and deposited: " + interest);
        } else {
            System.out.println("Interest is not applicable for current account.");
        }
    }

    // Method to check minimum balance and impose penalty if necessary
    public void checkMinimumBalance(double minimumBalance, double penaltyCharge) {
        if (accountType.equalsIgnoreCase("current") && balance < minimumBalance) {
            balance -= penaltyCharge;
            System.out.println("Minimum balance charge imposed.");
        } else {
            System.out.println("Minimum balance maintained.");
        }
    }
}

public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("<--Initializing an account-->");

        System.out.println("Enter name:");
        String name = scanner.nextLine();
        System.out.println("Enter account number:");
        int accountNumber = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter account type (Saving/Current):");
        String accountType = scanner.nextLine();
        System.out.println("Enter initial balance:");
        double balance = scanner.nextDouble();


        // Create a BankAccount object
        BankAccount account = new BankAccount();

        // Initialize account
        account.initialize(name, accountNumber, accountType, balance);

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            System.out.println("4. Compute and Deposit Interest (for saving account)");
            System.out.println("5. Check Minimum Balance and Impose Penalty (for current account)");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    account.deposit(scanner);
                    break;
                case 2:
                    account.withdraw(scanner);
                    break;
                case 3:
                    account.displayBalance();
                    break;
                case 4:
                    if (accountType.equalsIgnoreCase("saving")) {
                        System.out.println("Enter interest rate:");
                        double interestRate = scanner.nextDouble();
                        account.computeAndDepositInterest(interestRate);
                    } else {
                        System.out.println("This option is applicable only for saving account.");
                    }
                    break;
                case 5:
                    if (accountType.equalsIgnoreCase("current")) {
                        System.out.println("Enter minimum balance:");
                        double minimumBalance = scanner.nextDouble();
                        System.out.println("Enter penalty charge:");
                        double penaltyCharge = scanner.nextDouble();
                        account.checkMinimumBalance(minimumBalance, penaltyCharge);
                    } else {
                        System.out.println("This option is applicable only for current account.");
                    }
                    break;
                case 6:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }

        scanner.close();
    }
}