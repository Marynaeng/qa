package com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class ChromeDriverFactory {


    public static WebDriver create() {
        WebDriver driver = null;
        try {
//            driver = createLocal();
            driver = createRemote();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        driver.manage().window().maximize();
        driver.manage().window().setSize(new Dimension(1920, 1080));
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        return driver;
    }


    private static WebDriver createLocal() {
        //System.setProperty("webdriver.chrome.driver", "C:\\TESTING_AVTOM\\chromedriver.exe");
       System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");

   // private static ChromeDriver createLocal() {
       // System.setProperty("webdriver.chrome.driver", System.getProperty("driver.path"));
       // ""

        return new ChromeDriver();
    }

    private static WebDriver createRemote() throws MalformedURLException {
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
        capabilities.setCapability(CapabilityType.SUPPORTS_JAVASCRIPT, true);
//        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
        return new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), capabilities);

    }

    public static void takeScreenshot(WebDriver driver, String className, String method) {
        if (driver instanceof TakesScreenshot) {
            TakesScreenshot screenshotTakingDriver = (TakesScreenshot) driver;
            try {
                File localScreenshots = new File(new File("target"), "screenshots");
                if (!localScreenshots.exists() || !localScreenshots.isDirectory()) {
                    localScreenshots.mkdirs();
                }
                Date date = new Date();
                File screenshot = new File(localScreenshots, className + "_" + method + "_" + date.getHours() + "." + date.getMinutes() + ".png");
                FileUtils.moveFile(screenshotTakingDriver.getScreenshotAs(OutputType.FILE), screenshot);
//                logger.info("Screenshot for class={} method={} saved in: {}", className, method, screenshot.getAbsolutePath());
            } catch (Exception e1) {
//                logger.error("Unable to take screenshot", e1);
            }
        } else {
//            logger.info("Driver '{}' can't take screenshots so skipping it.", driver.getClass());
        }
    }
}
