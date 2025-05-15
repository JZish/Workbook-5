package com.pluralsight;

public class House extends Asset {

    private String address;
    private int condition;  // 1 - Excellent, 2 - Good, 3 - Fair, 4 - Poor
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, String originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLotSize() {
        return lotSize;
    }

    public void setLotSize(int lotSize) {
        this.lotSize = lotSize;
    }

    @Override
    public double getValue() {
        double valuePerSquareFoot;

        switch (condition) {
            case 1:
                valuePerSquareFoot = 180;
                break; // Excellent
            case 2:
                valuePerSquareFoot = 130;
                break; // Good
            case 3:
                valuePerSquareFoot = 90;
                break; // Fair
            case 4:
                valuePerSquareFoot = 80;
                break; // Poor
            default:
                valuePerSquareFoot = 90;  // Default to Fair
                break;
        }

        return (valuePerSquareFoot * squareFoot) + (0.25 * lotSize);
    }
}
