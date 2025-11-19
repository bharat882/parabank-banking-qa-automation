package com.bharatsaini882.parabank.tests;

import com.bharatsaini882.parabank.core.BaseTest;
import com.bharatsaini882.parabank.pages.HomePage;
import com.bharatsaini882.parabank.pages.RegisterPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.UUID;

public class RegisterPageTest extends BaseTest {

    @Test(groups = {"ui", "regression"})
    public void userShouldBeAbleToRegisterSuccessfully(){

        driver.get(baseUrl);

        HomePage homePage = new HomePage(driver);
        homePage.clickRegister();

        RegisterPage registerPage = new RegisterPage(driver);

        String uniqueUsername = "user_" + UUID.randomUUID().toString().substring(0, 8);
        String password = "Password123!";

        registerPage.registerNewUser(
                "Bharat",
                "Saini",
                "123 QA Street",
                "Toronto",
                "ON",
                "M1M1M1",
                "1234567890",
                "999-99-9999",
                uniqueUsername,
                password
        );

        Assert.assertTrue(registerPage.isWelcomePageDisplayed(),"Expected welcome message to be displayed after successful registration.");

        String title = registerPage.getTitle();
        Assert.assertTrue(title.toLowerCase().contains("parabank"),"Expected page title to still contain 'ParaBank' after registration.");
    }
}
