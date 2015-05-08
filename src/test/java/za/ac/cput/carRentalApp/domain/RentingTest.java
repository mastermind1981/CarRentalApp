package za.ac.cput.carRentalApp.domain;

import junit.framework.Assert;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.carRentalApp.config.RentingFactory;

/**
 * Created by student on 2015/04/26.
 */
public class RentingTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void createRentingTest() throws Exception {
        String lecensePlate = "";
        String period = "";

        Renting renting = RentingFactory.createRenting(lecensePlate, period);
        Assert.assertEquals("CA120", renting.getLecensePlate());

    }

    @Test
    public void updateRentingTest() throws Exception {
        String lecensePlate = "";
        String period = "";

        Renting renting = RentingFactory.createRenting(lecensePlate, period);
        Renting renting1 = new Renting
                .Builder(lecensePlate)
                .period(period)
                .build();

        Assert.assertEquals("CA120", renting1.getLecensePlate());

    }

    @After
    public void tearDown() throws Exception {


    }
}
