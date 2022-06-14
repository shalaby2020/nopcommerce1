package org.example.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import static org.example.stepDefinitions.Hooks.driver;


public class D05_currenciesStepDef {

    @Given("homepage")
    public void navigate_to_homepage()
    {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/");
    }
    @When("select currency")
    public void select_currency()
    {
        Select select = new Select(Hooks.driver.findElement(By.name("customerCurrency")));
        select.selectByVisibleText("Euro");

    }


    @Then("Euro Symbol is shown on products displayed in Home page")
    public void euroSymbolIsShownOnProductsDisplayedInHomePage() {
       int count = driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).size(); //output will be 4 elements

        for (int x= 0 ;x <count ;x++)
        {
         String text =  driver.findElements(By.cssSelector("span[class=\"price actual-price\"]")).get(x).getText();
            Assert.assertTrue(text.contains("€"));
        }
    }
}
