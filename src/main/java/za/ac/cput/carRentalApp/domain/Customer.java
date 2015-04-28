package za.ac.cput.carRentalApp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by student on 2015/04/25.
 */
@Entity
public class Customer {
    private String firstName;
    private  String lastName;
    private int phoneNumber;
    @Id
    private String custNumber;

    private Customer(){

    }
    public Customer(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.custNumber = builder.custNumber;
    }

    public String getCustNumber() {
        return custNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder{
        private String firstName;
        private  String lastName;
        private int phoneNumber;
        private String custNumber;

        public Builder(String custNubmer){
            this.custNumber = custNubmer;
        }

        public Builder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public Builder phoneNumber(int phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder copy(Customer value){
            this.firstName = value.getFirstName();
            this.lastName = value.getLastName();
            this.phoneNumber = value.getPhoneNumber();
            this.custNumber = value.getCustNumber();
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }

    }

}
