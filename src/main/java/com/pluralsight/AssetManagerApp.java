package com.pluralsight;

import java.util.ArrayList;

public class AssetManagerApp {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        // Add Houses

        House house1 = new House("My primary home", "2015-06-01", "250000", "123 Oak St, Dallas, TX", 1, 2000, 5000);
        House house2 = new House("My vacation home", "2018-08-15", "300000", "789 Beachside Ave, Malibu, CA", 2, 1800, 4000);

        // Add Vehicles using full constructor

        Vehicle vehicle1 = new Vehicle("Tom's Toyota", "2020-03-20", "24000", "Toyota Camry", 2019, 45000);
        Vehicle vehicle2 = new Vehicle("My truck", "2015-09-10", "28000", "Ford F-150", 2012, 130000);

        // Add to asset list

        assets.add(house1);
        assets.add(house2);
        assets.add(vehicle1);
        assets.add(vehicle2);

        // Display asset details

        for (Asset asset : assets) {
            System.out.println("--------------------------------------------------");
            System.out.println("Description: " + asset.getDescription());
            System.out.println("Date Acquired: " + asset.getDateAcquired());
            System.out.println("Original Cost: $" + asset.getOriginalCost());
            System.out.printf("Current Value: $%.2f\n", asset.getValue());

            if (asset instanceof House) {
                House house = (House) asset;
                System.out.println("Address: " + house.getAddress());
            } else if (asset instanceof Vehicle) {
                Vehicle vehicle = (Vehicle) asset;
                System.out.println("Year: " + vehicle.getYear());
                System.out.println("Make/Model: " + vehicle.getMakeModel());
                System.out.println("Odometer: " + vehicle.getOdometer() + " miles");
            }
        }

        System.out.println("--------------------------------------------------");

    }
}
