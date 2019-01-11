package com.yourcompany.selenium.yourclientprojectname;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.CapabilityType;
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
        Assert.assertEquals(title, "Demo Guru99 Page");
    }
    @BeforeTest
    public void beforeTest() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        new DesiredCapabilities();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        capabilities.setBrowserName("chrome");
        capabilities.setPlatform(Platform.LINUX);
        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
//        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        driver = new RemoteWebDriver(new URL("http://192.168.0.120:4444/wd/hub"), capabilities);
//        WebDriverRunner.setWebDriver(driver);
//         driver = new RemoteWebDriver(new URL("http://192.168.0.103:4444/wd/hub"), DesiredCapabilities.chrome());

    }
    @AfterTest
    public void afterTest() {
        driver.quit();
    }
}