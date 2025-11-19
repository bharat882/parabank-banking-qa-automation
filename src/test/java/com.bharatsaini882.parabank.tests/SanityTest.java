package com.bharatsaini882.parabank.tests;

import com.bharatsaini882.parabank.core.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SanityTest extends BaseTest {

    @Test
    public void openParaBankHomePage(){
        driver.get(baseUrl);
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);
        Assert.assertTrue(title.toLowerCase().contains("parabank"), "Expected page title to contain 'ParaBank'");
    }


}