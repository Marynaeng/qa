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

public class SignInTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = ChromeDriverFactory.create();
        driver.get("https://blablawriting.com/sign-in");
    }
    @Test
    public void SignIn() throws Exception {
        WebElement SignUpLink = driver.findElement(By.xpath("//*[@id=\"loginform\"]/div[3]/i/a"));
        SignUpLink.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://blablawriting.com/packages?level=3");
    }
    @AfterTest
    public static void tearDown() throws Exception {
        driver.quit();
    }
}


