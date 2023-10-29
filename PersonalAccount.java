import java.util.ArrayList;
// PersonalAccount class represents a personal bank account
public class PersonalAccount {
    // Instance variables
    private int accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<Amount> transactions; // To store deposit and withdrawal transactions

    // Constructor to initialize the account
    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = 0.0; // Initial balance is set to 0.0
        this.transactions = new ArrayList<>();
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            // Add deposit transaction to the transactions array
            transactions.add(new Amount(amount, "Deposit"));
            System.out.println("Deposit of $" + amount + " successful.");
        } else {
            System.out.println("Invalid deposit amount. Please enter a positive amount.");
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                // Add withdrawal transaction to the transactions array
                transactions.add(new Amount(amount, "Withdrawal"));
                System.out.println("Withdrawal of $" + amount + " successful.");
            } else {
                System.out.println("Insufficient funds. Withdrawal amount exceeds the current balance.");
            }
        } else {
            System.out.println("Invalid withdrawal amount. Please enter a positive amount.");
        }
    }

    // Method to print the transaction history of the account
    public void printTransactionHistory() {
        System.out.println("Transaction History for Account #" + accountNumber);
        for (Amount transaction : transactions) {
            System.out.println(transaction.getTransactionType() + ": $" + transaction.getAmount());
        }
    }

    // Method to retrieve the current balance
    public double getBalance() {
        return balance;
    }

    // Method to retrieve the account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to retrieve the account holder's name
    public String getAccountHolder() {
        return accountHolder;
    }
}