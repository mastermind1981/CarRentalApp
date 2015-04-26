package za.ac.cput.carRentalApp.domain;

/**
 * Created by student on 2015/04/25.
 */
public class Services {
    private String serviceNumber;
    private String parts;




    public Services(){

    }

    public Services(Builder builder){
        this.serviceNumber = builder.serviceNumber;
        this.parts = builder.parts;


    }

    public static class Builder{

        private String serviceNumber;
        private String parts;


        public Builder(String lecensePlate){
            this.serviceNumber = lecensePlate;
        }


        public Builder copy(Services value){
            this.serviceNumber = value.serviceNumber;
            this.parts = value.parts;
            return this;
        }

        public Services build(){
            return new Services(this);
        }

    }//End
}