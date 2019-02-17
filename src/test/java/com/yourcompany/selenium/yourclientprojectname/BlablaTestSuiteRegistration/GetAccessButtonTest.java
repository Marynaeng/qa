package com.yourcompany.selenium.yourclientprojectname.BlablaTestSuiteRegistration;
import com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory.ChromeDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.URL;

public class GetAccessButtonTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = ChromeDriverFactory.create();
        driver.get("https://blablawriting.com/peculiarities-of-various-assignment-types-essay");
    }

    @Test
    public void Pricing() throws Exception {
        WebElement GetElementButton = driver.findElement(By.xpath("/html/body/main/article/div[1]/div/div[1]/div[1]/div[2]/a"));
        GetElementButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://blablawriting.com/packages?level=3");
    }

    @AfterTest
    public static void tearDown() throws Exception {
        driver.quit();
    }
}