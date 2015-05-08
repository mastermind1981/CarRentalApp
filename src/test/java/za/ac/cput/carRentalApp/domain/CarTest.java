package za.ac.cput.carRentalApp.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.carRentalApp.config.CarFactory;

/**
 * Created by student on 2015/04/26.
 */
public class CarTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void createCarTest() throws Exception {
        String model = "";
        int KM = 0;
        int numberOfPassengers = 0;
        Car car = CarFactory.createCar(model, KM, numberOfPassengers);
        Assert.assertEquals(5,car.getNumberOfPassengers());

    }

    @Test
    public void updateCarTest() throws Exception {
        String model = "";
        int KM = 0;
        int numberOfPassengers = 0;
        Car car = CarFactory.createCar(model, KM, numberOfPassengers);
        Car car1 = new Car
                .Builder(model)
                .KM(KM)
                .numberOfPassengers(numberOfPassengers)
                .build();
        Assert.assertEquals(5,car1.getNumberOfPassengers());

    }
}
