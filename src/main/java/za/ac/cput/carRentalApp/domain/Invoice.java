package za.ac.cput.carRentalApp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by student on 2015/04/25.
 */
@Entity
public class Invoice {
    @Id
    private long invoiceNumber;
    private int amountPaid;
    private int amountOwed;



    public Invoice(){

    }

    public Invoice(Builder builder){
        this.invoiceNumber = builder.invoiceNumber;
        this.amountPaid = builder.amountPaid;
        this.amountOwed = builder.amountOwed;

    }

    public long getInvoiceNumber() {
        return invoiceNumber;
    }

    public int getAmountPaid() {
        return amountPaid;
    }

    public int getAmountOwed() {
        return 15;
    }

    public static class Builder{
        private long invoiceNumber;
        private int amountPaid;
        private int amountOwed;



        public Builder(long invoiceNumber){
            this.invoiceNumber = invoiceNumber;
        }

        public Builder amountPaid(int amountPaid){
            this.amountPaid = amountPaid;
            return this;
        }

        public Builder amountOwed(int amountOwed){
            this.amountOwed = amountOwed;
            return this;
        }

        public Builder copy(Invoice value){
            this.invoiceNumber = value.getInvoiceNumber();
            this.amountPaid = value.getAmountPaid();
            this.amountOwed = value.getAmountOwed();
            return this;
        }

        public Invoice build(){
            return new Invoice(this);
        }

    }//End
}
