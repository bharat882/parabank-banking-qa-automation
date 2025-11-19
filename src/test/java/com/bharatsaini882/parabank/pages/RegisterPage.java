package com.bharatsaini882.parabank.pages;

import com.bharatsaini882.parabank.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends BasePage {

    public RegisterPage(WebDriver driver) {
        super(driver);
    }

    private final By firstNameInput = By.name("customer.firstName");
    private final By lastNameInput = By.name("customer.lastName");
    private final By addressInput = By.name("customer.address.street");
    private final By cityInput = By.name("customer.address.city");
    private final By stateInput = By.name("customer.address.state");
    private final By zipCodeInput = By.name("customer.address.zipCode");
    private final By phoneNumberInput = By.name("customer.phoneNumber");
    private final By ssnInput = By.name("customer.ssn");
    private final By usernameInput = By.name("customer.username");
    private final By passwordInput = By.name("customer.password");
    private final By confirmInput = By.name("repeatedPassword");
    private final By registerButton = By.xpath("//input[@value='Register']");
    private final By welcomeMessage = By.xpath("//h1[contains(text(),'Welcome')]");

    public void enterFirstName(String firstName){
        waitForVisible(firstNameInput).clear();
        driver.findElement(firstNameInput).sendKeys(firstName);
    }

    public void enterLastName(String lastName){
        waitForVisible(lastNameInput).clear();
        driver.findElement(lastNameInput).sendKeys(lastName);
    }

    public void enterAddress(String address){
        waitForVisible(addressInput).clear();
        driver.findElement(addressInput).sendKeys(address);
    }

    public void enterCity(String city){
        waitForVisible(cityInput).clear();
        driver.findElement(cityInput).sendKeys(city);
    }

    public void enterState(String state){
        waitForVisible(stateInput).clear();
        driver.findElement(stateInput).sendKeys(state);
    }

    public void enterZipCode(String zipCode){
        waitForVisible(zipCodeInput).clear();
        driver.findElement(zipCodeInput).sendKeys(zipCode);
    }

    public void enterPhoneNumber(String phoneNumber){
        waitForVisible(phoneNumberInput).clear();
        driver.findElement(phoneNumberInput).sendKeys(phoneNumber);
    }

    public void enterSsn(String ssn){
        waitForVisible(ssnInput).clear();
        driver.findElement(ssnInput).sendKeys(ssn);
    }

    public void enterUsername(String username){
        waitForVisible(usernameInput).clear();
        driver.findElement(usernameInput).sendKeys(username);
    }

    public void enterPassword(String password){
        waitForVisible(passwordInput).clear();
        driver.findElement(passwordInput).sendKeys(password);
    }

    public void enterConfirmPassword(String confirmPassword){
        waitForVisible(confirmInput).clear();
        driver.findElement(confirmInput).sendKeys(confirmPassword);
    }

    public void clickRegisterButton(){
        driver.findElement(registerButton).click();
    }

    public void registerNewUser(
            String firstName,
            String lastName,
            String address,
            String city,
            String state,
            String zip,
            String phone,
            String ssn,
            String username,
            String password
    ) {
        enterFirstName(firstName);
        enterLastName(lastName);
        enterAddress(address);
        enterCity(city);
        enterState(state);
        enterZipCode(zip);
        enterPhoneNumber(phone);
        enterSsn(ssn);
        enterUsername(username);
        enterPassword(password);
        enterConfirmPassword(password);
        clickRegisterButton();
    }

    public boolean isWelcomePageDisplayed(){
        return waitForVisible(welcomeMessage).isDisplayed();
    }


}
