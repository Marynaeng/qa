package com.yourcompany.selenium.yourclientprojectname.BlablaTestSuiteRegistration;
import io.restassured.RestAssured;
import org.testng.Assert;
import org.testng.annotations.Test;

public class StatusCode200Test {
    @Test
    public void test200() {
        Assert.assertEquals(RestAssured.get("https://blablawriting.com/").statusCode(), 200);
    }
}


