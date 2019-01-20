package com.yourcompany.selenium.yourclientprojectname;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Random;
import java.util.concurrent.TimeUnit;


public class CopyTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/test/Downloads/WebDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.aresearchguide.com/reasons-children-learn-foreign-language.html");
    }

    @Test
    public void copy() throws Exception {
        driver.findElement(By.xpath("/html/body/main/div/div/div[2]/aside/div/form/input"))
                .sendKeys(Keys.chord(Keys.CONTROL, Keys.INSERT)); //#copy only for mac
        Thread.sleep(1000);
        Random random = new Random();
//        String i = String.valueOf(random.nextInt());
        String email = random.nextInt() + "@gmail.com";
        driver.findElement(By.id("emailPopup")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"popapEmail\"]/button")).click();
        Thread.sleep(1000);

        Assert.assertTrue(driver.findElements(By.id("modal2")).size() > 0);
        Thread.sleep(1000);

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/test/Downloads/WebDriver/Copy test.png"));
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}