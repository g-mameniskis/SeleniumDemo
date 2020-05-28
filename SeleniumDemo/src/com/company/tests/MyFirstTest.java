package com.company.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

// This project is a demo from Udemy Course 'Selenium Webdriver Java: Learn from Scratch'
// by instructor Kiran Signh

// The purpose of this project is to demonstrate familiarity with Selenium Testing

public class MyFirstTest {

    public static void main(String[] args) {

        // 1. set properties of chrome driver (key and value)
        System.setProperty("webdriver.chrome.driver",
                "/Users/gmamenis/MyWork/PerScholas/dev/SeleniumDemo/SeleniumDemo/src/drivers/chromedriver");
        // 2. new driver instance
        WebDriver driver = new ChromeDriver();
        // 3. this is the app we will test
        driver.get("https://opensource-demo.orangehrmlive.com/");

    }
}
