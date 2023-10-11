package org.example.Pages;

import org.openqa.selenium.By;

public class P02_Login_Page {
private final By clickOnLogin = By.cssSelector("a[title=\"Log In\"]");
    public By getClickOnLogin() {
        return clickOnLogin;
    }
private final By enterValidMail = By.id("email");
    public By getEnterValidMail(){
        return enterValidMail;
    }
private final By enterValidPassword = By.id("pass");
    public By getEnterValidPassword() {
        return enterValidPassword;
    }
private final By send2 = By.id("send2");
    public By getSend2() {
        return send2;
    }
private final By logOut = By.cssSelector("a[title=\"Log Out\"]");
    public By getLogOut() {
        return logOut;
    }
}
