package za.ac.cput.carRentalApp.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.carRentalApp.config.DriverFactory;

/**
 * Created by student on 2015/04/26.
 */
public class DriverTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void createDriverTest() throws Exception {
        String name = "";
        String lisenceCode = "";
        int age = 0;
        Driver driver = DriverFactory.createDriver(name, lisenceCode, age);
        Assert.assertEquals("CA120",driver.getLisenceCode());

    }
}
