package com.automation.step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class Hooks {
      static WebDriver driver;
//    static protected Select select;
//    static Actions actions;
//
//    public Hooks(WebDriver driver) {
//        this.driver = driver;
////        org.openqa.selenium.support.Hooks.initElements(driver, this);

    }

    @Before
    public  void user_open_chrome_browser()
    {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @After
    public  void quitdriver() throws InterruptedException {

        driver.quit();
    }
}
