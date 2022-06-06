package com.automation.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class register {
    @Given("user go to register page")
    public void go_to_register_page() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[href=\"/register?returnUrl=%2F\"]")).click();
    }
    @When("^user register with \"([^\"]*)\" \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\" and \"([^\"]*)\"$" )
    public void valid_data(String type, String FirstName, String LastName, String Email, String Company, String Password, String ConfirmPassword) throws InterruptedException {
        Hooks.driver.findElement(By.id("FirstName")).sendKeys(FirstName);
        Hooks.driver.findElement(By.id("LastName")).sendKeys(LastName);
        Hooks.driver.findElement(By.id("Email")).sendKeys(Email);
        Hooks.driver.findElement(By.id("Company")).sendKeys(Company);
        Hooks.driver.findElement(By.id("Password")).sendKeys(Password);
        Hooks.driver.findElement(By.id("ConfirmPassword")).sendKeys(ConfirmPassword);
        Hooks.driver.findElement(By.id("gender-male")).click();

        Thread.sleep(1000);
    }

    @And("user press on register button")
    public void register_button() throws InterruptedException {

        Hooks.driver.findElement(By.id("register-button")).click();
        Thread.sleep(1000);

    }

    @Then("user registrated to the system successfully")
    public void registrated_login()
    {

        String expictedResult = "Your registration completed";
     String actualResult =  Hooks.driver.findElement(By.className("result")).getText();

        Assert.assertTrue(actualResult.contains(expictedResult));

    }
}
