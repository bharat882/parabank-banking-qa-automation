package com.bharatsaini882.parabank.tests;

import com.bharatsaini882.parabank.core.BaseTest;
import com.bharatsaini882.parabank.pages.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.UUID;

public class OpenNewAccountTest extends BaseTest {

    private static final Logger log = LoggerFactory.getLogger(OpenNewAccountTest.class);

    @Test(groups = {"ui", "regression"})
    public void userShouldBeAbleToOpenNewAccountAfterLogin(){

        driver.get(baseUrl);

        HomePage homePage = new HomePage(driver);
        homePage.clickRegister();

        RegisterPage registerPage = new RegisterPage(driver);

        String uniqueUsername = "user_" + UUID.randomUUID().toString().substring(0, 8);
        String password = "Password123!";

        // Step 2: Register a new user (this usually logs the user in automatically)
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

        AccountsOverviewPage accountsOverviewPage = new AccountsOverviewPage(driver);
        Assert.assertTrue(accountsOverviewPage.isAccountsOverviewHeadingDisplayed(),"Expected to be on Accounts Overview after registration");

        List<String> existingAccounts = accountsOverviewPage.getAllAccountNumbers();
        int initialAccountCount = existingAccounts.size();

        accountsOverviewPage.clickLogout();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(uniqueUsername, password);

        Assert.assertTrue(accountsOverviewPage.isAccountsOverviewHeadingDisplayed(),"Expected to be on Accounts Overview after login");

        homePage = new HomePage(driver);
        homePage.clickOpenNewAccount();

        OpenNewAccountPage openNewAccountPage = new OpenNewAccountPage(driver);

        openNewAccountPage.selectAccountType("CHECKING");
        openNewAccountPage.selectFromAccountByIndex(0);
        openNewAccountPage.clickOpenNewAccountButton();

        Assert.assertTrue(openNewAccountPage.isAccountOpenedMessageDisplayed(),"Expected 'Account Opened!' message after opening account");

        String newAccountId = openNewAccountPage.getNewAccountId();
        System.out.println("Newly opened account id: "+newAccountId);
        Assert.assertFalse(newAccountId.isEmpty(),"New account ID should not be empty.");

        driver.get(baseUrl);

        Assert.assertTrue(accountsOverviewPage.isAccountsOverviewHeadingDisplayed(),"Expected Accounts Overview to be displayed");

        List<String> updatedAccounts = accountsOverviewPage.getAllAccountNumbers();

        Assert.assertTrue(updatedAccounts.size()>initialAccountCount, "Expected number of accounts to increase after opening a new one.");

        Assert.assertTrue(updatedAccounts.contains(newAccountId),"Expected newly created account to appear in Accounts Overview.");

    }

}
