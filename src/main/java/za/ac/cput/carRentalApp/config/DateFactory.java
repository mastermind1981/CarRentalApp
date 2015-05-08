package za.ac.cput.carRentalApp.config;

import za.ac.cput.carRentalApp.domain.Date;

/**
 * Created by student on 2015/05/05.
 */
public class DateFactory {
    public static Date createDate(String startdate, String returndate, long custNumber){
        Date date = new Date
                .Builder(custNumber)
                .startdate(startdate)
                .returndate(returndate)
                .build();
        return date;
    }
}
