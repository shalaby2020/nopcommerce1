package org.example.stepDefinitions;

import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class D11_CompareListStepDef {
    @When("user push on add to compare list")
    public void user_add_compare_list() throws InterruptedException {

        // add to compare list
        Hooks.driver.findElement(By.cssSelector("div.item-grid:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(2) > button:nth-child(2)")).click();
        Thread.sleep(3000);
    }
}
