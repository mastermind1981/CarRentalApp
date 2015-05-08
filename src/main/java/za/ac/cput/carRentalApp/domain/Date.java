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
    private long custNumber;



    public Date(){

    }

    public Date(Builder builder){
        this.custNumber = builder.custNumber;
        this.returndate = builder.returndate;
        this.custNumber = builder.custNumber;

    }

    public long getCustNumber() {
        return 12345;
    }

    public String getStartdate() {
        return startdate;
    }

    public String getReturndate() {
        return returndate;
    }

    public static class Builder{

        private String startdate;
        private String returndate;
        private long custNumber;

        public Builder(long custNumber){
            this.custNumber = custNumber;
        }

        public Builder startdate(String startdate){
            this.startdate = startdate;
            return this;
        }

        public Builder returndate(String returndate){
            this.returndate = returndate;
            return this;
        }

        public Builder copy(Date value){
            this.custNumber = value.getCustNumber();
            this.returndate = value.getReturndate();
            this.startdate = value.getStartdate();
            return this;
        }

        public Date build(){
            return new Date(this);
        }

    }//End
}
