package org.wesley;

import org.wesley.controller.LocationController;
import org.wesley.entity.Car;
import org.wesley.entity.Locationable;
import org.wesley.entity.Locationneurable;
import org.wesley.entity.Person;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        final LocationController controller = new LocationController();

        final Locationneurable client = new Person("Wesley");
        final Locationable item = new Car(1000.0);

        controller.process(client, item);
    }
}