package com.yourcompany.selenium.yourclientprojectname;

import com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory.ChromeDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class RegistrationTest {


    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = ChromeDriverFactory.create();
//        ChromeDriver driver = new ChromeDriver();
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
       // driver = ChromeDriverFactory.create();
        driver.get("https://www.aresearchguide.com");
    }

    @Test
    public void registration() throws Exception {
        WebElement loginLink = driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/div[2]/span"));
        loginLink.click();
        WebElement signUp = driver.findElement(By.xpath("//*[@id=\"modal-login\"]/form/p[3]/a/span"));
        signUp.click();
        WebElement becomeMember = driver.findElement(By.xpath ("//*[@id=\"subscription1\"]/div[2]/a"));
        becomeMember.click();
        WebElement enterEmail = driver.findElement(By.xpath("//*[@id=\"bemail\"]"));
        enterEmail.sendKeys("test@test.com");
        WebElement enterPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        enterPassword.sendKeys("123456");
        WebElement paypalButton = driver.findElement(By.xpath("//*[@id=\"pmpro_form\"]/div[3]/div/button[2]/img"));
        paypalButton.click();
        URL currentUrl = new URL(driver.getCurrentUrl());

        Assert.assertEquals(currentUrl.getHost(), "www.paypal.com");

       // ChromeDriverFactory.takeScreenshot(driver, getClass().getName(), "test");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
}


