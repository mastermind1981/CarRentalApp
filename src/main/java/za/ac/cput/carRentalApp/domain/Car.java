package za.ac.cput.carRentalApp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;

/**
 * Created by student on 2015/04/25.
 */
@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long Id;
    private String model;
    private String colour;
    private String category;
    private int speed;
    private int numberOfPassengers;
    private int KM;

    private Car(){

    }

    public Car(Builder builder){
        this.Id = builder.Id;
        this.category = builder.category;
        this.colour = builder.colour;
        this.model = builder.model;
        this.KM = builder.KM;
        this.numberOfPassengers = builder.numberOfPassengers;
    }

    public static class Builder{
        private long Id;
        private String model;
        private String colour;
        private String category;
        private int numberOfPassengers;
        private int KM;

        public Builder(String model){
            this.model = model;
        }

        public Builder colour(String colour){
            this.colour = colour;
            return this;
        }

        public Builder Id(long Id){
            this.Id = Id;
            return this;
        }

        public Builder category(String category){
            this.category = category;
            return this;
        }

        public Builder numberOfPassengers(int numberOfPassengers){
            this.numberOfPassengers = numberOfPassengers;
            return this;
        }

        public Builder KM(int KM){
            this.KM = KM;
            return this;
        }

        public Builder copy(Car value){
            this.Id = value.Id;
            this.colour = value.colour;
            this.model = value.model;
            this.category = value.category;
            this.numberOfPassengers = value.numberOfPassengers;
            this.KM = value.KM;
            return this;

        }

        public Car build(){
            return new Car(this);
        }

    }

}
