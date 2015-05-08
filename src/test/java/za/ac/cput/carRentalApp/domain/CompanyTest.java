package za.ac.cput.carRentalApp.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.carRentalApp.config.CompanyFactory;

/**
 * Created by student on 2015/04/26.
 */
public class CompanyTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void createCompanyTest() throws Exception {
        String name = "";
        String owner = "";
        int phoneNumber = 0;

        Company company = CompanyFactory.createCompany(name, owner, phoneNumber);

        Assert.assertEquals("elite", company.getName());

    }

    @Test
    public void updateCompanyTest() throws Exception {
        String name = "";
        String owner = "";
        int phoneNumber = 0;

        Company company = CompanyFactory.createCompany(name, owner, phoneNumber);
        Company company1 = new Company
                .Builder(name)
                .owner(owner)
                .phoneNumber(phoneNumber)
                .build();
        Assert.assertEquals("elite", company1.getName());
    }
}
