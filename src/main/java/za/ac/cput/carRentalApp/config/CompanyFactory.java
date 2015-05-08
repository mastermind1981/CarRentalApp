package za.ac.cput.carRentalApp.config;

import za.ac.cput.carRentalApp.domain.Company;

/**
 * Created by student on 2015/05/05.
 */
public class CompanyFactory {
    public static Company createCompany(String name, String owner,int phoneNumber){
        Company company = new Company
                .Builder(name)
                .owner(owner)
                .phoneNumber(phoneNumber)
                .build();
        return company;
    }
}
