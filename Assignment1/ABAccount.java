package Assignment1;
/*
 * Create a class ABAccount which will be an abstract class with fields
 * accountNumber(int),transactions(List of Transaction objects), balance(double) and opening date(localDate)
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public abstract class ABAccount {
    private int accountNumber;
    protected List<Transaction> transactions;
    protected double balance;
    protected LocalDate openingDate;

    public ABAccount() {
        transactions = new ArrayList<>();
        balance = 0.0;
    }

    public ABAccount(int accountNumber, List<Transaction> transactions, double balance, LocalDate openingDate) {
        this.accountNumber = accountNumber;
        this.transactions = transactions;
        this.balance = balance;
        this.openingDate = openingDate;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }

    public void deposit(Transaction transaction) {
        if (transaction == null) {
            System.out.println("Transaction is null, cannot deposit");
            return;
        }

        if (transaction.getType() == Transaction.Type.CREDIT) {
            transactions.add(transaction);
            balance += transaction.getAmount();
        }
    }
    //create a getBalance method which returns the balacce
    public double getBalance() {
        return balance;
    }

}