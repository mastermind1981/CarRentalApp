package za.ac.cput.carRentalApp.domain;

import javax.persistence.Embeddable;
import javax.persistence.Id;

/**
 * Created by student on 2015/04/25.
 */
@Embeddable
public class Date {
    private String startdate;
    private String returndate;
    @Id
    private String custNumber;



    public Date(){

    }

    public Date(Builder builder){
        this.custNumber = builder.custNumber;
        this.returndate = builder.returndate;
        this.custNumber = builder.custNumber;

    }

    public static class Builder{

        private String startdate;
        private String returndate;
        private String custNumber;

        public Builder(String custNumber){
            this.custNumber = custNumber;
        }

        public Builder startdate(String startdate){
            this.startdate = startdate;
            return this;
        }

        public Builder copy(Date value){
            this.custNumber = value.custNumber;
            this.returndate = value.returndate;
            this.startdate = value.startdate;
            return this;
        }

        public Date build(){
            return new Date(this);
        }

    }//End
}
