package com.tau.Pages;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import io.qameta.allure.Step;
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
public class FundTransfer {
    public WebDriver driver;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
    public WebElement PayersAccount;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")
    public WebElement PayeesAccount;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
    public WebElement Amount;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input")
    public WebElement Description;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input[1]")
    public WebElement Submit;
    public FundTransfer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setPayersAccount(String accountID) {
        PayersAccount.click();
        PayersAccount.clear();
        PayersAccount.sendKeys(accountID);
    }
    public void setPayeesAccount(String accountID) {
        PayeesAccount.click();
        PayeesAccount.clear();
        PayeesAccount.sendKeys(accountID);
    }
    public void setAmount(String amount) {
        Amount.click();
        Amount.clear();
        Amount.sendKeys(amount);
    }
    public void setDescription(String description) {
        Description.click();
        Description.clear();
        Description.sendKeys(description);
    }
    public void submit(String payersAccount,String payeesAccount,String amount,String description) {
        setPayersAccount(payersAccount);
        setPayeesAccount(payeesAccount);
        setAmount(amount);
        setDescription(description);
        Submit.click();
    }
}
