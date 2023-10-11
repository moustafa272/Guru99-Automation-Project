package org.example.StepDefinitions;
import org.example.Pages.P01_Create_account_Page;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TestS01CreateAccountStep extends Hooks{
    P01_Create_account_Page createAcc = new P01_Create_account_Page();
    SoftAssert soft = new SoftAssert();

    @Test(priority = 1)
    public void create_acc(){

        driver.findElement(createAcc.getAddAccount()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
        driver.findElement(createAcc.getClickOnRegister()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
}
    @Test(priority = 2)
    public void enterData(){
        driver.findElement(createAcc.getEnterFirstName()).sendKeys("Mostafa");
        driver.findElement(createAcc.getEnterMiddleName()).sendKeys("Saber");
        driver.findElement(createAcc.getEnterLastName()).sendKeys("Emam");
        driver.findElement(createAcc.getEnterMail()).sendKeys("liwiror1002@nickolis.com");
        driver.findElement(createAcc.getEnterPassword()).sendKeys("123456Mo@");
        driver.findElement(createAcc.getConfirmation()).sendKeys("123456Mo@");
        driver.findElement(createAcc.getSubscribe()).click();
        driver.findElement(createAcc.getRegisterButton()).click();
    }
    @Test(priority = 3)
    public void verifyRegistration(){
        String confirmRegistration = driver.findElement(By.cssSelector("div>div>div>div>ul>li>ul>li>span")).getText();
        String ActualConfirmRegistration = "Thank you for registering with Main Website Store.";
        soft.assertEquals(confirmRegistration,ActualConfirmRegistration);
        soft.assertAll();

    }
    @Test(priority = 4)
    public void clickOnTvAndShareWishList(){
        driver.findElement(createAcc.getTvClickButton()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(createAcc.getWishlistButton()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(createAcc.getShareWishListButton()).click();
    }
    @Test(priority = 5)
    public void enterEmailAndMessage(){
        driver.findElement(createAcc.getEnterEmail()).click();
        driver.findElement(createAcc.getEnterEmail()).sendKeys("mustaphasaber532@gmail.com");
        driver.findElement(createAcc.getEnterMessage()).click();
        driver.findElement(createAcc.getEnterMessage()).sendKeys("Fix it Please!!");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(createAcc.getShareWishListButton()).click();
    }
    @Test(priority = 6)
    public void checkAssurance(){
        String ActualDoneMessage= driver.findElement(createAcc.getDoneMessage()).getText();
        String ExpectedDoneMessage = "Your Wishlist has been shared.";
        soft.assertEquals(ActualDoneMessage,ExpectedDoneMessage);
        soft.assertAll();
    }

}
