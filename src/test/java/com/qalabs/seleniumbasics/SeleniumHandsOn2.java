package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.WebDriver;

public class SeleniumHandsOn2 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.google.com.mx");


        //Imprimir URL
        System.out.println(myDriver.getCurrentUrl());

        // Wait some seconds
        Thread.sleep(5000);

        WebElement myElement = myDriver.findElement(By.id("lst-ib"));

        Actions builder = new Actions(myDriver);

        Actions seriesOfActions = builder.moveToElement(myElement).click().sendKeys(myElement, "Unocero");
        seriesOfActions.perform();
        Thread.sleep(5000);


        WebElement myElementBoton = myDriver.findElement(By.name("btnK"));
        myElementBoton.submit();
       // myElementBoton.click();
        Thread.sleep(5000);

        // Quit web driver
        myDriver.quit();
    }
}
