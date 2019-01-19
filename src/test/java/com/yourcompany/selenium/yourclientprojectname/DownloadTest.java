package com.yourcompany.selenium.yourclientprojectname;


import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;
import java.net.URL;
import java.util.concurrent.TimeUnit;


public class DownloadTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        System.setProperty("webdriver.chrome.driver", "/Users/test/Downloads/WebDriver/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.aresearchguide.com/theodore-roethkes-papas-waltz.html");
    }
    @Test
    public void downloadessay() throws Exception{
        WebElement downloadEssay=driver.findElement(By.xpath("/html/body/main/div/div/div[1]/section/div/div/article/div[1]/div[2]/div/a[2]"));
        downloadEssay.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.aresearchguide.com/levels.html");

        File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/test/Downloads/WebDriver/DownloadTest.png"));
    }
    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
}

