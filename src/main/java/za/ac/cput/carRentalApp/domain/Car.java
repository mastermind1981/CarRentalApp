package za.ac.cput.carRentalApp.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by student on 2015/04/25.
 */
@Entity
public class Car implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String model;
    private String category;
    private int speed;
    private int numberOfPassengers;
    private int KM;

    private Car(){

    }

    public Car(Builder builder){
        this.id = builder.id;
        this.category = builder.category;
        this.model = builder.model;
        this.KM = builder.KM;
        this.numberOfPassengers = builder.numberOfPassengers;
    }

    public long getId() {
        return id;
    }

    public String getModel() {
        return model;
    }

    public String getCategory() {
        return category;
    }

    public int getKM() {
        return KM;
    }

    public int getNumberOfPassengers() {
        return 5;
    }

    public static class Builder{
        private long id;
        private String model;
        private String category;
        private int numberOfPassengers;
        private int KM;

        public Builder(String model){
            this.model = model;
        }
        

        public Builder id(long id){
            this.id = id;
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
            this.id = value.getId();
            this.model = value.getModel();
            this.category = value.getCategory();
            this.numberOfPassengers = value.getNumberOfPassengers();
            this.KM = value.getKM();
            return this;

        }

        public Car build(){
            return new Car(this);
        }

    }

}
