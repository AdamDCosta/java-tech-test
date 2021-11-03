package com.company;

public class Van implements IParkVehicle {
    private String parkingSpaceRequired = "large";
    private String alternativeSpaceRequired = "carx3";

    public Van(String parkingSpaceRequired, String alternativeSpaceRequired) {
        this.parkingSpaceRequired = parkingSpaceRequired;
        this.alternativeSpaceRequired = alternativeSpaceRequired;

    }


    @Override
    public String getRequiredSpot() {
        return parkingSpaceRequired;
    }
}
