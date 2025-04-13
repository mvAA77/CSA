import java.util.ArrayList;

public class OnlineBank {
    
    private ArrayList<CreditCard> creditCards;
    
    public OnlineBank(ArrayList<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
    
    // Search for Credit Card with Most Monthly Fees
    public CreditCard highestMonthlyFees() {
    
        CreditCard maxFeeCard = creditCards.get(0);
        double maxFee = maxFeeCard.getMonthlyFees();
    
        for (int i = 1; i < creditCards.size(); i++) {
            CreditCard currentCard = creditCards.get(i);
            double currentFee = currentCard.getMonthlyFees();
        
            if (currentFee > maxFee) {
                maxFee = currentFee;
                maxFeeCard = currentCard;
            }
        }
    
    return maxFeeCard;
    }
    
    public void searchAmount(double amount) {
        
        boolean printed = false;
        ArrayList<Transaction> temp;
        for (int i = 0; i < creditCards.size(); i++) {
            temp = creditCards.get(i).getTransactions();
            for (int j = 0; j < creditCards.get(i).getTransactions().size(); j++) {
                if (temp.get(j).getAmount() == amount) {
                    System.out.println(temp.get(j));
                    printed = true;
                }
            }
        }
        
        if (printed == false) {
            System.out.println("Sorry, You Didn't Make Any Transactions With That Amount!");
        }
    }
    
    // Given a Checking Account, Find the Largest Transaction
    private void sortCreditCardsByTransactions(ArrayList<CreditCard> cards) {
    
        for (int i = 0; i < cards.size() - 1; i++) {
            int maxIndex = i;
            for (int j = i + 1; j < cards.size(); j++) {
                if (cards.get((j)).getTransactions().size() > 
                    cards.get((maxIndex)).getTransactions().size()) {
                    maxIndex = j;
                }
            }
        
            CreditCard temp = cards.get(i);
            cards.set(i, cards.get(maxIndex));
            cards.set(maxIndex, temp);
        }
    }
    
    // Given a Credit Card, Find the Largest Transaction
    
    public ArrayList<CreditCard> getCreditCards() {
        return creditCards;
    }
    public void setCreditCards(ArrayList<CreditCard> creditCards) {
        this.creditCards = new ArrayList<>(creditCards);
    }
    public void addCreditCard(CreditCard card) {
        creditCards.add(card);
        
    }
    public void removeCreditCard(CreditCard card) {
        creditCards.remove(card);
    }
    
    public void printOrderedList() {
        sortCreditCardsByTransactions(creditCards);
        String printed = "";
        for (CreditCard card : creditCards) {
            printed += "\n" + card.getCardName() + ": " + card.getTransactions().size() + " transactions";
        }
        System.out.println(printed);
    }
}
