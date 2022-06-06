package com.automation.step_definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;


public class Search {

    @When("user clicks on search field")
    public void user_clicks_on_search_field() {
        // locate search field and click on it
        Hooks.driver.findElement(By.id("small-searchterms")).click();
    }

    @And("user search with name of product")
    public void user_search_with_name_of_product() {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("book");
        Hooks.driver.findElement(By.cssSelector("button[class=\"button-1 search-box-button\"]")).click();

    }

    @Then("user could find relative results")
    public void user_could_find_relative_results() {
        int count = Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).size();  // 0
        System.out.println(count);
        Assert.assertTrue(count > 0);

        // findelements     [webelement0, webelement1]
        for (int x = 0; x < count; x++) {
            System.out.println(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText());
            Assert.assertTrue(Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"] a")).get(x).getText().toLowerCase().contains("book"));
        }
    }

    @And("user clicks on Currency Selector")
    public void user_clicks_on_Currency_Selector() {
        Hooks.driver.findElement(By.id("customerCurrency")).click();


    }

    @Then("user select Euro")
    public void user_select_Euro() throws InterruptedException {

        Hooks.driver.navigate().to("https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F");
        Thread.sleep(1000);

    }


    @And("user select Apparel category")
    public void user_press_on_pparel_ategory() throws InterruptedException {


        Actions action = new Actions(Hooks.driver);
        WebElement menuOption = Hooks.driver.findElement(By.xpath("//html/body/div[6]/div[2]/ul/li[3]/a"));
        action.moveToElement(menuOption).perform();
        Thread.sleep(500);


    }

    @And("user select Shoes sub_Category")
    public void user_select_Shoes_sub_Category() throws InterruptedException {
        Actions action = new Actions(Hooks.driver);

        WebElement subMenuOption = Hooks.driver.findElement(By.xpath("//html/body/div[6]/div[2]/ul/li[3]/ul/li/a[1]"));
        action.moveToElement(subMenuOption).perform();
        Thread.sleep(500);

        WebElement selectMenuOption = Hooks.driver.findElement(By.xpath("//html/body/div[6]/div[2]/ul/li[3]/ul/li/a[1]"));
        selectMenuOption.click();
        Thread.sleep(1000);

    }


    @And("user could filter with color Red")
    public void user_could_filter_with_Color() throws InterruptedException {

        Hooks.driver.findElement(By.id("attribute-option-15")).click();
        Thread.sleep(1000);
    }

    @And("user select awesome tag")
    public void user_select_A_tag() throws InterruptedException {

        Hooks.driver.findElement(By.cssSelector("a[href=\"/awesome\"]")).click();

//        WebElement selectMenuOption = Hooks.driver.findElement(By.xpath("//html/body/div[6]/div[2]/ul/li[3]/ul/li/a[1]"));
//        selectMenuOption.click();

        Thread.sleep(1000);
    }
}
