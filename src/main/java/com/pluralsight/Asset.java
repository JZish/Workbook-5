package com.pluralsight;

public abstract class Asset {

    private String description;
    private String dateAcquired;
    private String originalCost;

    public Asset(String description, String dateAcquired, String originalCost) {
        this.description = description;
        this.dateAcquired = dateAcquired;
        this.originalCost = originalCost;
    }

    // Abstract method that subclasses must override
    public abstract double getValue();

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDateAcquired() {
        return dateAcquired;
    }

    public void setDateAcquired(String dateAcquired) {
        this.dateAcquired = dateAcquired;
    }

    public String getOriginalCost() {
        return originalCost;
    }

    public void setOriginalCost(String originalCost) {
        this.originalCost = originalCost;
    }

    public double getOriginalCostAsDouble() {
        try {
            return Double.parseDouble(originalCost);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
