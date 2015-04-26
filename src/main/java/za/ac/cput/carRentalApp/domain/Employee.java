package za.ac.cput.carRentalApp.domain;

/**
 * Created by student on 2015/04/25.
 */
public class Employee {

    private String name;
    private String empNumber;




    public Employee(){

    }

    public Employee(Builder builder){
        this.name = builder.name;
        this.empNumber = builder.empNumber;

    }

    public static class Builder{
        private String name;
        private String empNumber;


        public Builder(String empNumber){
            this.empNumber = empNumber;
        }

        public Builder lisenceCode(String lisenceCode){
            this.name = name;
            return this;
        }



        public Builder copy(Employee value){
            this.name = value.name;
            this.empNumber = value.empNumber;
            return this;
        }

        public Employee build(){
            return new Employee(this);
        }

    }//End
}
