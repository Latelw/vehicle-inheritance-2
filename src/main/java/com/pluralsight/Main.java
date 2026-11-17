package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Car honda = new Car(100, "red", 20,"accord",4,4);
        Moped moped1 = new Moped(15,"black",5,"speed",2,75);
        Hovercraft starShip = new Hovercraft(200,"white",60,"experimental",6,10);
        SemiTruck semi = new SemiTruck(25000,"blue",250,"W900", 2,1);


        System.out.println("Honda model: " + honda.getModel());
        System.out.println("Moped1 color: " + moped1.getColor());
        System.out.println("Star Ship fuel capacity: " + starShip.getFuelCapacity());
        System.out.println("Semi Cargo Capacity: " + semi.getCargoCapacity());

    }
}
