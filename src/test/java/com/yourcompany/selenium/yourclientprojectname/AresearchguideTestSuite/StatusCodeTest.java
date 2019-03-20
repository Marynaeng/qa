package com.yourcompany.selenium.yourclientprojectname.AresearchguideTestSuite;

import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StatusCodeTest {

    @Test
    public void testEasy() {
        Assert.assertEquals(RestAssured.get("https://www.aresearchguide.com/").statusCode(), 200);
    }
}
