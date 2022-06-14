package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.example.pages.P01_register;


import static org.example.stepDefinitions.Hooks.driver;

public class D03_resetPasswordStepDef {
    @Given("go to the homepage")
    public void navigate_to_homepage()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("click login Link text")
    public void clickLoginLinkText() {
        driver.findElement(By.linkText("Log in")).click();


    }

    @And("click Forgot password link text")
    public void clickForgotPasswordLinkText() {
        driver.findElement(By.linkText("Forgot password?")).click();

    }

    @And("enter user email")
    public void enterUserEmail() {
        P01_register.enterEmail();

    }

    @And("click recover button")
    public void clickRecoverButton() {
        driver.findElement(By.name("send-email")).click();
    }
    @Then("recovery page")
    public void recovery_page()
    {
        System.out.println("Email with instructions has been sent to you.");
    }
}
