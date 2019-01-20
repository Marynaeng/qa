package com.yourcompany.selenium.yourclientprojectname;

import com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory.ChromeDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;


public class LoginNotexistentUserTest {


    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = ChromeDriverFactory.create();
        driver.get("https://www.aresearchguide.com");
    }

    @Test
    public void lognotregistration() throws Exception {
        WebElement loginButton = driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/div[2]/span"));
        loginButton.click();
        WebElement loginField = driver.findElement(By.xpath("//*[@id=\"modal-login\"]/form/div[1]/input"));
        loginField.sendKeys("test@prod.com");
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"modal-login\"]/form/div[2]/input"));
        passwordField.sendKeys("123456");
        WebElement logButton = driver.findElement(By.xpath("//*[@id=\"modal-login\"]/form/button"));
        logButton.click();
        Wait<WebDriver> wait = new WebDriverWait(driver, 2, 0);
        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("//*[@id=\"modal-login\"]/form/p[2]")),
                "ERROR: Invalid email address. Lost your password?"));
//Thread.sleep(1000);
        WebElement error = driver.findElement(By.xpath("//*[@id=\"modal-login\"]/form/p[2]"));
        Assert.assertEquals(error.getText(), "ERROR: Invalid email address. Lost your password?");

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
// Now you can do whatever you need to do with it, for example copy somewhere
        FileUtils.copyFile(scrFile, new File("/Users/test/Downloads/WebDriver/loginNot.png"));
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
}
