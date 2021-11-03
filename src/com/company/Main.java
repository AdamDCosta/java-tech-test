package com.company;

public class Main {

    public static void main(String[] args) {
	/*
Design a parking lot using object-oriented principles

Goals:
- Your solution should be in Java - if you would like to use another language, please let the interviewer know.
- Boilerplate is provided. Feel free to change the code as you see fit

Assumptions:
- The parking lot can hold motorcycles, cars and vans
- The parking lot has motorcycle spots, car spots and large spots
- A motorcycle can park in any spot
- A car can park in a single compact spot, or a regular spot
- A van can park, but it will take up 3 regular spots
- These are just a few assumptions. Feel free to ask your interviewer about more assumptions as needed

Here are a few methods that you should be able to run:
- Tell us how many spots are remaining
- Tell us how many total spots are in the parking lot
- Tell us when the parking lot is full
- Tell us when the parking lot is empty
- Tell us when certain spots are full e.g. when all motorcycle spots are taken
- Tell us how many spots vans are taking up
*/

        ParkingLot adamsCarPark = new ParkingLot(20, 100, 5);
        System.out.println(adamsCarPark.totalSpots());

        Car myCar = new Car("car");
        System.out.println(adamsCarPark.parkVehicle(myCar));
        System.out.println(adamsCarPark.remainingSpots());

        Van vanOne = new Van("large", "carx3");
        System.out.println(adamsCarPark.parkVan(vanOne));

        System.out.println(adamsCarPark.remainingSpots());
    }
}