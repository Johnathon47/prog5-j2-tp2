package org.wesley.entity;

public class Car implements Locationable {
    private double pricePerDay;

    public Car(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String getDescription() {
        return "Car";
    }
}
