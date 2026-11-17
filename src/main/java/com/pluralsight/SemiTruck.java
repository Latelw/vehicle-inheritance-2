package com.pluralsight;

public class SemiTruck extends Vehicle {
    public SemiTruck(int cargoCapacity, String color, int fuelCapacity, String model, int numberOfPassengers, int numOfTrailers) {
        super(cargoCapacity, color, fuelCapacity, model, numberOfPassengers);
        this.numOfTrailers = numOfTrailers;
    }

    private int numOfTrailers;

    public void loadCargo(){

    }
    public void unloadCargo() {}
}
