package com.tau.Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.testng.annotations.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.Keys ;
public class DeleteCustomer {
    public WebDriver driver;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
    public WebElement CustomerID;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[1]")
    public WebElement DeleteButton;

    public DeleteCustomer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void clickDeleteButton() {
        DeleteButton.click();
    }
    public void SetCustomerID(String customerID) {
        CustomerID.click();
        CustomerID.clear();
        CustomerID.sendKeys(customerID);
    }
    public void ValidateDelete(String customerID) {
        SetCustomerID(customerID);
        clickDeleteButton();
    }
}
