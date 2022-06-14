package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class D04_searchStepDef {

    @Given("navigate to the homepage")
    public void navigate_to_homepage()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }


    @When("click on text box search")
    public void clickOnTextBoxSearch()
    {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("iphone");
        Hooks.driver.findElement(By.className("button-1")).click();
    }

    @And("back to Homepage")
    public void homepage() {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }

    @When("enter in search box with sku")
    public void enterInSearchBox() {
        Hooks.driver.findElement(By.id("small-searchterms")).sendKeys("SCI_FAITH");
        Hooks.driver.findElement(By.className("button-1")).click();

    }

    @Then("search result is shown")
    public void searchResultIsShown() {
        Assert.assertEquals("https://demo.nopcommerce.com/search?q=SCI_FAITH",Hooks.driver.getCurrentUrl());

    }
}
