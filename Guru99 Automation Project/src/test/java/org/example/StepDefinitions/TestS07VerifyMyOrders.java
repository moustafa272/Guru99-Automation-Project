package org.example.StepDefinitions;

import org.apache.commons.io.FileUtils;
import org.example.Pages.P01_Create_account_Page;
import org.example.Pages.P02_Login_Page;
import org.example.Pages.P07_VerifyMyOrders_Page;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

public class TestS07VerifyMyOrders extends Hooks {
    P07_VerifyMyOrders_Page ordersPage = new P07_VerifyMyOrders_Page();
    SoftAssert soft = new SoftAssert();
    P02_Login_Page login = new P02_Login_Page();

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
    public void goToMyOrders() throws InterruptedException {
        driver.findElement(ordersPage.getAccButton()).click();
        driver.findElement(ordersPage.getMyAccountButton()).click();
        driver.findElement(ordersPage.getMyOrdersButton()).click();
        driver.findElement(ordersPage.getViewOrderButton()).click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

    }
    @Test(priority = 3)
    public void clickOnPrint() throws InterruptedException, IOException {
        driver.findElement(ordersPage.getPrintButton()).click();
        Thread.sleep(5000);
        Set<String> windowHandles = driver.getWindowHandles();
        if (windowHandles.isEmpty()) {
            return;
        }

        // Get the new tab handle
        String newTabHandle = windowHandles.iterator().next();

        // Switch to the new tab
        driver.switchTo().window(newTabHandle);
        TakesScreenshot sc=(TakesScreenshot) driver;
        File screen = sc.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screen,new File("./Screenshots/VerifyPrint.png"));

    }
}
