package com.bharatsaini882.parabank.pages;

import com.bharatsaini882.parabank.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountsOverviewPage extends BasePage {

    private final By accountsOverviewHeading = By.xpath("//h1[contains(.,'Accounts Overview')]");
    private final By accountTable = By.id("accountTable");
    private final By accountRows = By.cssSelector("#accountTable tbody tr");
    private final By logoutLink = By.linkText("Log Out");

    public AccountsOverviewPage(WebDriver driver) {
        super(driver);
    }

    public boolean isAccountsOverviewDisplayed() {
        return waitForVisible(accountsOverviewHeading).isDisplayed();
    }



    public boolean isAccountNumberPresent(String accountNumber) {
        String xpath = "//table[@id='accountTable']//a[normalize-space()='" + accountNumber.trim() + "']";

        try {
            wait.until(driver -> driver.findElements(By.xpath(xpath)).size() > 0);
            return true;
        } catch (Exception e) {
            return false;
        }
    }


    public void clickLogout() {
        driver.findElement(logoutLink).click();
    }
}
