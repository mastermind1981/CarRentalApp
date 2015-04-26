package za.ac.cput.carRentalApp.domain;

import javax.persistence.Entity;

/**
 * Created by student on 2015/04/25.
 */
@Entity
public class Booking  {

   private String date;

    public Booking(){

    }
    public Booking(Builder builder){
        this.date = date;

    }



    public static class Builder{
        private String date;

        public Builder(String date){
            this.date=date;
        }

        public Builder copy(Booking value){
            this.date = value.date;
            return this;
        }

        public Booking build(){
            return new Booking(this);
        }
    }
}
