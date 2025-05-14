package com.pluralsight;

import java.time.Year;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    @Override
    public double getValue() {
        double originalCost = Double.parseDouble(getOriginalCost());
        int currentYear = Year.now().getValue();
        int age = currentYear - this.year;
        double value = originalCost;

        if (age <= 3) {
            value -= originalCost * 0.03 * age;
        } else if (age <= 6) {
            value -= originalCost * 0.03 * 3;
            value -= originalCost * 0.06 * (age - 3);
        } else if (age <= 10) {
            value -= originalCost * 0.03 * 3;
            value -= originalCost * 0.06 * 3;
            value -= originalCost * 0.08 * (age - 6);
        } else {
            value = 1000.00;
        }

        // Reduce by 25% if over 100,000 miles and not Honda/Toyota
        if (odometer > 100000 && !makeModel.toLowerCase().contains("honda") && !makeModel.toLowerCase().contains("toyota")) {
            value *= 0.75;
        }

        return value;
    }

    public Vehicle(String description, String dateAcquired, String originalCost,
                   String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }
}
