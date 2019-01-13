package com.yourcompany.selenium.yourclientprojectname;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class RegistrationTest {


    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/test/Downloads/WebDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.aresearchguide.com");
    }
    @Test
    public void registration() throws Exception {
        WebElement membershipLibrary= driver.findElement(By.xpath("/html/body/header/div/div/div[1]/div/div/span"));
        membershipLibrary.click();
        WebElement becomeaMember= driver.findElement(By.xpath("//*[@id=\"subscription1\"]/div[2]/a"));
        becomeaMember.click();
        WebElement enterEmail=driver.findElement(By.xpath("//*[@id=\"bemail\"]"));
        enterEmail.sendKeys("test@test.com");
        WebElement enterPassword= driver.findElement(By.xpath("//*[@id=\"password\"]"));
        enterPassword.sendKeys("123456");
        WebElement paypalButton= driver.findElement(By.xpath("//*[@id=\"pmpro_form\"]/div[3]/div/button[2]/img"));
        paypalButton.click();
        URL currentUrl = new URL(driver.getCurrentUrl());

        Assert.assertEquals(currentUrl.getHost(), "www.paypal.com");

    }
    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
}
    }


