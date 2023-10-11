package org.example.StepDefinitions;
import org.apache.commons.io.FileUtils;
import org.example.Pages.P01_Create_account_Page;
import org.example.Pages.P02_Login_Page;
import org.example.Pages.P09_CouponCode_Page;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class TestS09CouponCode extends Hooks{
    SoftAssert soft = new SoftAssert();
    P02_Login_Page login = new P02_Login_Page();
    P09_CouponCode_Page couponCode = new P09_CouponCode_Page();
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
    public void stepsToAddIPhoneToCart() throws IOException {
        driver.findElement(couponCode.getMobileButton()).click();
        driver.findElement(couponCode.getAddIPhoneButton()).click();
        driver.findElement(couponCode.getCouponField()).click();
        driver.findElement(couponCode.getCouponField()).sendKeys("GURU50");
        driver.findElement(couponCode.getApplyButton()).click();
        List<WebElement> elements = driver.findElements(By.cssSelector("table[id=\"shopping-cart-totals-table\"]>tbody>tr>td>span"));
        WebElement element2 = elements.get(1);
        String expectedDiscount = "-$25.00";
        String actualDiscount = element2.getText();
        soft.assertEquals(expectedDiscount,actualDiscount);
        soft.assertAll();
        TakesScreenshot sc=(TakesScreenshot) driver;
        File screen = sc.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen,new File("./Screenshots/Discount.png"));
    }
}
