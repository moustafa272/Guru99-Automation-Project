package org.example.StepDefinitions;
import org.example.Pages.P01_Create_account_Page;
import org.example.Pages.P02_Login_Page;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestS02Login extends Hooks{
    P02_Login_Page login = new P02_Login_Page();
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
@Test(priority = 2)
public void loginWithInvalidUser() {
    driver.get("http://live.techpanda.org/");
    P01_Create_account_Page createAcc = new P01_Create_account_Page();
    driver.findElement(createAcc.getAddAccount()).click();
    driver.findElement(login.getLogOut()).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
    driver.findElement(createAcc.getAddAccount()).click();
    driver.findElement(login.getClickOnLogin()).click();
    driver.findElement(login.getEnterValidMail()).sendKeys("memi17@wlmycn.com");
    driver.findElement(login.getEnterValidPassword()).sendKeys("123458886Mo@");
    driver.findElement(login.getSend2()).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
}
}
