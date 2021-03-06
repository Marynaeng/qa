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

public class LoginTest {

    private static WebDriver driver;

    @BeforeClass
   public static void setup() {
       driver = ChromeDriverFactory.create();
       driver.get("https://blablawriting.com/");
    }
    @Test
    public void Login() throws Exception {
        WebElement LoginLink=driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/div/nav/a"));
        LoginLink.click();
        WebElement EmailInput=driver.findElement(By.xpath("//*[@id=\"user_login\"]"));
        EmailInput.sendKeys("marina.hotinetskaya@boosta.co");
        WebElement PasswordInput=driver.findElement(By.xpath("//*[@id=\"user_pass\"]"));
        PasswordInput.sendKeys("123456");
        WebElement SignINButton = driver.findElement(By.xpath("//*[@id=\"wp-submit\"]"));
        SignINButton.click();
        WebElement Username=driver.findElement(By.xpath("/html/body/header/div[1]/div/div[3]/div/nav/div/span"));
        Assert.assertEquals(Username.getText(),"marina.hotinetskaya@boosta.co");

   }

   @AfterTest
    public static void tearDown() throws Exception {
       driver.quit();

   }
}


