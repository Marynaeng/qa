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

public class PricingLevelTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = ChromeDriverFactory.create();
        driver.get("https://blablawriting.com/");
    }

    @Test
    public void Pricing() throws Exception {
        WebElement PricingMenu = driver.findElement(By.xpath("/html/body/header/div[1]/div/div[2]/nav/div/ul/li[5]/a"));
        PricingMenu.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://blablawriting.com/packages?level=1");

    }

    @AfterTest
    public static void tearDown() throws Exception {
        driver.quit();

    }
}

