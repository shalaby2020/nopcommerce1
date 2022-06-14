package org.example.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D02_loginStepDef {
    @Given("go to homepage")
    public void navigate_to_homepage()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("click login tab")
    public void click_login_tab()
    {
         Hooks.driver.findElement(By.linkText("Log in")).click();
    }
    @And("enter username and password")
    public void enter_username_and_password()
    {
       Hooks.driver.findElement(By.id("Email")).sendKeys("shalabyy@gmail.com");
        Hooks.driver.findElement(By.id("Password")).sendKeys("aero2020");

    }
    @And("click LOGIN button")
    public void click_LOGIN_button()
    {
        Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button")).click();
    }
    @Then("login page")
    public void login_page()
    {
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/");
    }

}
