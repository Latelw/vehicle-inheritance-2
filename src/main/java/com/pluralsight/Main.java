package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car();
        Moped moped1 = new Moped();
        Hovercraft starShip = new Hovercraft();
        SemiTruck semi = new SemiTruck();

        honda.setModel("accord");
        moped1.setColor("red");
        starShip.setFuelCapacity(30);
        semi.setCargoCapacity(50000);


        System.out.println("Honda model: " + honda.getModel());
        System.out.println("Moped1 color: " + moped1.getColor());
        System.out.println("Star Ship fuel capacity: " + starShip.getFuelCapacity());
        System.out.println("Semi Cargo Capacity: " + semi.getCargoCapacity());

    }
}
