package com.qalabs.seleniumbasics;

import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class SeleniumExercises1 {

    public static void main(String[]args) throws InterruptedException{
        //Define la ubicación del  firefox driver
        File firefoxFilePath = new File("src/test/resources/lib-thirdparty/driversforwin/geckodriver.exe");

         // Indica donde buscar el driver para ejecutarlo
        System.setProperty("webdriver.gecko.driver", firefoxFilePath.getPath());

        //Crear una nueva instancia de Firefox Driver
        WebDriver myDriver1 = new FirefoxDriver();

        //Abrir google
        myDriver1.get("https://www.google.com/");
        Thread.sleep(5000);

        myDriver1.close();


    }



}
