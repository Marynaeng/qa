package com.yourcompany.selenium.yourclientprojectname;

import com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory.ChromeDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;

public class LoginTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = ChromeDriverFactory.create();
        driver.get("https://www.aresearchguide.com");
    }

    @Test
    public void userLogin() throws Exception {
        Thread.sleep(10000);
        driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/div[2]/span")).click();

        driver.findElement(By.xpath("//*[@id=\"modal-login\"]/form/div[1]/input")).sendKeys("marina.hotinetskaya@boosta.co");
        driver.findElement(By.xpath("//*[@id=\"modal-login\"]/form/div[2]/input")).sendKeys("123456");

        driver.findElement(By.xpath("//*[@id=\"modal-login\"]/form/button")).click();

//        Wait<WebDriver> wait = new WebDriverWait(driver, 3, 1);
//        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/div[2]/span")),
//                "230015664"));
        Thread.sleep(10000);
        WebElement usernameElement = driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/div[2]/span"));
        Assert.assertEquals(usernameElement.getText(), "230015664");

//        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
//        FileUtils.copyFile(scrFile, new File("/Users/test/Downloads/WebDriver/loginTest.png"));


    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
