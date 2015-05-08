package za.ac.cput.carRentalApp.repository;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import za.ac.cput.carRentalApp.config.ServicesFactory;
import za.ac.cput.carRentalApp.domain.Services;

/**
 * Created by student on 2015/05/07.
 */
public class ServicesRepoTest {
    private long serviceNumber;
    @Autowired
    private ServicesRepo servicesRepo;

    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void createServicesTest() throws Exception {
        long serviceNumber = 0;
        String parts = "";

        Services services = ServicesFactory.createServices(serviceNumber, parts);
        servicesRepo.save(services);
        Assert.assertEquals(12, services.getServiceNumber());

    }

    @Test
    public void readServicesTest() throws Exception {
        Services services = servicesRepo.findOne(serviceNumber);
        Assert.assertNotNull(services.getServiceNumber());
    }

    @Test
    public void updateServicesTest() throws Exception {
        Services services = servicesRepo.findOne(serviceNumber);
        services = new Services
                .Builder(serviceNumber)
                .copy(services)
                .parts("ligth")
                .build();
        servicesRepo.save(services);
        Services servicesUpdate = servicesRepo.findOne(serviceNumber);
        Assert.assertEquals("ligth", servicesUpdate.getParts());
    }

    @Test
    public void deleteServicesTest() throws Exception {
        Services services = servicesRepo.findOne(serviceNumber);
        servicesRepo.delete(services);
        Services servicesDelete = servicesRepo.findOne(serviceNumber);
        Assert.assertNull(servicesDelete);

    }
}
