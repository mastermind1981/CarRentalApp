package za.ac.cput.carRentalApp.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.carRentalApp.config.CustomerFactory;

/**
 * Created by student on 2015/04/26.
 */
public class CustomerTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void createCustomerTest() throws Exception {
        String firstName = "";
        String lastName = "";

        Customer customer = CustomerFactory.createCustomer(firstName, lastName);
        Assert.assertEquals("thabo", customer.getFirstName());

    }
}
