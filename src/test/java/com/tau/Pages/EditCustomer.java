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

public class EditCustomer {
    public WebDriver driver;
    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
    public WebElement CustomerID;
    @FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input[1]")
    public WebElement SubmittedCustomerID;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
    public WebElement State;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input[1]")
    public WebElement SubmitEdit;
    public EditCustomer(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);

    }

    public void setCustomerID(String customerID) {
        CustomerID.click();
        CustomerID.clear();
        CustomerID.sendKeys(customerID);
    }
    public void setSubmittedCustomerID() {
        SubmittedCustomerID.click();
    }
    public void setState(String state) {
        State.click();
        State.clear();
        State.sendKeys(state);
    }

    public void setSubmittedEdited() {
        SubmitEdit.click();
    }

    public void editedCustomer1(String customerId){
        setCustomerID(customerId);
        setSubmittedCustomerID();
    }
    public void editCustomerPage(String  state){
        driver.manage().window().maximize();
        setState(state);
        setSubmittedEdited();
    }

}
