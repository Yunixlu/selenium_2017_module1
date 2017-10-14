package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class SeleniumHandsOn3 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://es-la.facebook.com/");


        //Imprimir URL
        System.out.println(myDriver.getCurrentUrl());

        // Wait some seconds
        Thread.sleep(5000);

        WebElement textboxemail = myDriver.findElement(By.id("email"));
        Actions builder = new Actions(myDriver);
        Actions seriesOfActions = builder.moveToElement(textboxemail).click().sendKeys(textboxemail, "ytester.2120@gmail.com");
        seriesOfActions.perform();
        Thread.sleep(2000);

        WebElement textboxpass = myDriver.findElement(By.id("pass"));
        Actions builder1 = new Actions(myDriver);
        Actions seriesOfActions1 = builder.moveToElement(textboxpass).click().sendKeys(textboxpass, "S3l3n1um!_");
        seriesOfActions.perform();
        Thread.sleep(2000);


        WebElement myElementBoton = myDriver.findElement(By.id("loginbutton"));
        myElementBoton.click();
        Thread.sleep(5000);


        // Quit web driver
        myDriver.quit();
    }


}
