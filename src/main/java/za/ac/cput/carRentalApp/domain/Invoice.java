package za.ac.cput.carRentalApp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by student on 2015/04/25.
 */
@Entity
public class Invoice {
    @Id
    private String invoiceNumber;
    private int amountPaid;
    private int amountOwed;



    public Invoice(){

    }

    public Invoice(Builder builder){
        this.invoiceNumber = builder.invoiceNumber;
        this.amountPaid = builder.amountPaid;
        this.amountOwed = builder.amountOwed;

    }

    public static class Builder{
        private String invoiceNumber;
        private int amountPaid;
        private int amountOwed;



        public Builder(String invoiceNumber){
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
            this.invoiceNumber = value.invoiceNumber;
            this.amountPaid = value.amountPaid;
            this.amountOwed = value.amountOwed;
            return this;
        }

        public Invoice build(){
            return new Invoice(this);
        }

    }//End
}
