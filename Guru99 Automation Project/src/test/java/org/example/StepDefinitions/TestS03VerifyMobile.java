package org.example.StepDefinitions;
import org.example.Pages.P01_Create_account_Page;
import org.example.Pages.P02_Login_Page;
import org.example.Pages.P03_VerifyMobile_Page;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;
import java.util.List;

public class TestS03VerifyMobile extends Hooks {
    P03_VerifyMobile_Page verify = new P03_VerifyMobile_Page();
    P02_Login_Page login = new P02_Login_Page();
    SoftAssert soft = new SoftAssert();
    @Test(priority = 1)
    public void loginWithValidUser(){
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
@Test(priority = 1)
    public void goToSite(){
    driver.get("http://live.techpanda.org/");
    String expectedText = driver.findElement(verify.getText()).getText();
    System.out.println(expectedText);
    String actualText = "THIS IS DEMO SITE FOR";
    soft.assertTrue(expectedText.contains(actualText));
    soft.assertAll();
}
@Test(priority = 2)
    public void clickOnMobileMenu(){
    driver.findElement(verify.getClkOnMobile()).click();
    // Assert "Mobile" Text in Mobile Page
    String expectedText = driver.findElement(verify.getAssertMobile()).getText();
    String actualText = "MOBILE";
    soft.assertTrue(expectedText.contains(actualText));
    soft.assertAll();
}
@Test(priority = 3)
    public void selectSortBy(){
    driver.findElement(verify.getClickOnCheckList()).click();
    driver.findElement(verify.getClickInName()).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
     // Assert Products Was Sorted By Name
    String firstProductName = driver.findElement(verify.getFirstProduct()).getText();
    String SecondProductName= driver.findElement(verify.getSecondProduct()).getText();
    String ThirdProductName = driver.findElement(verify.getThirdProduct()).getText();
    System.out.println(firstProductName);
    System.out.println(SecondProductName);
    System.out.println(ThirdProductName);
}
}
