package com.qalabs.seleniumbasics;

import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;

public class SeleniumExercises2Chrome {
    public static void main(String[]args) throws InterruptedException{
        //Define la ubicación del  firefox driver
        File chromeFilePath = new File("src/test/resources/lib-thirdparty/driversforwin/chromedriver.exe");

        // Indica donde buscar el driver para ejecutarlo
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //Crear una nueva instancia de Firefox Driver
        WebDriver myDriver1 = new ChromeDriver();

        //Abrir google
        myDriver1.get("https://www.google.com/");

        Thread.sleep(5000);

        //Imprimir título de pagina
        System.out.println(myDriver1.getTitle());

        //Imrpirmir URL
        System.out.println(myDriver1.getCurrentUrl());

        //Imprimir Source Code
        System.out.println(myDriver1.getPageSource());

        //Cerrar firefox
        myDriver1.close();


    }
}

