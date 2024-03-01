package Assignment1;

//create a class FDAccount which extends ABAccount but with 2 following properties
//interestRate(double) and maturityDate(LocalDate)
//Implement following two methods
//getTenure() which returns the tenure in months
//getMaturityAmount() which returns the maturity amount
import java.time.LocalDate;
import java.util.List;

public class FDAccount extends ABAccount {
    private double interestRate;
    private LocalDate maturityDate;

    public FDAccount(int accountNumber, List<Transaction> transactions, double balance, LocalDate openingDate, double interestRate, LocalDate maturityDate) {
        super(accountNumber, transactions, balance, openingDate);
        this.interestRate = interestRate;
        this.maturityDate = maturityDate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public LocalDate getMaturityDate() {
        return maturityDate;
    }

    public int getTenure() {
        return (int) (maturityDate.toEpochDay() - openingDate.toEpochDay()) / 30;
    }

    public double getMaturityAmount() {
        return balance + (balance * interestRate * getTenure() / 100);
    }
}