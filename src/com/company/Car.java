package com.company;

import java.util.ArrayList;
import java.util.List;

public class Car implements IParkVehicle{
    private String parkingSpaceRequired = "car";



    public Car(String parkingSpaceRequired) {
        this.parkingSpaceRequired = parkingSpaceRequired;
    }

    public void setParkingSpaceRequired(String parkingSpaceRequired) {
        this.parkingSpaceRequired = parkingSpaceRequired;
    }

    @Override
    public String getRequiredSpot() {
        return parkingSpaceRequired;
    }
}
