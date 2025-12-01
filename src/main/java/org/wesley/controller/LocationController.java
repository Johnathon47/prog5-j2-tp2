package org.wesley.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.wesley.entity.Car;
import org.wesley.entity.Locationable;
import org.wesley.entity.Locationneurable;
import org.wesley.entity.Person;
import org.wesley.manager.LocationManager;
import org.wesley.services.LocationService;

@RestController
public class LocationController {

    private LocationService service =  new LocationService();
    private LocationManager manager =  new LocationManager();

    @GetMapping("rent/test")
    public String rentTest() {
        final Locationneurable client = new Person("Wesley");
        final Locationable car = new Car(1000.0);

        service.rentItem(client, car);
        return "rent success";
    }
    public void process(Locationneurable client, Locationable item) {
        if (manager.checkAvailability(item)) {
            service.rentItem(client, item);
        } else {
            System.out.println("Item not available.");
        }
    }
}
