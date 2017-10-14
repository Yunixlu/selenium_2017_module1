package com.qalabs.javabasics;

interface Vehicle {
    void speedUp();
    void printSpec();
}

class Tank implements Vehicle {
    private int speed;

    Tank() {
        this.speed = 0;
    }
    public void speedUp() {
        this.speed += 1;
        System.out.println(String.format("Tank New speed %s", this.speed));
    }

    public void printSpec() {
        System.out.println("Print de tank");
    }
}

class Truck implements  Vehicle{
    private int speed;
    Truck(){
        this.speed=0;
    }

    public void speedUp() {
        this.speed += 2;
        System.out.println(String.format("Truck New speed %s", this.speed));
    }

    public void printSpec() {
        System.out.println("Print de Truck");
    }
}





public class InterfaceExample {
    public static void main (String[] args) {
        Vehicle myVehicle = new Tank();
        myVehicle.speedUp();
        myVehicle.printSpec();
        Vehicle myVehicle1 = new Truck();
        myVehicle1.speedUp();
        myVehicle1.printSpec();

    }
}
