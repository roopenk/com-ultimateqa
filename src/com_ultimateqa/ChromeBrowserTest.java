package com_ultimateqa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        // Loading the Chrome browser driver
        WebDriver driver = new ChromeDriver();
        // Launching the browser window
        driver.get("https://courses.ultimateqa.com/users/sign_in");
        // Maximizing the browser window
        driver.manage().window().maximize();
        // Applying the implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        // Getting the page title
        System.out.println("The Page Title : " + driver.getTitle());
        // Getting the page URL
        System.out.println("The Page URL : " + driver.getCurrentUrl());
        // Getting the page source
        System.out.println("The Page Source : " + driver.getPageSource());
        // Locating the Email field and sending the value to it
        driver.findElement(By.id("user[email]")).sendKeys("Prime123@gmail.com");
        // Locating the password field and sending the value to it
        driver.findElement(By.id("user[password]")).sendKeys("Prime123");
        // Closing the browser window
        driver.close();
    }
}
