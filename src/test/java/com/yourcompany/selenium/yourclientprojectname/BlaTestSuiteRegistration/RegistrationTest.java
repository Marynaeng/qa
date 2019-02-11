package com.yourcompany.selenium.yourclientprojectname.BlaTestSuiteRegistration;
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
        driver.get("https://blablawriting.com/");
    }

    @Test
    public void registration() throws Exception {
        WebElement BecomeaMemberButton = driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/div/a"));
        BecomeaMemberButton.click();
        WebElement BecomeMemberLevel1 = driver.findElement(By.xpath("//*[@id=\"subscription1\"]/div[4]/a"));
        BecomeMemberLevel1.click();
        WebElement EmailInput = driver.findElement(By.xpath("//*[@id=\"bemail\"]"));
        EmailInput.sendKeys("test@boosta.com");
        WebElement PasswordInput = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        PasswordInput.sendKeys("123456");
        WebElement PayPalButton = driver.findElement(By.xpath("//*[@id=\"pmpro_form\"]/div[3]/div[1]/button/img"));
        PayPalButton.click();
        URL currentUrl = new URL(driver.getCurrentUrl());

        Assert.assertEquals(currentUrl.getHost(), "www.paypal.com");


        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/test/Downloads/WebDriver/RegistrationRest.png"));

    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();

    }
}



