package za.ac.cput.carRentalApp.config;

import za.ac.cput.carRentalApp.domain.Driver;

/**
 * Created by student on 2015/04/27.
 */
public class DriverFactory {
    public static Driver createDriver(String name, String lisenceCode, int age){
        Driver driver = new Driver
                .Builder(name)
                .lisenceCode(lisenceCode)
                .age(age)
                .build();
        return driver;
    }
}
