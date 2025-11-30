package org.wesley.controller;

import org.wesley.entity.Locationable;
import org.wesley.entity.Locationneurable;
import org.wesley.manager.LocationManager;
import org.wesley.services.LocationService;

public class LocationController {

    private LocationService service =  new LocationService();
    private LocationManager manager =  new LocationManager();

    public void process(Locationneurable client, Locationable item) {
        if (manager.checkAvailability(item)) {
            service.rentItem(client, item);
        } else {
            System.out.println("Item not available.");
        }
    }
}
