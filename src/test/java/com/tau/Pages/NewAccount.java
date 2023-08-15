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
import org.openqa.selenium.support.ui.Select; // Import the Select class

public class NewAccount {
    public WebDriver driver;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[2]/td[2]/input")
    public WebElement CustomerID;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")
    public WebElement AccountType;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
    public WebElement Initial_deposit;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
    public WebElement SubmitButton;
    public NewAccount(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setCustomerID(String customerID) {
        CustomerID.click();
        CustomerID.clear();
        CustomerID.sendKeys(customerID);
    }
    public void setAccountType() {
        Select dropdown = new Select(driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td[2]/select")));
        dropdown.selectByValue("Savings");
    }
    public void setInitialDeposit(String initialDeposit) {
        Initial_deposit.click();
        Initial_deposit.clear();
        Initial_deposit.sendKeys(initialDeposit);
    }
    public void clickSubmitButton() {
        SubmitButton.click();
    }
    public void CreateNew(String customerID,String intialDeposit){
        setCustomerID(customerID);
        setAccountType();
        setInitialDeposit(intialDeposit);
        clickSubmitButton();
    }
}
