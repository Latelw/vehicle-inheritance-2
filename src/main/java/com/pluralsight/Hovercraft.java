package com.pluralsight;

public class Hovercraft extends Vehicle{
    private int airCushionPressure;

    public Hovercraft(int cargoCapacity, String color, int fuelCapacity, String model, int numberOfPassengers, int airCushionPressure) {
        super(cargoCapacity, color, fuelCapacity, model, numberOfPassengers);
        this.airCushionPressure = airCushionPressure;
    }

    public void hover(){

    }
}
