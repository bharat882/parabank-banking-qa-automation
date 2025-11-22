package com.bharatsaini882.parabank.pages;

import com.bharatsaini882.parabank.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage extends BasePage {

    private final By usernameInput = By.name("username");
    private final By passwordInput = By.name("password");
    private final By loginButton = By.xpath("//input[@value='Log In']");
    private final By registerLink = By.linkText("Register");
    private final By customerLoginHeading = By.xpath("//h2[text()='Customer Login']");
    private final By openNewAccountLink = By.linkText("Open New Account");
    private final By welcomeMessage = By.xpath("//p[contains(text(),'Your account was created successfully. You are now logged in.')]");
    private final By accountsOverviewLink = By.xpath("//a[text()='Accounts Overview']\n");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public boolean isCustomerLoginVisible(){
        WebElement heading = waitForVisible(customerLoginHeading);
        return heading.isDisplayed();
    }

    public void enterUsername(String username){
        waitForVisible(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password){
        waitForVisible(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void clickLogin(){
        driver.findElement(loginButton).click();
    }

    public void clickRegister(){
        driver.findElement(registerLink).click();
    }

    public void clickOpenNewAccount(){
        driver.findElement((openNewAccountLink)).click();
    }

    public boolean isWelcomeMessageDisplayed(){
        return waitForVisible(welcomeMessage).isDisplayed();
    }

    public void clickAccountsOverview(){
        driver.findElement(accountsOverviewLink).click();
    }
}
