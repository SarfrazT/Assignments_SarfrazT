package Assignment1;  
/*Create a Transaction class where date amount and type as its fields 
 * type is represented as enum debit and credit
 * Transaction object should be created using Builder pattern
 * Date should be LocalDate object
*/

import java.time.LocalDate;

public class Transaction {
    private LocalDate date;
    private double amount;
    private Type type;

    public Transaction(Builder builder) {
        this.date = builder.date;
        this.amount = builder.amount;
        this.type = builder.type;
    }

    public static class Builder {
        private LocalDate date;
        private double amount;
        private Type type;

        public Builder date(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder amount(double amount) {
            this.amount = amount;
            return this;
        }

        public Builder type(Type type) {
            this.type = type;
            return this;
        }

        public Transaction build() {
            return new Transaction(this);
        }
    }

    public enum Type {
        DEBIT, CREDIT
    }

    //add methods getType and getAmount
    public Type getType() {
        return type;
    }

    public double getAmount() {
        return amount;
    }
}