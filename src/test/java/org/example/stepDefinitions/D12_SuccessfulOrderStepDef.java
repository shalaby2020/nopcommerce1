package org.example.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;

public class D12_SuccessfulOrderStepDef {
    @When("navigate to product pages")
    public void user_nav_cart() throws InterruptedException {
        //open site
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/camera-photo");
        Thread.sleep(2000);

    }

    @And("select category books")
    public void selectCategoryBooks() {
        Hooks.driver.findElement(By.xpath("/html/body/div[6]/div[2]/ul[1]/li[5]/a")).click();
        
    }

    @And("choose books and adding to cart")
    public void chooseBooksAndAddingToCart() {
        Hooks.driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-body > div.products-container > div.products-wrapper > div > div > div:nth-child(1) > div > div.details > div.add-info > div.buttons > button.button-2.product-box-add-to-cart-button")).click();
    }

    @And("get shopping cart")
    public void getShoppingCart() {
        Hooks.driver.findElement(By.xpath("//*[@id=\"topcartlink\"]/a/span[1]")).click();

    }

    @And("agree with terms and checkout")
    public void agreeWithTermsAndCheckout() {
        Hooks.driver.findElement(By.id("termsofservice")).click();
        Hooks.driver.findElement(By.name("checkout")).click();
    }
}