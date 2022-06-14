package org.example.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import static org.example.stepDefinitions.Hooks.driver;

public class P01_register {
    static String fisrtname = "shalaby" ;
    static String lasttname = "ahmed" ;
    static String password = "aero2020" ;
    static String confirmpassword = "aero2020";
    static String companyname = "autocompany";
    static String enterEmail = "shalabyy@gmail.com";
    static String Gender = "gender-male";
    static String Button = "register-button";

    public static void fisrt_name ()
    {

        driver.findElement(By.id("FirstName")).sendKeys(fisrtname);

    }
    public static void last_name ()
    {
        driver.findElement(By.id("LastName")).sendKeys(lasttname);

    }
    public static void password ()
    {
        driver.findElement(By.id("Password")).sendKeys(password);
    }
    public static void confirmpassword ()
    {
        driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
    }
    public static void companyname ()
    {
        driver.findElement(By.id("Company")).sendKeys(companyname);
    }
    public static void enterEmail() {
        driver.findElement(By.id("Email")).sendKeys(enterEmail);
    }
    public static void select_day()
    {
        Select select = new Select(driver.findElement(By.name("DateOfBirthDay")));
        select.selectByVisibleText("1");
    }
    public static void select_month()
    {
        Select select = new Select(driver.findElement(By.name("DateOfBirthMonth")));
        select.selectByVisibleText("January");
    }
    public static void select_year()
    {
        Select select = new Select(driver.findElement(By.name("DateOfBirthYear")));
        select.selectByVisibleText("1997");

    }
    public static void Click_on_any_Gender_Option()
    {
        driver.findElement(By.id(Gender)).click();
    }
    public static void clickREGISTERButton() {
        driver.findElement(By.id(Button)).click();
    }

}
