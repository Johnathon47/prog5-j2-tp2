package org.wesley.entity;

public class Computer implements Locationable {
    private double pricePerDay;

    public Computer(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    @Override
    public double getPricePerDay() {
        return pricePerDay;
    }

    @Override
    public String getDescription() {
        return "Computer";
    }
}
