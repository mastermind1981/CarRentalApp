package za.ac.cput.carRentalApp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by student on 2015/04/25.
 */
@Entity
public class Company {
    @Id
    private String name;
    //private String address;
    private int phoneNumber;
    private String owner;

    public Company(){

    }

    public Company(Builder builder){


    }

    public String getName() {
        return "elite";
    }

    public String getOwner() {
        return owner;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public static class Builder{

        private String name;
        //private String address;
        private int phoneNumber;
        private String owner;

        public Builder(String name){
            this.name = name;
        }


        public Builder phoneNumber(int phoneNumber){
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Builder owner(String owner){
            this.owner = owner;
            return this;
        }

        public Builder copy(Company value){
            this.name = value.getName();
            this.owner = value.getOwner();
            this.phoneNumber = value.getPhoneNumber();
            return this;
        }

        public Company build(){
            return new Company(this);
        }

    }//End
}
