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
public class ChangePassword {
    public WebDriver driver;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[4]/td[2]/input")
    public WebElement OldPassword;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input")
    public WebElement NewPassword;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[6]/td[2]/input")
    public WebElement ConfirmPassword;
    @FindBy(xpath = "/html/body/table/tbody/tr/td/table/tbody/tr[7]/td[2]/input[1]")
    public WebElement Submit;
    public ChangePassword(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);

    }
    public void setOldPassword(String oldPassword) {
        OldPassword.click();
        OldPassword.clear();
        OldPassword.sendKeys(oldPassword);
    }
    public void setNewPassword(String newPassword) {
        NewPassword.click();
        NewPassword.clear();
        NewPassword.sendKeys(newPassword);
    }
     public void setConfirmPassword(String confirmPassword) {
        ConfirmPassword.click();
        ConfirmPassword.clear();
        ConfirmPassword.sendKeys(confirmPassword);
    }
    public void submit(String oldPassword,String newPassword,String confirmPassword) {
        setOldPassword(oldPassword);
        setNewPassword(newPassword);
        setConfirmPassword(confirmPassword);
        Submit.click();
    }
}
