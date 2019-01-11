package com.yourcompany.selenium.yourclientprojectname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.net.MalformedURLException;
import java.net.URL;

public class NewTest {
    private WebDriver driver;
    @Test
    public void testEasy() {
//        driver.get("http://demo.guru99.com/test/guru99home/");
//        String title = driver.getTitle();
        Assert.assertTrue(true);
    }
    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        // driver = new RemoteWebDriver(new URL("http://82.144.204.41:4444/wd/hub"), DesiredCapabilities.chrome());

    }
    @AfterTest
    public void afterTest() {
        //driver.quit();
    }
}