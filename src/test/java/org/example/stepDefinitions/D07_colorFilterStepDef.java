package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class D07_colorFilterStepDef {
    @When("user navigate in page and select Apparel")
    public void user_nav_cart() throws InterruptedException {
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/camera-photo");
        Thread.sleep(2000);
        Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(3) > a")).click();
    }

    @And("user select shoes")
    public void userSelectShoes() {
        Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.side-2 > div.block.block-category-navigation > div.listbox > ul > li.active.last > ul > li:nth-child(1)")).click();

    }
}
