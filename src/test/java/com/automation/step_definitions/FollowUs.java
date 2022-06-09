package com.automation.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.List;


public class FollowUs {

    @Given("user click facebook")
    public void user_click_facebook() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]")).click();
        Thread.sleep(1000);


    }


    @Then("verify that it opens facebook page")
    public void opensfacebook_page()
    {
        Hooks.driver.close();
        List<String> browserTabs = new ArrayList<String>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(browserTabs .get(0));

        String expictedResult = Hooks.driver.getCurrentUrl();
        String actualResult =  "https://www.facebook.com/nopCommerce/";

        Assert.assertTrue(actualResult.contains(expictedResult));

    }

    @Given("user click twitter")
    public void user_click_twitter() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]")).click();
        Thread.sleep(1000);


    }


    @Then("verify that it opens twitter page")
    public void openstwitter_page()
    {
        Hooks.driver.close();

        List<String> browserTabs = new ArrayList<String>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(browserTabs .get(0));

        String expictedResult = Hooks.driver.getCurrentUrl();
        String actualResult =  "https://twitter.com/nopCommerce";

        Assert.assertTrue(actualResult.contains(expictedResult));

    }

    @Given("user click youtube")
    public void user_click_youtube() throws InterruptedException {
        Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]")).click();
        Thread.sleep(1000);


    }


    @Then("verify that it opens youtube page")
    public void opensrss_youtube()
    {

        Hooks.driver.close();

        List<String> browserTabs = new ArrayList<String>(Hooks.driver.getWindowHandles());

        Hooks.driver.switchTo().window(browserTabs .get(0));

        String expictedResult = Hooks.driver.getCurrentUrl();
        String actualResult =  "https://www.youtube.com/user/nopCommerce";

        Assert.assertTrue(actualResult.contains(expictedResult));

    }

    @Given("user click rss")
    public void user_click_rss() throws InterruptedException {
        Thread.sleep(1000);
        Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]")).click();
        Thread.sleep(1000);


    }


    @Then("verify that it opens rss page")
    public void opensrss_page()
    {
//        List<String> browserTabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
//
//        Hooks.driver.switchTo().window(browserTabs .get(1));

        String expictedResult = Hooks.driver.getCurrentUrl();
        String actualResult =  "https://demo.nopcommerce.com/news/rss/1";

        Assert.assertTrue(actualResult.contains(expictedResult));

    }

    String x= Hooks.driver.findElement(By.cssSelector("a[rel=\"0\"]")).getAttribute("class");

    @Given("Open Feed Validation Service3 verify that Feed is Valid")
    public void Feed_is_Valid() throws InterruptedException {

        String x= Hooks.driver.getCurrentUrl();
        Hooks.driver.navigate().to("https://validator.w3.org/feed/");
        Hooks.driver.findElement(By.id("url")).sendKeys(x);

        Hooks.driver.findElement(By.cssSelector("a[class=\"submit\"]")).click();


        Thread.sleep(2000);

        String expictedResult = "Congratulations!";
     String actualResult =  Hooks.driver.findElement(By.xpath("//h2")).getText();
System.out.print(Hooks.driver.findElement(By.xpath("//h2")).getText()
);
        Assert.assertTrue(actualResult.contains(expictedResult));


    }




}
