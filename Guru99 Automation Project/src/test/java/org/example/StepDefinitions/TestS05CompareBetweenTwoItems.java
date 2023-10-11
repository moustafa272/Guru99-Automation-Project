package org.example.StepDefinitions;

import org.example.Pages.P03_VerifyMobile_Page;
import org.example.Pages.P05_CompareBetweenTwoItems_Page;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

public class TestS05CompareBetweenTwoItems extends Hooks {
    P03_VerifyMobile_Page verify = new P03_VerifyMobile_Page();
    P05_CompareBetweenTwoItems_Page compareItems = new P05_CompareBetweenTwoItems_Page();
    SoftAssert soft = new SoftAssert();
    @Test(priority = 1)
    public void addTwoItemsToCompareList(){
        driver.findElement(verify.getClkOnMobile()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(compareItems.getSonyCompareButton()).click();
        driver.findElement(compareItems.getIphoneCompareButton()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.findElement(compareItems.getCompareButton()).click();
    }
    @Test(priority = 2)
    public void popUpWindow(){
        String ExpectedSonyText = driver.findElement(compareItems.getTextSonyMobile()).getText();
        String ActualSonyText = "SONY XPERIA";
        soft.assertEquals(ActualSonyText,ExpectedSonyText);
        System.out.println(ExpectedSonyText);
        System.out.println(ActualSonyText);
        String ExpectedIphoneText = driver.findElement(compareItems.getTextIphoneMobile()).getText();
        String ActualIphoneText = "IPHONE";
        soft.assertEquals(ExpectedIphoneText,ActualIphoneText);
        System.out.println(ExpectedIphoneText);
        System.out.println(ActualIphoneText);
        soft.assertAll();
    }
    @Test(priority = 3)
    public void closePopUpWindow(){
        driver.findElement(compareItems.getClosePopUpButton()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }

}
