package com.automation.pages;

import com.automation.step_definitions.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class shopping {


    @And("user go to product page")
    public void go_to_product_page() throws InterruptedException {

        Hooks.driver.findElement(By.cssSelector("img[src=\"https://demo.nopcommerce.com/images/thumbs/0000041_htc-one-m8-android-l-50-lollipop_415.jpeg\"]")).click();
        Thread.sleep(500);



    }


    @And("user add product to shopping cart")
    public void user_add_product_to_shopping_cart() throws InterruptedException {


        Hooks.driver.findElement(By.id("add-to-cart-button-18")).click();

        Thread.sleep(3000);
    }

    @And("The product has been added to your cart")
    public void The_product_has_been_added_to_your_cart() throws InterruptedException {

        String expictedResult = "The product has been added to your";
        String actualResult =   Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();

        Assert.assertTrue(actualResult.contains(expictedResult));
    }


    @And("user add product to Wishlist")
    public void user_add_product_to_Wishlist() throws InterruptedException {

        Hooks.driver.findElement(By.id("add-to-wishlist-button-18")).click();

        Thread.sleep(3000);
    }

    @And("The product has been added to your Wishlist")
    public void The_product_has_been_added_to_your_Wishlist() throws InterruptedException {

        String expictedResult = "The product has been added to your wishlist";
        String actualResult =   Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();

        Assert.assertTrue(actualResult.contains(expictedResult));
    }


    @And("user add product to compare list")
    public void user_add_product_to_comparelist() throws InterruptedException {

        Hooks.driver.findElement(By.cssSelector("button[class=\"button-2 add-to-compare-list-button\"]")).click();

        Thread.sleep(3000);
    }

    @And("The product has been added to your compare list")
    public void The_product_has_been_added_to_your_comparelist() throws InterruptedException {

        String expictedResult = "The product has been added to your product comparison";
        String actualResult =   Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]")).getText();

        Assert.assertTrue(actualResult.contains(expictedResult));
    }

    @And("user go to shopping cart")
    public void user_go_to_shopping_cart() throws InterruptedException {

        Hooks.driver.findElement(By.cssSelector("a[href=\"/cart\"]")).click();

        Thread.sleep(500);
    }

    @And("user agree with the terms")
    public void user_agree_with_the_terms() throws InterruptedException {

        Hooks.driver.findElement(By.id("termsofservice")).click();

        Thread.sleep(1000);
    }
    @And("user click checkout button")
    public void user_click_checkout_button() throws InterruptedException {

        Hooks.driver.findElement(By.id("checkout")).click();
        Thread.sleep(1000);
    }

    @When("^user fill address data with \"([^\"]*)\" \"([^\"]*)\"$")
    public void valed_address_data(String type, String data) throws InterruptedException {
        Hooks.driver.findElement(By.id("BillingNewAddress_City")).sendKeys(data);
        Hooks.driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys(data);
        Hooks.driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys(data);
        Hooks.driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys(data);

        WebElement selectMenuOption = Hooks.driver.findElement(By.xpath("//select[@id=\"BillingNewAddress_CountryId\"]//option[@value=\"1\"]"));
        selectMenuOption.click();

        WebElement selectMenuOption2 = Hooks.driver.findElement(By.xpath("//select[@id=\"BillingNewAddress_StateProvinceId\"]//option[@value=\"1\"]"));
        selectMenuOption2.click();

        Thread.sleep(1000);
    }

    @And("user click continue button")
    public void user_click_continue_button() throws InterruptedException {



        Hooks.driver.findElement(By.cssSelector("button[name=\"save\"]")).click();
        Thread.sleep(500);

        Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 shipping-method-next-step-button\"]")).click();;
        Thread.sleep(500);
        Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 payment-method-next-step-button\"]")).click();;
        Thread.sleep(500);
        Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 payment-info-next-step-button\"]")).click();;
        Thread.sleep(500);
        Hooks.driver.findElement(By.xpath("//button[@class=\"button-1 confirm-order-next-step-button\"]")).click();;
        Thread.sleep(2000);
    }
    @Then("user Create successful Order")
    public void  Create_successful_Order()
    {

        String expictedResult = "Your order has been successfully processed!";
        String actualResult =  Hooks.driver.findElement(By.xpath("//div[@class=\"section order-completed\"]//div[@class=\"title\"]//strong[\"Your order has been successfully processed!\"]")).getText();

        Assert.assertTrue(actualResult.contains(expictedResult));

    }


}

