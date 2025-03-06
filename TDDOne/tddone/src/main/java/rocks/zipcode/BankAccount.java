package rocks.zipcode;
import java.lang.IllegalStateException;

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
    
    public void deposit(double amount) {
        // Your implementation here
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Withdrawal amount must be positive");
        }
    }
    
    public void withdraw(double amount) {
        // Your implementation here
        if (amount > 0 && this.balance > amount) {
            this.balance -= amount;
        } else if (this.balance < amount) {
            System.out.println();
        }
    }
}
