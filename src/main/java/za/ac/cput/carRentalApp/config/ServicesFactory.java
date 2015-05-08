package za.ac.cput.carRentalApp.config;

import za.ac.cput.carRentalApp.domain.Services;

/**
 * Created by student on 2015/05/05.
 */
public class ServicesFactory {

    public static Services createServices(long serviceNumber, String parts){
        Services services = new Services
                .Builder(serviceNumber)
                .parts(parts)
                .build();
        return services;
    }
}
