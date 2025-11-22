package com.bharatsaini882.parabank.tests;

import com.bharatsaini882.parabank.core.BaseTest;
import com.bharatsaini882.parabank.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test(groups = {"ui", "regression"})
    public void invalidCredentialsShouldShowErrorMessage(){

        driver.get(baseUrl);

        LoginPage loginPage = new LoginPage(driver);

        String invalidUsername = "invalidUser1231";
        String invalidPassword = "wrongPassword!!";

        loginPage.login(invalidUsername,invalidPassword);

        String errorText = loginPage.getErrorMessage();
        Assert.assertTrue(errorText.toLowerCase().contains("the username and password could not be verified."),"Expected error message to indicate invalid username/password.");

    }

}
