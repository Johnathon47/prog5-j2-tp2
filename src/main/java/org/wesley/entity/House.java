package org.wesley.entity;

public class House implements Locationable {
    private double pricePerDay;
    public House(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String getDescription() {
        return "House";
    }
}
