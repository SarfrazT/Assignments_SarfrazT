package Assignment1;

import java.time.LocalDate;
import java.util.List;

//This class should extend ABAccount 
//Along with that add, minBalance(Double) and implement withdraw method
//withdraw method should throw InsufficientBalanceException if the balance is less than minBalance

public class SBAccount extends ABAccount {
    private double minBalance;

    public SBAccount(int accountNumber, List<Transaction> transactions, double balance, LocalDate openingDate, double minBalance) {
        super(accountNumber, transactions, balance, openingDate);
        this.minBalance = minBalance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    //Implement withdraw method should throw InsufficientBalanceException if the balance is less than minBalance
    public void withdraw(Transaction transaction) throws Exception {
        if (transaction.getType() == Transaction.Type.DEBIT) {
            if (balance - transaction.getAmount() < minBalance) {
                throw new Exception("Insufficient balance");
            }
            transactions.add(transaction);
            balance -= transaction.getAmount();
        }
    }
}