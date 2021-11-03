package com.company;

public class Motorcycle implements IParkVehicle{
    private String parkingSpaceRequired = "motorcycle";


    public Motorcycle(String parkingSpaceRequired) {
        this.parkingSpaceRequired = parkingSpaceRequired;
    }

    @Override
    public String getRequiredSpot() {
        return parkingSpaceRequired;
    }
}
