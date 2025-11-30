package org.wesley.entity;

public class Money implements Locationable {
    private double pricePerDay;

    public Money(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String getDescription() {
        return "Money";
    }
}
