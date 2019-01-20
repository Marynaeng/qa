package com.yourcompany.selenium.yourclientprojectname;

import com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory.ChromeDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.File;


public class PrintTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = ChromeDriverFactory.create();
        driver.get("https://www.aresearchguide.com/theodore-roethkes-papas-waltz.html");
    }

    @Test
    public void printessay() throws Exception {
        WebElement printEssay = driver.findElement(By.xpath("/html/body/main/div/div/div[1]/section/div/div/article/div[1]/div[2]/div/a[1]"));
        printEssay.click();

        Assert.assertEquals(driver.getCurrentUrl(), "https://www.aresearchguide.com/levels.html");

        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("/Users/test/Downloads/WebDriver/PrintTest.png"));
    }

    @AfterClass
    public static void tearDown() throws Exception {
        driver.quit();
    }
}
