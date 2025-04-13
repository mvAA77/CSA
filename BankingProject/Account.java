import java.util.ArrayList;

public class Account {
    
    private int accountNumber;
    private String customer;
    private double balance;
    
    public Account() {
        accountNumber = 0000;
        customer = "Jane Joe";
        balance = 0.0;
    } 
    
    public Account(int accountNumber, String customer, double balance) {
        this.accountNumber = accountNumber;
        this.customer = customer;
        this.balance = balance;
    }
    
    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    public String getCustomer() {
        return customer;
    }
    public void setCustomer(String customer) {
        this.customer = customer;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    
    public String toString() {
        return "Name: " + customer + "\nAccount Number: " + accountNumber + "\nBalance: $" + balance;
    }
}
