package com.qalabs.seleniumbasics;

import org.apache.xpath.XPath;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class SeleniumHandsOn5 {
    public static void main(String[] args) throws InterruptedException, NullPointerException {
        // Define which browser to use
        String browser = "firefox";

        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("--disable-notifications");

        File chromeFilePath = new File("src/test/resources/lib-thirdparty/driversforwin/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeFilePath.getPath());
        WebDriver myDriver = new ChromeDriver(options);

        // Get correct driver for desire browser
        //WebDriver myDriver = WebDriverFactory.getDriver(browser);

        // Get google home page
        myDriver.get("https://es-la.facebook.com/");


        //Imprimir URL
        System.out.println(myDriver.getCurrentUrl());

        // Wait some seconds
        Thread.sleep(5000);

        //escribir correo
        WebElement textboxemail = myDriver.findElement(By.id("email"));
        Actions builder = new Actions(myDriver);
        Actions seriesOfActions = builder.moveToElement(textboxemail).click().sendKeys(textboxemail, "ytester.2120@gmail.com");
        seriesOfActions.perform();
        Thread.sleep(2000);

        //escribir contraseña
        WebElement textboxpass = myDriver.findElement(By.id("pass"));
        Actions builder1 = new Actions(myDriver);
        Actions seriesOfActions1 = builder.moveToElement(textboxpass).click().sendKeys(textboxpass, "S3l3n1um!_");
        seriesOfActions.perform();

        //Presionar botón de login
        WebElement myElementBoton = myDriver.findElement(By.id("loginbutton"));
        myElementBoton.click();
        Thread.sleep(15000);
        //myDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        //Buscar QA minds
        WebElement textboxsearch = myDriver.findElement(By.name("q"));
        textboxsearch.sendKeys("QA minds Lab", Keys.ENTER);
        myDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        WebElement group = myDriver.findElement(By.xpath("//div[text() ='QA Minds Lab']"));
        group.click();
        Thread.sleep(15000);
       // myDriver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);

        //Escribir un mensaje para publicar
        WebElement escribir = myDriver.findElement(By.xpath("//*[@name='xhpc_message_text']"));
        escribir.sendKeys("Hola desde Selenium1");
        Thread.sleep(10000);

        //Publicar mensaje y presionar botón
        WebElement botonPublicar = myDriver.findElement(By.xpath("//button[@data-testid='react-composer-post-button']"));
        botonPublicar.click();
        Thread.sleep(10000);

        // Quit web driver
        myDriver.quit();
    }

}
