import java.util.ArrayList;

public class Savings extends Account {
    
    private double annualInterest;
    private int minBalance;
    private double withdrawalLimit;
    
    public Savings() {
        super();
        annualInterest = 0.0;
        minBalance = 000;
        withdrawalLimit = 0.0;
    }
    public Savings(String customer, int accountNumber, double balance, double annualInterest, int minBalance, double withdrawalLimit) {
        super(accountNumber, customer, balance);
        this.annualInterest = annualInterest;
        this.minBalance = minBalance;
        this.withdrawalLimit = withdrawalLimit;
    }
    
    public double getAnnualInterest() {
        return annualInterest;
    }
    public void setAnnualInterest(double annualInterest) {
        this.annualInterest = annualInterest;
    }
    public int getMinBalance() {
        return minBalance;
    }
    public void setMinBalance(int minBalance) {
        this.minBalance = minBalance;
    }
    public double getWithdrawalLimit() {
        return withdrawalLimit;
    }
    public void setWithdrawalLimit(double withdrawalLimit) {
        this.withdrawalLimit = withdrawalLimit;
    }
    
}
