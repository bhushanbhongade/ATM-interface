package application;

import java.util.Scanner;

public class ATM {

    private String userID;
    private String pin;
    private double balance;

    public ATM(String userID, String pin, double balance) {
        this.userID = userID;
        this.pin = pin;
        this.balance = balance;
    }

    public void login() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your user ID: ");
        String enteredUserID = scanner.nextLine();

        System.out.println("Enter your PIN: ");
        String enteredPin = scanner.nextLine();

        if (enteredUserID.equals(this.userID) && enteredPin.equals(this.pin)) {
            System.out.println("Login successful!");
        } else {
            System.out.println("Login failed!");
        }
    }

    public void showTransactionHistory() {
        System.out.println("Transaction history:");
        // TODO: Implement this method to show the transaction history of the user.
    }

    public void withdraw() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount you want to withdraw: ");
        double amount = scanner.nextDouble();

        if (amount > this.balance) {
            System.out.println("Insufficient balance!");
        } else {
            this.balance -= amount;
            System.out.println("Withdrawal successful!");
        }
    }

    public void deposit() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount you want to deposit: ");
        double amount = scanner.nextDouble();

        this.balance += amount;
        System.out.println("Deposit successful!");
    }

    public void transfer() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the account number you want to transfer to: ");
        String accountNumber = scanner.nextLine();

        System.out.println("Enter the amount you want to transfer: ");
        double amount = scanner.nextDouble();

        if (amount > this.balance) {
            System.out.println("Insufficient balance!");
        } else {
            this.balance -= amount;
            // TODO: Implement this method to transfer money to another account.
        }
    }

    public void showCurrentBalance() {
        System.out.println("Your current balance is: " + this.balance);
    }

    public void quit() {
        System.out.println("Thank you for using our ATM!");
    }

    public static void main(String[] args) {
        ATM atm = new ATM("123456789", "1234", 10000);
        Scanner scanner=new Scanner(System.in);
        atm.login();

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Transactions History");
            System.out.println("2. Withdraw");
            System.out.println("3. Deposit");
            System.out.println("4. Transfer");
            System.out.println("5. Show Current Balance");
            System.out.println("6. Quit");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    atm.showTransactionHistory();
                    break;
                case 2:
                    atm.withdraw();
                    break;
                case 3:
                    atm.deposit();
                    break;
                case 4:
                    atm.transfer();
                    break;
                case 5:
                    atm.showCurrentBalance();
                    break;
                case 6:
                    atm.quit();
                    break;
            }
        }
    }
}
