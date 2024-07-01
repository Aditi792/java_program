package clg;
import java.util.Scanner;

class BankAccount {
    String name;
    String accountNumber;
    String accountType;
    double balance;

    // Method to assign initial values
    public void initialize(String name, String accountNumber, String accountType, double balance) {
        this.name = name;
        this.accountNumber = accountNumber;
        this.accountType = accountType;
        this.balance = balance;
    }

    // Method to deposit an amount
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount + ". New balance is: " + balance);
    }

    // Method to withdraw an amount after checking balance
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance is: " + balance);
        } else {
            System.out.println("Insufficient balance");
        }
    }

    // Method to display the name and balance
    public void display() {
        System.out.println("Depositor Name: " + name);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount {

    // Method to compute and deposit interest
    public void computeInterest(double rate, int time) {
        double interest = balance * Math.pow((1 + rate / 100), time) - balance;
        balance += interest;
        System.out.println("Interest of " + interest + " added. New balance is: " + balance);
    }
}

class CurrentAccount extends BankAccount {
    private final double minimumBalance = 500;
    private final double serviceCharge = 50;

    // Method to withdraw an amount after checking balance and minimum balance
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance is: " + balance);
        } else {
            System.out.println("Insufficient balance to maintain minimum balance");
        }
    }

    // Method to check for the minimum balance, impose penalty if necessary
    public void checkMinimumBalance() {
        if (balance < minimumBalance) {
            balance -= serviceCharge;
            System.out.println("Balance fell below minimum. Service charge of " + serviceCharge + " imposed. New balance is: " + balance);
        }
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        System.out.println("Welcome to the Bank System");
        System.out.print("Enter the account type (Savings/Current): ");
        String accountType = scanner.nextLine();

        if (accountType.equalsIgnoreCase("Savings")) {
            account = new SavingsAccount();
        } else if (accountType.equalsIgnoreCase("Current")) {
            account = new CurrentAccount();
        } else {
            System.out.println("Invalid account type");
            return ;
        }

        System.out.print("Enter depositor's name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Enter initial balance: ");
        double balance = scanner.nextDouble();

        account.initialize(name, accountNumber, accountType, balance);
        account.display();

        boolean exit = false;
        while (!exit) {
            System.out.println("\nMenu:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Display Balance");
            if (accountType.equalsIgnoreCase("Savings")) {
                System.out.println("4. Compute Interest");
            } else {
                System.out.println("4. Check Minimum Balance");
            }
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmount = scanner.nextDouble();
                    account.deposit(depositAmount);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmount = scanner.nextDouble();
                    account.withdraw(withdrawAmount);
                    break;
                case 3:
                    account.display();
                    break;
                case 4:
                    if (accountType.equalsIgnoreCase("Savings")) {
                        System.out.print("Enter interest rate (%): ");
                        double rate = scanner.nextDouble();
                        System.out.print("Enter time period (years): ");
                        int time = scanner.nextInt();
                        ((SavingsAccount) account).computeInterest(rate, time);
                    } else {
                        ((CurrentAccount) account).checkMinimumBalance();
                    }
                    break;
                case 5:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
        System.out.println("Thank you for using the Bank System");
    }
}
