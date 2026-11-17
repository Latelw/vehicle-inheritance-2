package com.pluralsight;

public class Car extends Vehicle{
    private int numOfDoors;

    public Car(int cargoCapacity, String color, int fuelCapacity, String model, int numberOfPassengers, int numOfDoors) {
        super(cargoCapacity, color, fuelCapacity, model, numberOfPassengers);
        this.numOfDoors = numOfDoors;
    }

    public  void openTrunk(){

    }
    public void closeTrunk(){

    }
}
