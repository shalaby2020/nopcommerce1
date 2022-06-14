package org.example.stepDefinitions;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.example.pages.P01_register;

import static org.example.stepDefinitions.Hooks.driver;

public class D01_registerStepDef {

    @Given("navigate to homepage")
    public void navigate_to_homepage()
    {
        driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @When("click register button")
    public void click_register_button()
    {
        driver.findElement(By.className("ico-register")).click();
    }
    @And("fill data and submit")
    public void fill_data()
    {
        P01_register.Click_on_any_Gender_Option();
        P01_register.fisrt_name();
        P01_register.last_name();
        P01_register.select_day();
        P01_register.select_month();
        P01_register.select_year();
        P01_register.enterEmail();
        P01_register.companyname();
        P01_register.password();
        P01_register.confirmpassword();
        P01_register.clickREGISTERButton();
    }

    @Then("Registration page")
    public void Registration_page()
    {
        Assert.assertEquals(driver.getCurrentUrl(),"https://demo.nopcommerce.com/registerresult/1?returnUrl=/");
    }

}
