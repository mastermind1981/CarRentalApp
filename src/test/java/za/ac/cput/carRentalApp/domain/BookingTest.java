package za.ac.cput.carRentalApp.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.carRentalApp.config.BookingFactory;

/**
 * Created by student on 2015/04/26.
 */
public class BookingTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void createBookingTest() throws Exception {
        String date = "";
        
        Booking booking = BookingFactory.createBooking(date);

        Assert.assertEquals("12May2015", booking.getDate());

    }

    @Test
    public void updateBookingtest() throws Exception {
        String date = "";

        Booking booking = BookingFactory.createBooking(date);
        Booking booking1 = new Booking
                .Builder(date)
                .build();
        Assert.assertEquals("12May2015", booking1.getDate());

    }
}
