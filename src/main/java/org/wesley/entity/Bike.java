package org.wesley.entity;

public class Bike implements Locationable {
    private double pricePerDay;

    public Bike(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public double getPricePerDay() {
        return pricePerDay;
    }
    @Override
    public String getDescription() {
        return "Bike";
    }
}
