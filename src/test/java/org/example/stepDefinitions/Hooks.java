package org.example.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver = null;
    //Define before and after annotations for your driver

    @Before
    public static void openBrowser()
    {
        System.setProperty("webdriver.chrome.driver","C:\\Program Files\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        driver.navigate().to("https://demo.nopcommerce.com/");
    }


   @After
    public static void closeBrowser()
    {
        driver.quit();
    }
}
