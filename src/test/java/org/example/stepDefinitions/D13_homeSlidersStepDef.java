package org.example.stepDefinitions;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.testng.Assert;

public class D13_homeSlidersStepDef {

    @When("user clicks on first slider")
    public void user_clicks_on_first_slider()
    {
        Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[1]")).click();

    }
    @Then("first slider is displayed")
    public void frist_slider_is_displayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/ipone6s");
    }
    @When("user clicks on second slider")
    public void user_clicks_on_second_slider()
    {
        Hooks.driver.findElement(By.xpath("(//a[@href=\"http://demo.nopcommerce.com/\"])[2]")).click();

    }
    @Then("second slider is displayed")
    public void second_slider_is_displayed() throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/nokia");
    }
}
