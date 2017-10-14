package com.qalabs.seleniumbasics;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;


public class SeleniumExercises3 {
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
        //Imrpirmir URL
        System.out.println(myDriver1.getCurrentUrl());

        //Ir a Facebook
        myDriver1.navigate().to("https://www.facebook.com/");
        Thread.sleep(5000);
        System.out.println(myDriver1.getCurrentUrl());

        //Ir a ESPN
        myDriver1.navigate().to("http://espndeportes.espn.com/");
        Thread.sleep(5000);
        System.out.println(myDriver1.getCurrentUrl());

        //regresar dos veces, estar en google de nuevo
        myDriver1.navigate().back();
        Thread.sleep(5000);
        myDriver1.navigate().back();
        Thread.sleep(5000);
        System.out.println(myDriver1.getCurrentUrl());

        //Avanzar una e ir a Facebook
        myDriver1.navigate().forward();
        Thread.sleep(5000);
        System.out.println(myDriver1.getCurrentUrl());

        //Actualizar
        myDriver1.navigate().refresh();
        Thread.sleep(5000);
        System.out.println(myDriver1.getCurrentUrl());



        myDriver1.close();



    }
}
