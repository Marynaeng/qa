package com.yourcompany.selenium.yourclientprojectname.AresearchguideTestSuite;


import com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory.ChromeDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class DownloadTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = ChromeDriverFactory.create();
        driver.get("https://www.aresearchguide.com/theodore-roethkes-papas-waltz.html");
    }

    @Test
    public void downloadessay() throws Exception {
        WebElement downloadEssay = driver.findElement(By.xpath("/html/body/main/div/div/div[1]/section/div/div/article/div[1]/div[2]/div/a[2]"));
        downloadEssay.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.aresearchguide.com/levels.html");
        ChromeDriverFactory.takeScreenshot(driver, getClass().getName(), "test");
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
}

