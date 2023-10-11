package org.example.StepDefinitions;

import org.example.Pages.P01_Create_account_Page;
import org.example.Pages.P02_Login_Page;
import org.example.Pages.P06_VerifyPurchaseProduct_Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TestS06VerifyPurchaseProduct extends Hooks{
    P06_VerifyPurchaseProduct_Page vPurchase = new P06_VerifyPurchaseProduct_Page();
    P02_Login_Page login = new P02_Login_Page();
    SoftAssert soft = new SoftAssert();
    @Test(priority = 1)
    public void loginWithValidUser(){
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
    public void clickOnMyWishList(){
        driver.findElement(vPurchase.getWishListButton()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
    }
    @Test(priority = 3)
    public void stepsToPurchase(){
        driver.findElement(vPurchase.getAddToCartButton()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));

        WebElement dropdownCountry = driver.findElement(vPurchase.getCountrySelection());
        Select select = new Select(dropdownCountry);
        select.selectByVisibleText("United States");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        WebElement dropdownProvince = driver.findElement(vPurchase.getSelectProvinceField());
        Select select1 = new Select(dropdownProvince);
        select1.selectByVisibleText("Texas");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

        driver.findElement(vPurchase.getPostCode()).sendKeys("542896");
        driver.findElement(vPurchase.getEstimateButton()).click();
        String actual = driver.findElement(vPurchase.getPriceOfPeace()).getText();
        String expected = "$615.00";
        soft.assertEquals(actual,expected);
        driver.findElement(vPurchase.getRatioClick()).click();
        driver.findElement(vPurchase.getUpdateButton()).click();
        String actualUpdate = driver.findElement(vPurchase.getUpdatedValue()).getText();
        String expectedUpdate = "$620.00";
        soft.assertEquals(actualUpdate,expectedUpdate);
        soft.assertAll();
        driver.findElement(vPurchase.getCheckoutButton()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test(priority = 4)
    public void stepsInBillingInfo() throws InterruptedException {
        //driver.findElement(vPurchase.getProceedToCheckout()).click();
        driver.findElement(vPurchase.getCompanyField()).click();
        driver.findElement(vPurchase.getCompanyField()).sendKeys("RM Factors");
        driver.findElement(vPurchase.getAddressField()).click();
        driver.findElement(vPurchase.getAddressField()).sendKeys("ABC");
        driver.findElement(vPurchase.getStreetField()).click();
        driver.findElement(vPurchase.getStreetField()).sendKeys("15 war street");
        driver.findElement(vPurchase.getCityField()).click();
        driver.findElement(vPurchase.getCityField()).sendKeys("New York");
        driver.findElement(vPurchase.getProvinceField()).isDisplayed();
        WebElement dropdown2 = driver.findElement(vPurchase.getProvinceField());
        Select select = new Select(dropdown2);
        select.selectByVisibleText("Texas");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(vPurchase.getPostcodeField()).click();
        driver.findElement(vPurchase.getPostcodeField()).sendKeys("542896");
        driver.findElement(vPurchase.getCountrySelect()).isDisplayed();
        WebElement dropdown = driver.findElement(vPurchase.getCountrySelect());
        Select select2 = new Select(dropdown);
        select2.selectByVisibleText("United States");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(vPurchase.getPhoneField()).click();
        driver.findElement(vPurchase.getPhoneField()).sendKeys("12345678");
        driver.findElement(vPurchase.getFaxField()).click();
        driver.findElement(vPurchase.getFaxField()).sendKeys("mostafa0127");
        Thread.sleep(5000);

        driver.findElement(vPurchase.getContinueButton()).click();
        Thread.sleep(5000);

         }
    @Test(priority = 5)
    public void verifyChippingCost() throws InterruptedException {
        driver.findElement(vPurchase.getContinueShippingButton()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.findElement(vPurchase.getRatioButtonToCheck()).click();
        driver.findElement(vPurchase.getContinuePaymentButton()).click();
        driver.findElement(vPurchase.getPlaceOrderButton()).click();
        Thread.sleep(5000);
        String actualCreation = driver.findElement(vPurchase.getOrderCreate()).getText();
        String expectedCreation = "YOUR ORDER HAS BEEN RECEIVED.";
        soft.assertEquals(actualCreation,expectedCreation);
        soft.assertAll();
    }
}
