package rocks.zipcode;
import java.lang.IllegalStateException;
import java.lang.IllegalArgumentException;

/** 
 * EXERCISE 2: BankAccount
 * 
 * Implement a BankAccount class that passes all the tests.
 * The class should handle deposits, withdrawals, and maintain a balance.
 */


// Student must implement this class
public class BankAccount {
    // TODO: Implement this class to make the tests pass
    private String accountNumber;
    private String ownerName;
    private double balance = 0.0;
    Exception exception = new Exception();

    public BankAccount(String accountNumber, String ownerName) {
        // Your implementation here
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }
    
    public String getAccountNumber() {
        // Your implementation here
        return accountNumber;
        //return null;
    }
    
    public String getOwnerName() {
        // Your implementation here
        return ownerName;
        //return null;
    }
    
    public double getBalance() {
        // Your implementation here
        return balance;
        //return 0.0;
    }


    public void deposit(double amount) throws IllegalArgumentException {
        // Your implementation here
        if (this.balance + amount < this.balance) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        this.balance += amount;

    }
    
    public void withdraw(double amount) throws IllegalArgumentException {
        // Your implementation here
        if (this.balance - amount < 0) {
            throw new IllegalStateException("Insufficient funds");
        } else if (this.balance - amount > this.balance) {
            throw new IllegalArgumentException("Withdrawal amount must be positive");
        }
        this.balance -= amount;
    }
}