package com.automation.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.ArrayList;
import java.util.List;

public class  Slider {



        @Given("user change slider photo")
        public void user_change_slider_photo() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[class=\"nivo-imageLink\"]")).click();
        Thread.sleep(1000);


    }


        @Then("verify that slider photo changed")
        public void verify_slider_photo_changed()
        {

            String expictedResult = Hooks.driver.getCurrentUrl();
            String actualResult =  "https://demo.nopcommerce.com/";

            Assert.assertTrue(actualResult.contains(expictedResult));
//System.out.println(cssValue);

        }




}
