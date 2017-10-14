package com.qalabs.seleniumbasics;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn6 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";

        // Get correct driver for desire browser
        WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://www.wikipedia.org/");


        //Imprimir URL
        System.out.println(myDriver.getCurrentUrl());

        // Wait some seconds
        Thread.sleep(10000);

        WebElement textboxSearch = myDriver.findElement(By.id("searchInput"));
        textboxSearch.sendKeys("Selenium", Keys.ENTER);
        Thread.sleep(10000);
        //myDriver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);


        myDriver.navigate().equals("Selenium");


        // Quit web driver
        myDriver.quit();
    }


}
