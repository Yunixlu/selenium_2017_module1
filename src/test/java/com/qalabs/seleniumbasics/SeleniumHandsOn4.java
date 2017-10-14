package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn4 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "chrome";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.amazon.com.mx/");


        //Imprimir URL.
        System.out.println(myDriver.getCurrentUrl());

        // Wait some seconds
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


        WebElement textboxsearch = myDriver.findElement(By.id("twotabsearchtextbox"));
        textboxsearch.sendKeys("Selenium", Keys.ENTER);
        myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);



        // Quit web driver
        myDriver.quit();
    }

}
