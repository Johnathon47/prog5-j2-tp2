package org.wesley.services;

import org.wesley.entity.Locationable;
import org.wesley.entity.Locationneurable;

import java.util.logging.Logger;

public class LocationService {
    private static final Logger logger = Logger.getLogger(LocationService.class.getName());

    public void rentItem(Locationneurable client, Locationable item) {
        try {
            logger.info("Renting process started...");
            client.rent(item);
            logger.info("Success: item rented.");
        } catch (Exception exception) {
            logger.severe("Error during renting: " + exception.getMessage());
        }
    }
}
