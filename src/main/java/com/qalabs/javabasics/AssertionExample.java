package com.qalabs.javabasics;


public class AssertionExample {
    public static void main (String[] args) {
        int age = 47;
        String  idioma1="hola";
        String idioma2="hello";


        assert age >= 18;
       //assert  1 > 5: "Un minuto no menos 5 minutos";


        //assert idioma1.equals(idioma2):"No es el mismo idioma";

        assert idioma1.equals(age):"No es el mismo tipo de dato";

        assert age>=18 && age<30: "Estas en la flor de la juventud";


    }
}



