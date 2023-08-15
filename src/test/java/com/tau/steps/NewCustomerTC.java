package com.tau.steps;
import com.tau.Pages.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.*;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import java.io.File;
import java.io.IOException;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class NewCustomer1 {

    public WebDriver driver;
    private String customerID;
    @Before()
    public void setUp() throws Exception {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Given("the user is on the login page")
    public void userIsOnLoginPage() {
        driver = new ChromeDriver();
        driver.get("https://www.demo.guru99.com/V4/");
        driver.manage().window().maximize();
    }

    @When("the user signs in with valid credentials")
    public void userSignInValidCredentials() {
        // Assuming SignIn class exists with a clickOnSignIn method
        SignIn signIn = new SignIn(driver);
        signIn.clickOnSignIn("mngr520474", "ymetYbU1@");
    }

    @Then("the manager ID should be displayed")
    public void managerIDShouldBeDisplayed() {
        WebElement managerID = driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[3]/td"));
        Assert.assertEquals("Manger Id : mngr520474", managerID.getText());
    }

    @Given("the user is on the Add Customer page")
    public void userIsOnAddCustomerPage() {
        driver.navigate().to("https://www.demo.guru99.com/V4/manager/addcustomerpage.php");
    }

    @When("the user creates a new customer with details")
    public void userCreatesNewCustomer() {
        NewCustomer newCustomer = new NewCustomer(driver);
        newCustomer.CreateNewCustomer("lofaa", "ymetYbN", "08-06-1999",
                "st shoubra el kheima", "cairo", "egypt", "123456",
                "01282733545", "mahmoudkhallaf277@gmail.com");
    }

    @Then("the customer should be registered successfully")
    public void customerShouldBeRegistered() {
        WebElement registered = driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[1]/td/p"));
        Assert.assertEquals("Customer Registered Successfully!!!", registered.getText());
    }

    @Then("the customer ID is generated")
    public void customerIDIsGenerated() {
        WebElement customerIDElement = driver.findElement(By.xpath("//*[@id=\"customer\"]/tbody/tr[4]/td[2]"));
        customerID = customerIDElement.getText();
        System.out.println("Generated Customer ID: " + customerID);
    }

    @Given("the user is on the Add Account page")
    public void userIsOnAddAccountPage() {
        driver.navigate().to("https://www.demo.guru99.com/V4/manager/addAccount.php");
    }

    @When("the user adds an account with customer ID and balance")
    public void userAddsAccount() {
        NewAccount newAccount = new NewAccount(driver);
        newAccount.CreateNew("61358", "1000000");
    }

    @Then("the account should be added successfully")
    public void accountShouldBeAdded() {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        // Copy the screenshot file to a location and handle exceptions
        try {
            FileUtils.copyFile(screenshot, new File("F://work//testing//automation//projects//tau-cucumber-project//screenshoots//NewAccount.png"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @After()
    public void tearDown() {
        driver.quit();
    }
}
