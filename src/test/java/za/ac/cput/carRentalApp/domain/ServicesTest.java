package za.ac.cput.carRentalApp.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.carRentalApp.config.ServicesFactory;

/**
 * Created by student on 2015/04/26.
 */
public class ServicesTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void createServicesTest() throws Exception {
        long serviceNumber = 0;
        String parts = "";

        Services services = ServicesFactory.createServices(serviceNumber, parts);
        Assert.assertEquals(12,services.getServiceNumber());

    }

    @Test
    public void updateServicesTest() throws Exception {
        long serviceNumber = 0;
        String parts = "";

        Services services = ServicesFactory.createServices(serviceNumber, parts);
        Services services1 = new Services
                .Builder(serviceNumber)
                .parts(parts)
                .build();
        Assert.assertEquals(12,services1.getServiceNumber());

    }
}
