package za.ac.cput.carRentalApp.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.carRentalApp.config.DateFactory;

/**
 * Created by student on 2015/04/26.
 */
public class DateTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void createDateTest() throws Exception {
        String startdate = "";
        String returndate = "";
        long custNumber = 0;

        Date date = DateFactory.createDate(startdate, returndate, custNumber);

        Assert.assertEquals(12345, date.getCustNumber());

    }

    @Test
    public void updateDateTest() throws Exception {
        String startdate = "";
        String returndate = "";
        long custNumber = 0;

        Date date = DateFactory.createDate(startdate, returndate, custNumber);
        Date date1 = new Date
                .Builder(custNumber)
                .startdate(startdate)
                .returndate(returndate)
                .build();
        Assert.assertEquals(12345, date1.getCustNumber());

    }
}
