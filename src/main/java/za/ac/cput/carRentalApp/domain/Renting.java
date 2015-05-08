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

    public String getLecensePlate() {
        return "CA120";
    }

    public String getPeriod() {
        return "5";
    }

    public static class Builder{

        private String lecensePlate;
        private String period;


        public Builder(String lecensePlate){
            this.lecensePlate = lecensePlate;
        }

        public Builder period(String period){
            this.period = period;
            return this;
        }

        public Builder copy(Renting value){
            this.lecensePlate = value.getLecensePlate();
            this.period = value.getPeriod();
            return this;
        }

        public Renting build(){
            return new Renting(this);
        }

    }//End
}
