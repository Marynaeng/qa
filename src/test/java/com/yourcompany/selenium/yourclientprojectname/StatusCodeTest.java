package com.yourcompany.selenium.yourclientprojectname;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StatusCodeTest {

    @Test
    public void testEasy() {
//        driver.get("http://demo.guru99.com/test/guru99home/");
        String url = "https://google.com";
        int statusCode =  RestAssured.get(url).statusCode();
        Assert.assertEquals(200, statusCode);
    }
}
