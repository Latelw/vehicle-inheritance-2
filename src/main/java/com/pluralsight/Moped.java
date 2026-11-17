package com.pluralsight;

public class Moped extends Vehicle{

    private int maxOfSpeed;

    public Moped(int cargoCapacity, String color, int fuelCapacity, String model, int numberOfPassengers, int maxOfSpeed) {
        super(cargoCapacity, color, fuelCapacity, model, numberOfPassengers);
        this.maxOfSpeed = maxOfSpeed;
    }

    public void ride(){

    }

}
