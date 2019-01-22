package com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory;

import org.openqa.selenium.Platform;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class ChromeDriverFactory {


    public static WebDriver create() {
        WebDriver driver = null;
        try {
            driver = createRemote();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        return driver;
    }

    private static WebDriver createLocalMac() {
        System.setProperty("webdriver.chrome.driver", "/Users/test/Downloads/WebDriver/chromedriver");
        return new ChromeDriver();
    }

    public static WebDriver createRemote() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--disable-notifications");
//        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--no-sandbox");
        new DesiredCapabilities();
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//        capabilities.setBrowserName("chrome");
//        capabilities.setPlatform(Platform.LINUX);
//        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
//        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
       return new RemoteWebDriver(new URL("http://82.144.204.41:4444/wd/hub"), capabilities);

    }
}
