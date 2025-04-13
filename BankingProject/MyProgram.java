import java.util.ArrayList;

public class MyProgram
{
    public static void main(String[] args)
    {
        Account firstAccount = new Account(1234, "Tanya Kadiyala", 500);
        System.out.println(firstAccount);

        ArrayList<Transaction> funTransactions = new ArrayList<>();
        ArrayList<Transaction> travelingTransactions = new ArrayList<>();
        ArrayList<Transaction> retailTransactions = new ArrayList<>();
        ArrayList<Transaction> bills = new ArrayList<>();

        travelingTransactions.add(new Transaction("09:15", 50.00, true));
        funTransactions.add(new Transaction("10:30", 125.75, false));
        retailTransactions.add(new Transaction("11:45", 200.00, true));
        retailTransactions.add(new Transaction("12:00", 75.50, false));

        retailTransactions.add(new Transaction("13:20", 300.25, true));
        travelingTransactions.add(new Transaction("14:10", 42.90, false));
        funTransactions.add(new Transaction("15:35", 180.00, true));
        funTransactions.add(new Transaction("16:45", 95.60, false));

        travelingTransactions.add(new Transaction("17:00", 225.30, true));
        funTransactions.add(new Transaction("18:15", 60.75, false));
        travelingTransactions.add(new Transaction("19:30", 150.00, true));
        retailTransactions.add(new Transaction("20:45", 85.25, false));
        
        bills.add(new Transaction("07:00", 500.00, true));
        bills.add(new Transaction("12:30", 25.50, false));
        bills.add(new Transaction("13:15", 350.75, true));
        bills.add(new Transaction("15:00", 42.25, false));
        bills.add(new Transaction("17:45", 175.30, true));
        bills.add(new Transaction("19:30", 85.60, false));
        bills.add(new Transaction("21:00", 220.00, true));
        bills.add(new Transaction("22:15", 30.75, false));
        
        Checking mainAccount = new Checking("Tanya K", 1234, 32000, true, bills);
        
        ArrayList<CreditCard> cards = new ArrayList<CreditCard>();
        
        CreditCard amex = new CreditCard("Tanya K", 1234, 1924, "AMEX", 49, 740, funTransactions);
        CreditCard capitalOne = new CreditCard("Tanya K", 1234, 1332, "Capital One", 34, 740, travelingTransactions);
        CreditCard discover = new CreditCard("Tanya K", 1234, 1033, "Discover", 42, 740, retailTransactions);
        
        cards.add(amex);
        cards.add(capitalOne);
        cards.add(discover);
        
        Savings houseSavings = new Savings("Tanya K", 1234, 87000, 2.47, 8000, 100);
        OnlineBank rocketMoney = new OnlineBank(cards);
        System.out.println("Credit Card With The Highest Monthly Fees: ");
        System.out.println(rocketMoney.highestMonthlyFees());
        System.out.println("\n------------------------------------------------------------------");
        System.out.println("\nCredit Cards Sorted By Number Of Transactions");
        rocketMoney.printOrderedList();
    }
}
