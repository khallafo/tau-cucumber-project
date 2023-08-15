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
public class SignIn {
   public WebDriver driver;
   @FindBy(xpath = "/html/body/form/table/tbody/tr[1]/td[2]/input")
   private WebElement Username;
   @FindBy(xpath = "/html/body/form/table/tbody/tr[2]/td[2]/input")
   private WebElement Password;
   @FindBy(xpath = "/html/body/form/table/tbody/tr[3]/td[2]/input[1]")
   private WebElement Submit;

   //Constructor
   public SignIn(WebDriver driver) {
      this.driver = driver;
      //Initialise Elements
      PageFactory.initElements(driver, this);
   }

   public void setUsername(String username) {
      Username.click();
      Username.sendKeys(username);
   }

   public void setUserPassword(String usersPassword) {
      Password.click();
      Password.sendKeys(usersPassword);
   }
   public void clickOnSubmit() {
      Submit.submit();
   }
   public void clickOnSignIn(String username,String password) {
      setUsername(username);
      setUserPassword(password);
      clickOnSubmit();
   }
}
