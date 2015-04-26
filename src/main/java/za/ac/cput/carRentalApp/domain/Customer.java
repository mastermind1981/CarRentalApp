package za.ac.cput.carRentalApp.domain;

/**
 * Created by student on 2015/04/25.
 */
public class Customer {
    private String firstName;
    private  String lastName;
    private int phoneNumber;
    private String custNumber;

    private Customer(){

    }
    public Customer(Builder builder){
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.phoneNumber = builder.phoneNumber;
        this.custNumber = builder.custNumber;
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
            this.firstName = value.firstName;
            this.lastName = value.lastName;
            this.phoneNumber = value.phoneNumber;
            this.custNumber = value.custNumber;
            return this;
        }

        public Customer build(){
            return new Customer(this);
        }

    }

}
