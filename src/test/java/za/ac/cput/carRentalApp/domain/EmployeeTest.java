package za.ac.cput.carRentalApp.domain;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import za.ac.cput.carRentalApp.config.EmployeeFactory;

/**
 * Created by student on 2015/04/26.
 */
public class EmployeeTest {
    @Before
    public void setUp() throws Exception {


    }

    @Test
    public void createEmployeeTest() throws Exception {
        String empNumber = "";
        String name = "";
        Employee employee = EmployeeFactory.createEmployee(empNumber, name);

        Assert.assertEquals("1144125",employee.getEmpNumber());

    }

    @Test
    public void updateEmployeeTest() throws Exception {
        String empNumber = "";
        String name = "";
        Employee employee = EmployeeFactory.createEmployee(empNumber, name);
        Employee employee1 = new Employee
                .Builder(empNumber)
                .name(name)
                .build();
        Assert.assertEquals("1144125",employee1.getEmpNumber());

    }
}
