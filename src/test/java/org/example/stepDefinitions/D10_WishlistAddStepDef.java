package org.example.stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class D10_WishlistAddStepDef {

    @When("user push on add to wishlist")
    public void user_add_wishlist() throws InterruptedException {

        // add to wishlist
        Hooks.driver.findElement(By.cssSelector("div.item-grid:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(3)")).click();
        Thread.sleep(3000);
    }

}
