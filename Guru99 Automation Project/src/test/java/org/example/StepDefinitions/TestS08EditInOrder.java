package org.example.StepDefinitions;

import org.example.Pages.P01_Create_account_Page;
import org.example.Pages.P02_Login_Page;
import org.example.Pages.P06_VerifyPurchaseProduct_Page;
import org.example.Pages.P08_EditInOrder_Page;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TestS08EditInOrder extends Hooks{
    P08_EditInOrder_Page edit = new P08_EditInOrder_Page();
    SoftAssert soft = new SoftAssert();
    P02_Login_Page login = new P02_Login_Page();
    P06_VerifyPurchaseProduct_Page vPurchase = new P06_VerifyPurchaseProduct_Page();

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
    public void editInQty() throws InterruptedException {
        driver.findElement(edit.getRecorderButton()).click();
        driver.findElement(edit.getQtyField()).click();
        driver.findElement(edit.getQtyField()).clear();
        driver.findElement(edit.getQtyField()).sendKeys("10");
        driver.findElement(edit.getUpdateButton()).click();
        Thread.sleep(3000);
        String actualUpdatedPrice = driver.findElement(edit.getNewPrice()).getText();
        String expectedUpdatedPrice = "$6,150.00";
        soft.assertEquals(actualUpdatedPrice,expectedUpdatedPrice);
        soft.assertAll();
    }
    @Test(priority = 3)
    public void completeBilling(){
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
        driver.findElement(vPurchase.getRatioClick()).click();
        driver.findElement(vPurchase.getUpdateButton()).click();
        driver.findElement(vPurchase.getCheckoutButton()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
    }
    @Test(priority = 4)
    public void completePurchaseSteps() throws InterruptedException {
        driver.findElement(vPurchase.getContinueButton()).click();
        Thread.sleep(5000);
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
