package za.ac.cput.carRentalApp.domain;

import javax.persistence.Entity;

/**
 * Created by student on 2015/04/25.
 */
@Entity
public class Driver {


    private String name;
    private String lisenceCode;
    private int age;



    public Driver(){

    }

    public Driver(Builder builder){
        this.name = builder.name;
        this.lisenceCode = builder.lisenceCode;
        this.age = builder.age;

    }

    public String getName() {
        return name;
    }

    public String getLisenceCode() {
        return lisenceCode;
    }

    public int getAge() {
        return age;
    }

    public static class Builder{
        private String name;
        private String lisenceCode;
        private int age;



        public Builder(String name){
            this.name = name;
        }

        public Builder lisenceCode(String lisenceCode){
            this.lisenceCode = lisenceCode;
            return this;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder copy(Driver value){
            this.name = value.getName();
            this.lisenceCode = value.getLisenceCode();
            this.age = value.getAge();
            return this;
        }

        public Driver build(){
            return new Driver(this);
        }

    }//End
}
