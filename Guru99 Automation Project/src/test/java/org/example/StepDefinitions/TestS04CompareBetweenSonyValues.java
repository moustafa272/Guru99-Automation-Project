package org.example.StepDefinitions;

import org.example.Pages.P01_Create_account_Page;
import org.example.Pages.P02_Login_Page;
import org.example.Pages.P03_VerifyMobile_Page;
import org.example.Pages.P04_CompareBetweenSonyValues_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class TestS04CompareBetweenSonyValues extends Hooks {
    P02_Login_Page login = new P02_Login_Page();
    P03_VerifyMobile_Page verify = new P03_VerifyMobile_Page();
    P04_CompareBetweenSonyValues_Page compare = new P04_CompareBetweenSonyValues_Page();
    SoftAssert soft = new SoftAssert();
    @Test(priority = 1)
    public void loginWithValidUser() {
        driver.get("http://live.techpanda.org/");
        P01_Create_account_Page createAcc = new P01_Create_account_Page();
        driver.findElement(createAcc.getAddAccount()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.findElement(login.getClickOnLogin()).click();
        driver.findElement(login.getEnterValidMail()).sendKeys("liwiror1002@nickolis.com");
        driver.findElement(login.getEnterValidPassword()).sendKeys("123456Mo@");
        driver.findElement(login.getSend2()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    }
    @Test(priority = 2)
    public void clickOnMobileMenu() {
        driver.findElement(verify.getClkOnMobile()).click();
        String value1 = driver.findElement(compare.getValue1Sony()).getText();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.findElement(compare.getClickOnSony()).click();
        String value2 = driver.findElement(compare.getValue2Sony()).getText();
        soft.assertEquals(value1,value2);
        System.out.println(value1);
        System.out.println(value2);
        soft.assertAll();
    }
    @Test(priority = 3)
    public void AddToCart()
    {
        driver.get("http://live.techpanda.org/");
        driver.findElement(verify.getClkOnMobile()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(compare.getAddToCartButton()).click();
        driver.findElement(compare.getEditInQty()).click();
        driver.findElement(compare.getEditInQty()).sendKeys("1000");
        driver.findElement(compare.getUpdateButton()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        String ExpectedErrorMessage = "* The maximum quantity allowed for purchase is 500.";
        String ActualErrorMessage = driver.findElement(By.cssSelector("p[class=\"item-msg error\"]")).getText();
        System.out.println(ExpectedErrorMessage);
        System.out.println(ActualErrorMessage);
        soft.assertEquals(ExpectedErrorMessage,ActualErrorMessage);
        driver.findElement(compare.getEmpty_cart_button()).click();
        String ActualText = driver.findElement(compare.getH1()).getText();
        String ExpectedText = "SHOPPING CART IS EMPTY";
        System.out.println(ActualText);
        System.out.println(ExpectedText);
        soft.assertEquals(ActualText,ExpectedText);
        soft.assertAll();

    }

}