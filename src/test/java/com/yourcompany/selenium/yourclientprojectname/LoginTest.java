package com.yourcompany.selenium.yourclientprojectname;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/test/Downloads/WebDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.aresearchguide.com");
    }

    @Test
    public void userLogin() throws Exception {
        driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/div[2]/span")).click();

        driver.findElement(By.xpath("//*[@id=\"modal-login\"]/form/div[1]/input")).sendKeys("marina.hotinetskaya@boosta.co");
        driver.findElement(By.xpath("//*[@id=\"modal-login\"]/form/div[2]/input")).sendKeys("123456");

        driver.findElement(By.xpath("//*[@id=\"modal-login\"]/form/button")).click();

//        Wait<WebDriver> wait = new WebDriverWait(driver, 3, 1);
//        wait.until(ExpectedConditions.textToBePresentInElement(driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/div[2]/span")),
//                "230015664"));
        Thread.sleep(2000);
        WebElement usernameElement = driver.findElement(By.xpath("/html/body/header/div/div/div[3]/div/div[2]/span"));
        Assert.assertEquals(usernameElement.getText(), "230015664");

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/test/Downloads/WebDriver/loginTest.png"));


    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
