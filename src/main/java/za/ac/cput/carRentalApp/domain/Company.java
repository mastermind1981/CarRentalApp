package za.ac.cput.carRentalApp.domain;

/**
 * Created by student on 2015/04/25.
 */
public class Company {
    private String name;
    //private String address;
    private int phoneNumber;
    private String owner;

    public Company(){

    }

    public Company(Builder builder){


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
            this.name = value.name;
            this.owner = value.owner;
            this.phoneNumber = value.phoneNumber;
            return this;
        }

        public Company build(){
            return new Company(this);
        }

    }//End
}
