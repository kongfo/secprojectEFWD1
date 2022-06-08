package com.automation.step_definitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.IFactoryAnnotation;

public class  Slider {


    @Given("user change slider photo")
    public void user_change_slider_photo() throws InterruptedException {


      String x= Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]")).getAttribute("class");
        String Y= Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]")).getAttribute("class");

        System.out.print("  " +x);
        System.out.print("  " +Y);

//       if ( x == "activenivo-control")
        Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]")).click();
//       else
//        Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]")).click();

//        nivo-control activenivo-control



        {
           Thread.sleep(3000);
       }


    }

//        @Given("user change slider photo")
//        public void user_change_slider_photo() throws InterruptedException {
//        Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]")).click();
//        Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]")).click();
//
//        Thread.sleep(3000);
//
//
//    }


        @Then("verify that slider photo changed")
        public void verify_slider_photo_changed()
        {

            String x= Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]")).getAttribute("class");
            String Y= Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]")).getAttribute("class");
            System.out.print("  " + x);
            System.out.print("  " +Y);


            String expictedResult = Hooks.driver.findElement(By.cssSelector("a[rel=\"1\"]")).getAttribute("class");
            String actualResult =  "nivo-control active";

            Assert.assertTrue(actualResult.contains(expictedResult));
//System.out.println(cssValue);

        }




}
