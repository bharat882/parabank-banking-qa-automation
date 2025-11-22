package com.bharatsaini882.parabank.pages;

import com.bharatsaini882.parabank.core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class OpenNewAccountPage extends BasePage {

    public OpenNewAccountPage(WebDriver driver) {
        super(driver);
    }

    private final By accountTypeDropdown = By.id("type");
    private final By fromAccountDropdown = By.id("fromAccountId");
    private final By openNewAccountButton = By.cssSelector("input[value='Open New Account']");
    private final By newAccountIdLink = By.id("newAccountId");
    private final By accountOpenedMessage = By.xpath("//h1[text()='Account Opened!']");

    public void selectAccountType(String type){
        Select select = new Select(waitForVisible(accountTypeDropdown));
        select.selectByVisibleText(type);
    }

    public void selectFromAccountByIndex(int index){
        Select select = new Select((waitForVisible(fromAccountDropdown)));
        wait.until(driver -> select.getOptions().size()>0);
        select.selectByIndex(index);
    }

    public void clickOpenNewAccountButton(){
        driver.findElement(openNewAccountButton).click();
    }

    public String getNewAccountId(){
        return waitForVisible(newAccountIdLink).getText().trim();
    }

    public boolean isAccountOpenedMessageDisplayed(){
        return waitForVisible(accountOpenedMessage).isDisplayed();
    }

}
