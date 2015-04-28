package za.ac.cput.carRentalApp.config;

import za.ac.cput.carRentalApp.domain.Employee;

/**
 * Created by student on 2015/04/27.
 */
public class EmployeeFactory {
    public static Employee createEmployee(String empNumber){
        Employee employee = new Employee
                .Builder(empNumber)
                .build();
        return employee;
    }
}
