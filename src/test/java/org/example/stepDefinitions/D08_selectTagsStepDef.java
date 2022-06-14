package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class D08_selectTagsStepDef {
    @When("user navigate to home page")
    public void user_nav_cart() throws InterruptedException {
        //open site
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/camera-photo");
        Thread.sleep(2000);
    }


    @And("User can click nice tag")
    public void userCanClickNiceTag() {
        Hooks.driver.findElement(By.linkText("nice")).click();
    }
}
