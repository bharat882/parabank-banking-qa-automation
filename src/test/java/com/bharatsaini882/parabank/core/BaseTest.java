package com.bharatsaini882.parabank.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public abstract class BaseTest {

    protected WebDriver driver;
    protected final String baseUrl = "https://parabank.parasoft.com/parabank/index.htm";

    @BeforeMethod(alwaysRun = true)
    public void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @AfterMethod(alwaysRun = true)
    public void tearDownDriver(){
        if(driver!=null)
            driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }
}
