package com.company.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

// This project is a demo from Udemy Course 'Selenium Webdriver Java: Learn from Scratch'
// by instructor Kiran Signh

// The purpose of this project is to demonstrate familiarity with Selenium Testing

public class MyFirstTest {

    public static void main(String[] args) {

        // 1. set properties of chrome driver (key and value)
            // value is the location of the chromedriver
        System.setProperty("webdriver.chrome.driver",
                "/Users/gmamenis/MyWork/PerScholas/dev/SeleniumDemo/SeleniumDemo/src/drivers/chromedriver");
        // 6. Headless Mode Testing (testing without browser UI or GUI)
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setHeadless(true);
        // 2. new driver instance
            // initially, you don't need to pass any arguments to driver
            // however, you must pass chromeoptions in order to achieve headless mode
        WebDriver driver = new ChromeDriver(chromeOptions);
        // 3. this is the app we will test
            // this creates an instance of the webpage below in a google chrome browser
        driver.get("https://opensource-demo.orangehrmlive.com/");
        // 4. this maximizes the browser window
        driver.manage().window().maximize();
        // 5. this retrieves the title of the web page
        System.out.println("Web Page Title: " + driver.getTitle());

    }
}
