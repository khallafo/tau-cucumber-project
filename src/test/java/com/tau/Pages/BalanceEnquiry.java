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
public class BalanceEnquiry {
    public WebDriver driver;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
    public WebElement AccountNo;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")
    public WebElement submit;
    public BalanceEnquiry(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void setAccountNo(String accountNo) {
        AccountNo.click();
        AccountNo.clear();
        AccountNo.sendKeys(accountNo);
    }
    public void submit(String accountNo) {
        setAccountNo(accountNo);
        submit.click();
    }
}
