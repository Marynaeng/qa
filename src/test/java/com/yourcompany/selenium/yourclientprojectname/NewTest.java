package com.yourcompany.selenium.yourclientprojectname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
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
        driver.get("http://demo.guru99.com/test/guru99home/");
        String title = driver.getTitle();
        Assert.assertTrue(title.contains("Demo Guru99 Page"));
    }
    @BeforeTest
    public void beforeTest() throws MalformedURLException {
//        driver = new ChromeDriver();

        ChromeOptions options = new ChromeOptions();
//        options.setExperimentalOption("useAutomationExtension", false);
         driver = new ChromeDriver(options);
//
//        return;


        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();

//         driver = new RemoteWebDriver(new URL("192.168.120:4441/wd/hub",);
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized"); // open Browser in maximized mode
//        options.addArguments("disable-infobars"); // disabling infobars
//        options.addArguments("--disable-extensions"); // disabling extensions
//        options.addArguments("--disable-gpu"); // applicable to windows os only
//        options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
//        options.addArguments("--no-sandbox"); // Bypass OS security model
//
//         driver = new RemoteWebDriver(new URL("http://192.168.120:4441/wd/hub"), DesiredCapabilities.chrome());
    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}