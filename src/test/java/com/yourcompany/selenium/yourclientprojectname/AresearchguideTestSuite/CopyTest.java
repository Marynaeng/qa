package com.yourcompany.selenium.yourclientprojectname.AresearchguideTestSuite;

import com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory.ChromeDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Date;
import java.util.Random;


public class CopyTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = ChromeDriverFactory.create();
        driver.get("https://www.aresearchguide.com/reasons-children-learn-foreign-language.html");
    }

    @Test
    public void copy() throws Exception {
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/aside/div/form/input"))
                .sendKeys(Keys.chord(Keys.CONTROL, Keys.INSERT)); //#copy only for mac
        Thread.sleep(1000);
        Random random = new Random();
        String email = random.nextInt() + "@gmail.com";
        driver.findElement(By.id("emailPopup")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"popapEmail\"]/button")).click();
        Thread.sleep(1000);

        Assert.assertTrue(driver.findElements(By.id("modal2")).size() > 0);
        Thread.sleep(1000);
        ChromeDriverFactory.takeScreenshot(driver, getClass().getName(), "test");
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}