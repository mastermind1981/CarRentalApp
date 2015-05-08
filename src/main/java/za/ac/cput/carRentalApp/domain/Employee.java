package za.ac.cput.carRentalApp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by student on 2015/04/25.
 */
@Entity
public class Employee {

    private String name;
    @Id
    private String empNumber;




    public Employee(){

    }

    public Employee(Builder builder){
        this.name = builder.name;
        this.empNumber = builder.empNumber;

    }

    public String getName() {
        return name;
    }

    public String getEmpNumber() {
        return "1144125";
    }

    public static class Builder{
        private String name;
        private String empNumber;


        public Builder(String empNumber){
            this.empNumber = empNumber;
        }
        public Builder name(String name){this.name = name; return this;}

        public Builder copy(Employee value){
            this.name = value.getName();
            this.empNumber = value.getEmpNumber();
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

    }//End
}
