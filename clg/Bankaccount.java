package clg;

import java.util.Scanner;

class BankAccount {
    private String depositorName;
    private int accountNumber;
    private String accountType;
    private double balance;

    public void assignInitialValues(String name, int accNum, String accType, double initBalance) {
        depositorName = name;
        accountNumber = accNum;
        accountType = accType;
        balance = initBalance;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit of $" + amount + " successful.");
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawal of $" + amount + " successful.");
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void display() {
        System.out.println("Depositor Name: " + depositorName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Type: " + accountType);
        System.out.println("Balance: $" + balance);
    }

    public void computeInterest(double rate) {
        if (accountType.equalsIgnoreCase("savings")) {
            double interest = balance * rate / 100;
            balance += interest;
            System.out.println("Interest of $" + interest + " credited.");
        } else {
            System.out.println("Current account does not earn interest.");
        }
    }

    public void checkMinimumBalance(double minBalance, double penalty) {
        if (accountType.equalsIgnoreCase("current") && balance < minBalance) {
            balance -= penalty;
            System.out.println("Minimum balance penalty of $" + penalty + " imposed.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = new BankAccount();

        System.out.print("Enter depositor name: ");
        String name = scanner.nextLine();
        System.out.print("Enter account number: ");
        int accNum = scanner.nextInt();
        System.out.print("Enter account type (savings/current): ");
        String accType = scanner.next();
        System.out.print("Enter initial balance: ");
        double initBalance = scanner.nextDouble();

        account.assignInitialValues(name, accNum, accType, initBalance);

        while (true) {
            System.out.println("\n1. Deposit\n2. Withdraw\n3. Display\n4. Compute Interest (Savings)\n5. Check Minimum Balance (Current)\n6. Exit");
            System.out.print("Enter choice: ");
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
                    if (accType.equalsIgnoreCase("savings")) {
                        System.out.print("Enter interest rate: ");
                        double rate = scanner.nextDouble();
                        account.computeInterest(rate);
                    } else {
                        System.out.println("Interest can only be computed for savings account.");
                    }
                    break;
                case 5:
                    if (accType.equalsIgnoreCase("current")) {
                        System.out.print("Enter minimum balance: ");
                        double minBalance = scanner.nextDouble();
                        System.out.print("Enter penalty amount: ");
                        double penalty = scanner.nextDouble();
                        account.checkMinimumBalance(minBalance, penalty);
                    } else {
                        System.out.println("Minimum balance check is only for current account.");
                    }
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}

