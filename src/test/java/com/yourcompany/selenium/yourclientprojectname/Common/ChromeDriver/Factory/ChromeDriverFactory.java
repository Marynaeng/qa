package com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverFactory {


    public static ChromeDriver create() {
        ChromeDriver driver = createLocalMac();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return driver;
    }

    private static ChromeDriver createLocalMac() {
        System.setProperty("webdriver.chrome.driver", "/Users/test/Downloads/WebDriver/chromedriver");
        return new ChromeDriver();
    }

    public static ChromeDriver createRemote(){
//        ChromeOptions chromeOptions = new ChromeOptions();
//        chromeOptions.addArguments("--disable-notifications");
//        chromeOptions.addArguments("--disable-gpu");
//        chromeOptions.addArguments("--no-sandbox");
//        new DesiredCapabilities();
//        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
//        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
//        capabilities.setBrowserName("chrome");
//        capabilities.setPlatform(Platform.LINUX);
//        capabilities.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
////        capabilities.setCapability(CapabilityType.ACCEPT_INSECURE_CERTS, true);
//        driver = new RemoteWebDriver(new URL("http://192.168.0.120:4444/wd/hub"), capabilities);120


        System.setProperty("webdriver.chrome.driver", "/Users/test/Downloads/WebDriver/chromedriver");
        return new ChromeDriver();
    }
}
