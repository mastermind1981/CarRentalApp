package za.ac.cput.carRentalApp.config;

import za.ac.cput.carRentalApp.domain.Booking;


/**
 * Created by student on 2015/04/27.
 */
public class BookingFactory {
    public static Booking createBooking(String date){
        Booking booking = new Booking
                .Builder(date)
                .build();
        return booking;
    }
}
