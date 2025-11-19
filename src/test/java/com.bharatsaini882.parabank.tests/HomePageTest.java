package com.bharatsaini882.parabank.tests;

import com.bharatsaini882.parabank.core.BaseTest;
import com.bharatsaini882.parabank.pages.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {

    @Test(groups= {"ui","smoke"})
    public void homePageShouldShowCustomerLoginSection(){
        driver.get(baseUrl);

        HomePage homePage = new HomePage(driver);

        boolean visible = homePage.isCustomerLoginVisible();
        Assert.assertTrue(visible,"Expected 'Customer Login' section to be visible to the home page.");

        String title = homePage.getTitle();
        Assert.assertTrue(title.toLowerCase().contains("parabank"),"Expected page title to contain 'parabank'.");
    }

}
