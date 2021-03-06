package com.yourcompany.selenium.yourclientprojectname.AresearchguideTestSuite;

import com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory.ChromeDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class LoginTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = ChromeDriverFactory.create();
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

        ChromeDriverFactory.takeScreenshot(driver, getClass().getName(), "test");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}
