package com.testautomation.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

    public static WebDriver driver;
    public static Properties prop;

    public Base(){

        prop = new Properties();

        try {
            FileInputStream ip = new FileInputStream("/Users/jmishra/Desktop/automation-framework/uiautomationframework/src/main/java/com/testautomation/config/config.properties");
            prop.load(ip);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public static WebDriver initialize_driver() {
        // String browser = "chrome";
         String browser = prop.getProperty("browser");



        if (browser.equalsIgnoreCase("chrome")) {

            ChromeOptions opt = new ChromeOptions();
            opt.setExperimentalOption("w3c", true);

            System.setProperty("webdriver.chrome.driver", "Resources/chromedriver_new");

                driver = new ChromeDriver(opt);
        }

         else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
            driver = new FirefoxDriver();

        }

        driver.manage().window().fullscreen();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));

        return driver;
    }



    public static void quitBrowser() {
        try {
            driver.quit();
        } catch (Exception e) {
            System.out.println("Couldn't close browser gracefully");
        }
    }

    public static void closeBrowser() {
        try {
            driver.close();
        } catch (Exception e) {
            System.out.println("some exception occurred while closing the browser");
        }
    }
}
