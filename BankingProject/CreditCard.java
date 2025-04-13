import java.util.ArrayList;

public class CreditCard extends Account {
    
    private String cardName;
    private double monthlyFees;
    private int creditScore;
    private ArrayList<Transaction> transactions;
    
    public CreditCard() {
        super();
        monthlyFees = 0.0;
        creditScore = 000;
        transactions = new ArrayList<Transaction>();
    }
    
    public CreditCard(String customer, int accountNumber, double balance, String cardName, double monthlyFees, int creditScore, ArrayList<Transaction> transactions) {
        super(accountNumber, customer, balance);
        this.cardName = cardName;
        this.monthlyFees = monthlyFees;
        this.creditScore = creditScore;
        this.transactions = transactions;
    }
    
    public double getMonthlyFees() {
        return monthlyFees;
    }

    public String getCardName() {
        return cardName;
    }
    public void setCardName(String cardName) {
        this.cardName = cardName;
    }
    public void setMonthlyFees(double monthlyFees) {
        this.monthlyFees = monthlyFees;
    }
    public int getCreditScore() {
        return creditScore;
    }
    public void setCreditScore(int creditScore) {
        this.creditScore = creditScore;
    }
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
    public void addTransaction(Transaction transaction) {
        this.transactions.add(transaction);
    }
    
    public String toString() {
        String payments = "";
        for (Transaction pay : transactions) {
            payments += "\n" + pay;
        }
        
        return "\nCard Name: " + cardName + "\n" + super.toString() + "\nMonthly Fees: " + monthlyFees + "\nCredit Score: " + creditScore  + "\nTransactions: " + payments;
    }
    
    
}
