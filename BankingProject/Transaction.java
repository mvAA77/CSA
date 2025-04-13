import java.util.ArrayList;

public class Transaction {
    
    private String time;
    private double amount;
    private boolean cash;
    
    public Transaction() {
        time = "00:00";
        amount = 0.0;
        cash = false;
    }
    
    public Transaction(String time, double amount, boolean cash) {
        this.time = time;
        this.amount = amount;
        this.cash = cash;
    }
    
    
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public boolean isCash() {
        return cash;
    }
    public void setCash(boolean cash) {
        this.cash = cash;
    }
    
    public String toString() {
        return "Time: " + time + " -- Amount: " + amount + " -- Withdrawn in cash: " + cash;
    }
