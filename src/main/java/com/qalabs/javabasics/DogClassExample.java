package com.qalabs.javabasics;
class Dog {
    private String name;
    private int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return String.format("%s has %d years", this.name, this.age);
    }

    public int ageToDogYear(){
        int convertir;
        convertir=age*7;
        return convertir;



    }
}




public class DogClassExample {

    public static void main (String[] args) {
        Dog myDog = new Dog("MyDog", 4);
        System.out.println(myDog.toString());
        System.out.print("La edad del perro en años humano es  " + myDog.ageToDogYear());
       // myDog.ageToDogYear(System.out.println ("La edad del perro a edad humana es:"+ convertir));
    }
}
