package Assignment1;

/*
 * let us create main class with main method which needs to build Transaction object
 * 
 */
import java.time.LocalDate;

public class Tmain {
    public static void main(String[] args) {
        Transaction transaction = new Transaction.Builder().date(LocalDate.now()).amount(1000).type(Transaction.Type.CREDIT).build();
        System.out.println(transaction.getType());
        System.out.println(transaction.getAmount());
        Transaction transaction1 = new Transaction.Builder().date(LocalDate.now()).amount(2000).type(Transaction.Type.DEBIT).build();
        System.out.println(transaction1.getType());
        System.out.println(transaction1.getAmount());
        /*
         * Add conditions to validate if SB Account and FDAccount are working as expected
         * 
         */

        // create a SB account with account number 1, balance 1000, opening date as today and min balance as 500
        SBAccount sbAccount = new SBAccount(1, null, 1000, LocalDate.now(), 500);
        // create a transaction with amount 1000 and type as credit
        Transaction transaction2 = new Transaction.Builder().date(LocalDate.now()).amount(1000).type(Transaction.Type.CREDIT).build();
        // deposit the transaction to the account
        sbAccount.deposit(transaction2);
        // create a transaction with amount 1000 and type as debit
        Transaction transaction3 = new Transaction.Builder().date(LocalDate.now()).amount(1000).type(Transaction.Type.DEBIT).build();
        // withdraw the transaction from the account
        try {
            sbAccount.withdraw(transaction3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // create a transaction with amount 1000 and type as debit
        Transaction transaction4 = new Transaction.Builder().date(LocalDate.now()).amount(1000).type(Transaction.Type.DEBIT).build();
        // withdraw the transaction from the account
        try {
            sbAccount.withdraw(transaction4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        // create a FDAccount with account number 2, balance 1000, opening date as today, interest rate as 5 and maturity date as 3 months from today
        FDAccount fdAccount = new FDAccount(2, null, 1000, LocalDate.now(), 5, LocalDate.now().plusMonths(3));
        // create a transaction with amount 1000 and type as credit
        Transaction transaction5 = new Transaction.Builder().date(LocalDate.now()).amount(1000).type(Transaction.Type.CREDIT).build();
        // deposit the transaction to the account
        fdAccount.deposit(transaction5);
        // get the tenure of the account
        System.out.println(fdAccount.getTenure());
        // get the maturity amount of the account
        System.out.println(fdAccount.getMaturityAmount());
        

    


    }
}