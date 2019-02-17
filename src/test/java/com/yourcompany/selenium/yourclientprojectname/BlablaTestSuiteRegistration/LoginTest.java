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

import javax.swing.*;
import java.net.URL;

public class LoginTest {

    private static WebDriver driver;

    @BeforeClass
   public static void setup() {
       driver = ChromeDriverFactory.create();
       driver.get("https://blablawriting.com/reflective-journal-writing-skills-essay");
    }
    @Test
    public void


   }

   @AfterTest
    public static void tearDown() throws Exception {
       driver.quit();

   }
}


