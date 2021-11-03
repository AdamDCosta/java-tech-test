package com.company;

public class ParkingLot {
    private int motorcycleSpots;
    private int carSpots;
    private int largeSpots;
    private int remainingMotorcycleSpots;
    private int remainingCarSpots;
    private int remainingLargeSpots;

    public ParkingLot(int motorcycleSpots, int carSpots, int largeSpots) {
        this.motorcycleSpots = motorcycleSpots;
        this.remainingMotorcycleSpots = motorcycleSpots;
        this.carSpots = carSpots;
        this.remainingCarSpots = carSpots;
        this.largeSpots = largeSpots;
        this.remainingLargeSpots = largeSpots;
    }

    public int getMotorcycleSpots() {
        return motorcycleSpots;
    }

    public void setMotorcycleSpots(int motorcycleSpots) {
        this.motorcycleSpots = motorcycleSpots;
    }

    public int getCarSpots() {
        return carSpots;
    }

    public void setCarSpots(int carSpots) {
        this.carSpots = carSpots;
    }

    public int getLargeSpots() {
        return largeSpots;
    }

    public void setLargeSpots(int largeSpots) {
        this.largeSpots = largeSpots;
    }

    public int getRemainingMotorcycleSpots() {
        return remainingMotorcycleSpots;
    }

    public void setRemainingMotorcycleSpots(int remainingMotorcycleSpots) {
        this.remainingMotorcycleSpots = remainingMotorcycleSpots;
    }

    public int getRemainingCarSpots() {
        return remainingCarSpots;
    }

    public void setRemainingCarSpots(int remainingCarSpots) {
        this.remainingCarSpots = remainingCarSpots;
    }

    public int getRemainingLargeSpots() {
        return remainingLargeSpots;
    }

    public void setRemainingLargeSpots(int remainingLargeSpots) {
        this.remainingLargeSpots = remainingLargeSpots;
    }

    public String remainingSpots() {
        return "The total number of motorcycle spaces available is " + remainingMotorcycleSpots  + " " +
                "The total number of car spaces available is " + remainingCarSpots + " " +
                "The total number of large spaces available is " + remainingLargeSpots;
    }

    public String totalSpots() {
        return "This car park has a total of " + " " + motorcycleSpots + " " + "motorcycle spaces" + " " +
                "This car park has a total of " + " " + carSpots + " " + "car spaces" + " " +
                "This car park has a total of " + " " + largeSpots + " " + "large spaces";
    }

    public boolean isFull() {
        return remainingMotorcycleSpots + remainingCarSpots + remainingLargeSpots == 0;
    }

    public boolean isEmpty() {
        return remainingMotorcycleSpots + remainingCarSpots + remainingLargeSpots == motorcycleSpots + carSpots + largeSpots;
    }

    public String parkVan(Van van) {
        if (remainingLargeSpots > 0) {
            setRemainingLargeSpots(remainingLargeSpots -= 1);
        } else if (remainingCarSpots >= 3) {
            setRemainingCarSpots(remainingCarSpots -= 3);
        } else return "No available spaces";
        return "You've parked your van";
    }

    public String parkVehicle(IParkVehicle vehicle) {
        if (vehicle.getRequiredSpot() == "car" && remainingCarSpots > 0) {
            setRemainingCarSpots(remainingCarSpots -= 1);
        } else if (vehicle.getRequiredSpot() == "motorcycle" && remainingMotorcycleSpots > 0) {
            setRemainingMotorcycleSpots(remainingMotorcycleSpots -= 1);
        } else if (vehicle.getRequiredSpot() == "large" && remainingLargeSpots > 0) {
            setRemainingLargeSpots(remainingLargeSpots -= 1);
        } else return "No available spaces";
        return "You've parked your vehicle";
    }
}
