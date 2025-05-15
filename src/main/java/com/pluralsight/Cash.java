package com.pluralsight;

public class Cash extends Asset {

    public Cash(String description, String dateAcquired, String originalCost) {
        super(description, dateAcquired, originalCost);
    }

    @Override
    public double getValue() {
        return getOriginalCostAsDouble();
    }
}
