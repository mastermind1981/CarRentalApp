package za.ac.cput.carRentalApp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by student on 2015/04/25.
 */
@Entity
public class Renting {
    @Id
    private String lecensePlate;
    private String period;

    public Renting(){

    }

    public Renting(Builder builder){
        this.lecensePlate = builder.lecensePlate;
        this.period = builder.period;


    }

    public static class Builder{

        private String lecensePlate;
        private String period;


        public Builder(String lecensePlate){
            this.lecensePlate = lecensePlate;
        }


        public Builder copy(Renting value){
            this.lecensePlate = value.lecensePlate;
            this.period = value.period;
            return this;
        }

        public Renting build(){
            return new Renting(this);
        }

    }//End
}
