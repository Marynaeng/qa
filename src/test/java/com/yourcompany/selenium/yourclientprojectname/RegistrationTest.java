package com.yourcompany.selenium.yourclientprojectname;

import com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory.ChromeDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;

public class RegistrationTest {


    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = ChromeDriverFactory.create();
        driver.get("https://www.aresearchguide.com");
    }

    @Test
    public void registration() throws Exception {
        WebElement membershipLibrary = driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/span"));
        membershipLibrary.click();
        WebElement becomeaMember = driver.findElement(By.xpath("//*[@id=\"subscription1\"]/div[2]/a"));
        becomeaMember.click();
        WebElement enterEmail = driver.findElement(By.xpath("//*[@id=\"bemail\"]"));
        enterEmail.sendKeys("test@test.com");
        WebElement enterPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        enterPassword.sendKeys("123456");
        WebElement paypalButton = driver.findElement(By.xpath("//*[@id=\"pmpro_form\"]/div[3]/div/button[2]/img"));
        paypalButton.click();
        URL currentUrl = new URL(driver.getCurrentUrl());

        Assert.assertEquals(currentUrl.getHost(), "www.paypal.com");


//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("/Users/test/Downloads/WebDriver/RegistrationRest.png"));

    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
}


