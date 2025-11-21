package com.bharatsaini882.parabank.pages;

import com.bharatsaini882.parabank.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountsOverviewPage extends BasePage {

    public AccountsOverviewPage(WebDriver driver) {
        super(driver);
    }

    private final By accountsTableRows = By.cssSelector("#accountTable tbody tr");
    private final By logoutLink = By.linkText("Log Out");
    private final By accountsOverviewHeading = By.xpath("//h1[normalize-space()='Accounts Overview']");

    public boolean isAccountsOverviewHeadingDisplayed(){
        return waitForVisible(accountsOverviewHeading).isDisplayed();
    }

    public List<String> getAllAccountNumbers(){
        waitForVisible(accountsTableRows);
        List<WebElement> rows = driver.findElements(accountsTableRows);
        List<String> accountNumbers = new ArrayList<>();
        for(WebElement row: rows){
            WebElement accountLink = row.findElement(By.cssSelector("td:nth-child(1) a"));
            accountNumbers.add(accountLink.getText().trim());
        }
        return accountNumbers;
    }

    public void clickLogout(){
        driver.findElement(accountsOverviewHeading).click();
    }

}
