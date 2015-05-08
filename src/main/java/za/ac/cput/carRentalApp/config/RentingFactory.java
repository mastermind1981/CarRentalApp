package za.ac.cput.carRentalApp.config;

import za.ac.cput.carRentalApp.domain.Renting;

/**
 * Created by student on 2015/05/05.
 */
public class RentingFactory {
    public static Renting createRenting(String lecensePlate, String period){
        Renting renting = new Renting
                .Builder(lecensePlate)
                .period(period)
                .build();
        return renting;

    }
}
