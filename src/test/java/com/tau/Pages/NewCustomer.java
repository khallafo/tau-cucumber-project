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

public class NewCustomer {
    public WebDriver driver;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
    public WebElement UserName;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[1]")
    public WebElement Gender;
    @FindBy(xpath = "//*[@id=\"dob\"]")
    public WebElement DateOfBirth;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/textarea")
    public WebElement Address;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[8]/td[2]/input")
    public WebElement City;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[9]/td[2]/input")
    public WebElement State;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[10]/td[2]/input")
    public WebElement Pin;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[11]/td[2]/input")
    public WebElement PhoneNumber;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[12]/td[2]/input")
    public WebElement Email;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[13]/td[2]/input")
    public WebElement Password;

    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[14]/td[2]/input[1]")
    public WebElement Submit;
    public NewCustomer(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }
    public void setUserName(String username){
        UserName.click();
        UserName.clear();
        UserName.sendKeys(username);
    }
    public void setGender(){
        Gender.click();
    }
    public void setDateOfBirth(String dateOfBirth){
        DateOfBirth.clear();
        DateOfBirth.sendKeys(dateOfBirth);
    }
    public void setAddress(String address){
        Address.click();
        Address.clear();
        Address.sendKeys(address);
    }
    public void setCity(String city){
        City.click();
        City.clear();
        City.sendKeys(city);
    }
    public void setState(String state){
        State.click();
        State.clear();
        State.sendKeys(state);
    }
    public void setPin(String pin){
        Pin.click();
        Pin.clear();
        Pin.sendKeys(pin);
    }
    public void setPhoneNumber(String phoneNumber){
        PhoneNumber.click();
        PhoneNumber.clear();
        PhoneNumber.sendKeys(phoneNumber);
    }
    public void setEmail(String email){
        Email.click();
        Email.clear();
        Email.sendKeys(email);
    }
    public void setPassword(String password){
        Password.click();
        Password.clear();
        Password.sendKeys(password);
    }
    public void submit(){
        Submit.click();
    }

    public void CreateNewCustomer(String username, String password, String dateOfBirth, String address, String city, String state, String pin,String phoneNumber, String email) {
        setUserName(username);
        setGender();
        setDateOfBirth(dateOfBirth);
        setAddress(address);
        setCity(city);
        setState(state);
        setPin(pin);
        setPhoneNumber(phoneNumber);
        setEmail(email);
        setPassword(password);
        submit();
    }

    }


