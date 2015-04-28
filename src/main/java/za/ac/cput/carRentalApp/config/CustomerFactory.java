package za.ac.cput.carRentalApp.config;

import za.ac.cput.carRentalApp.domain.Customer;

/**
 * Created by student on 2015/04/27.
 */
public class CustomerFactory {
    public static Customer createCustomer(String firstName, String lastName){
        Customer customer = new Customer
                .Builder(firstName)
                .lastName(lastName)
                .build();
        return customer;
    }
}
