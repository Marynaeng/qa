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

public class DownloadTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        driver = ChromeDriverFactory.create();
        driver.get("https://blablawriting.com/we-can-boast-diverse-research-essay-templates-essay");
    }
    @Test
    public void DownloadLink () throws Exception {
        WebElement DownloadEssay = driver.findElement(By.xpath("//*[@id=\"download_essay\"]"));
        DownloadEssay.click();
        WebElement BecomeAMember = driver.findElement(By.xpath("//*[@id=\"essay-modal\"]/div[2]/a"));
        BecomeAMember.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://blablawriting.com/packages?level=1");
    }
    @AfterTest
    public static void tearDown() throws Exception {
        driver.quit();
    }
}
