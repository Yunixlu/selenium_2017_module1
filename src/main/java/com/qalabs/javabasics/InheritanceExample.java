package com.qalabs.javabasics;


class Bike {
   private String brand;
    private int speed;

    //El constructor inicializa el objeto con las variables
    Bike(String brand) {
        this.brand = brand;
        this.speed = 0;
    }

    void speedUp() {
        this.speed += 1;
        //Formatear el string(String.format
        System.out.println(String.format("%s speed %d", this.brand, this.speed));
    }

    public String getBrand(){
        return  this.brand;
    }
    public int getSpeed(){
        return this.speed;
    }
    public void setBrand(String brand){
         this.brand = brand;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}

class MountainBike extends Bike {
    private int seatHeight;

    MountainBike(String brand) {
        // manda llamar lo de brand del constructor porque es la unica manera de mandarlos llamar
        super(brand);
        this.seatHeight = 0;
    }

    public void setSeatHeight(int newHeight) {
        this.seatHeight = newHeight;
    }


}


class RoadBike extends Bike{

    RoadBike(String brand) {
        super(brand);
    }

    @Override
    void speedUp() {
        this.setSpeed(this.getSpeed()+3);
        System.out.println(String.format("%s speed %d", this.getBrand(), this.getSpeed()));

    }

    /*Esto es para las variables protected la de Brand y Speed

    @Override
    void speedUp() {
       // super.speedUp();

        this.speed += 2;
        //Formatear el string(String.format
        System.out.println(String.format("%s speed %d", this.brand, this.speed));
    }*/
}


public class InheritanceExample {
    public static void main (String[] args) {
        // Hold bike instance into bike variable
        Bike bike = new Bike("bike");
        bike.speedUp();

        // Hold mountain bike instance into same bike variable, no problem
        bike = new MountainBike("mountain bike");
        bike.speedUp();
        bike = new RoadBike("Road Bike");
        bike.speedUp();
    }
}
