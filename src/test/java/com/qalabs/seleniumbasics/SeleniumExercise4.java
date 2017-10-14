package com.qalabs.seleniumbasics;
import org.openqa.selenium.By;
import  org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.File;
import java.util.List;

public class SeleniumExercise4 {
    public static void main(String[] args) throws InterruptedException {
        //Define la ubicación del  firefox driver
        File chromeFilePath = new File("src/test/resources/lib-thirdparty/driversforwin/chromedriver.exe");

        // Indica donde buscar el driver para ejecutarlo
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());

        //Crear una nueva instancia de Firefox Driver
        WebDriver myDriver1 = new ChromeDriver();

        //Abrir youtube
        myDriver1.get("https://www.youtube.com/?hl=es");
        myDriver1.getCurrentUrl();

        //Buscar bar element
        WebElement myElement = myDriver1.findElement(By.id("search-container"));
       myElement.isDisplayed();
       myElement.isEnabled();

       myElement.sendKeys("selenium");
     // WebElement myElement2= myDriver1.findElement(By.id(search-icon-legacy));







        myDriver1.close();


    }
}