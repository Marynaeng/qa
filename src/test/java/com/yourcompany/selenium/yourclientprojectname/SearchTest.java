package com.yourcompany.selenium.yourclientprojectname;


import com.codeborne.selenide.Configuration;
import com.yourcompany.selenium.yourclientprojectname.Common.ChromeDriver.Factory.ChromeDriverFactory;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

import java.io.File;


public class SearchTest {

    private static WebDriver driver;

    @BeforeClass
    public static void setup() {
        Configuration.browser = "chrome";
        System.setProperty("selenide.browser", "chrome");
    }
    @Test
    public void search(){
        open ("https://www.aresearchguide.com");
        $(By.xpath("/html/body/main/div/div/div[2]/aside/div/form/input")).val("test").pressEnter();

        $(By.xpath("/html/body/main/div/div/div[1]/section/h1")).shouldHave(text("Search"));
    }

}
