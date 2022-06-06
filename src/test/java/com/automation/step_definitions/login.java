package com.automation.step_definitions;

import com.automation.step_definitions.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;


public class login extends Hooks{

    WebDriver driver;

    public login(WebDriver driver){
        super(driver);

//        this.driver = driver;
//        PageFactory.initElements(driver, this);
//        driver.manage().window().maximize();


    }

    @Given("user go to login page")
    public void go_to_login_page() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"/login?returnUrl=%2F\"]")).click();
    }

    @When("^user login with \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\"$")
    public void valid_username_password(String type, String username, String password)
    {
        driver.findElement(By.id("Email")).sendKeys(username);
        driver.findElement(By.id("Password")).sendKeys(password);
    }

    @And("user press on login button")
    public void login_button() throws InterruptedException {
        Thread.sleep(1000);
        driver.findElement(By.id("Password")).sendKeys(Keys.ENTER);
        Thread.sleep(1000);

    }

    @Then("user login to the system successfully and go to home page")
    public void success_login()
    {
        String expictedResult = driver.getCurrentUrl();
        String actualResult =  "https://demo.nopcommerce.com/";

        Assert.assertTrue(actualResult.contains(expictedResult));
    }


    @When("user press on Forget password")
    public void press_on_Forget_password() throws InterruptedException {
        driver.findElement(By.cssSelector("a[href=\"/passwordrecovery\"]")).click();
    }

    @And("user press on on Recover button")
    public void Recover_button() throws InterruptedException {

        driver.findElement(By.name("send-email")).click();
        Thread.sleep(3000);

    }

    @And("user Write email")
    public void user_Write_email()
    {
        driver.findElement(By.id("Email")).sendKeys("test2@teml.net");
    }




    @Then("User could reset his_her password successfully")
    public void success_reset()
    {
        String expictedResult = "Email with instructions has been sent to you.";
        String actualResult =   driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();

        Assert.assertTrue(actualResult.contains(expictedResult));
    }
}

