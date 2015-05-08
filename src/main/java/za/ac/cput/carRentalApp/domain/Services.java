package za.ac.cput.carRentalApp.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by student on 2015/04/25.
 */
@Entity
public class Services {
    @Id
    private long serviceNumber;
    private String parts;




    public Services(){

    }

    public Services(Builder builder){
        this.serviceNumber = builder.serviceNumber;
        this.parts = builder.parts;


    }

    public long getServiceNumber() {
        return 12;
    }

    public String getParts() {
        return "mirror";
    }

    public static class Builder{

        private long serviceNumber;
        private String parts;


        public Builder(long serviceNumber){
            this.serviceNumber = serviceNumber;
        }

        public Builder parts(String parts){
            this.parts = parts;
            return this;
        }

        public Builder copy(Services value){
            this.serviceNumber = value.getServiceNumber();
            this.parts = value.getParts();
            return this;
        }

        public Services build(){
            return new Services(this);
        }

    }//End
}
