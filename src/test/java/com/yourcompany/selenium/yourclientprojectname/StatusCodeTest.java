package com.yourcompany.selenium.yourclientprojectname;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StatusCodeTest {

    @Test
    public void testEasy() {
        Assert.assertEquals(RestAssured.get("https://google.com").statusCode(), 200);
        Assert.assertEquals(RestAssured.get("https://google.com/asdasdadadasd").statusCode(), 404);
    }
}
