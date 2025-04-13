import java.util.ArrayList;

public class Checking extends Account{
    
    private boolean autoPay;
    private ArrayList<Transaction> transactions;
    
    public Checking() {
        super();
        autoPay = false;
        transactions = new ArrayList<Transaction>();
    }
    
    public Checking(String customer, int accountNumber, double balance, boolean autoPay, ArrayList<Transaction> transactions) {
        super(accountNumber, customer, balance);
        this.autoPay = autoPay;
        this.transactions = transactions;
    }
    
    public boolean isAutoPay() {
        return autoPay;
    }
    public void setAutoPay(boolean autoPay) {
        this.autoPay = autoPay;
    }
    
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
    public void setTransactions(ArrayList<Transaction> transactions) {
        this.transactions = transactions;
    }
    
    public String toString() {
        String payments = "";
        for (Transaction pay : transactions) {
            payments += "\n" + pay;
        }
        
        return super.toString() + "\nAutopay Status: " + autoPay + "\nTransactions: " + payments;
    }
}
