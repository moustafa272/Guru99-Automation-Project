package org.example.Pages;
import org.openqa.selenium.By;
public class P01_Create_account_Page {

private final By addAccount=By.cssSelector("div>a[href=\"http://live.techpanda.org/index.php/customer/account/\"]>span[class=\"label\"]");
    public By getAddAccount() {
        return addAccount;
    }
private final By clickOnRegister = By.cssSelector("a[href=\"http://live.techpanda.org/index.php/customer/account/create/\"]");
    public By getClickOnRegister(){
        return clickOnRegister;
    }
private final By enterFirstName = By.id("firstname");
    public By getEnterFirstName(){
        return enterFirstName;
    }
private final By enterMiddleName = By.id("middlename");
    public By getEnterMiddleName(){
        return enterMiddleName;
    }
private final By enterLastName = By.id("lastname");
    public By getEnterLastName(){
        return enterLastName;
    }
private final By enterMail = By.id("email_address");
    public By getEnterMail() {
        return enterMail;
    }
private final By enterPassword = By.id("password");
    public By getEnterPassword() {
        return enterPassword;
    }
private final By confirmation = By.id("confirmation");
    public By getConfirmation() {
        return confirmation;
    }
private final By subscribe = By.id("is_subscribed");
    public By getSubscribe(){
        return subscribe;
    }
private final By registerButton = By.cssSelector("button[title=\"Register\"]");
    public By getRegisterButton() {
        return registerButton;
    }
    private final By TvClickButton = By.xpath("//a[@href=\"http://live.techpanda.org/index.php/tv.html\"]");

    public By getTvClickButton() {
        return TvClickButton;
    }

    private final By wishlistButton = By.xpath("//li//a[@title=\"LG LCD\"]/following-sibling::div//div//ul//li//a[@class=\"link-wishlist\"]");
    public By getWishlistButton() {
        return wishlistButton;
    }
    private final By shareWishListButton = By.xpath("//button[@title=\"Share Wishlist\"]");

    public By getShareWishListButton() {
        return shareWishListButton;
    }
    private final By enterEmail = By.id("email_address");

    public By getEnterEmail() {
        return enterEmail;
    }
    private final By enterMessage = By.id("message");

    public By getEnterMessage() {
        return enterMessage;
    }
    private final By doneMessage = By.xpath("//li[@class=\"success-msg\"]//ul//li//span");

    public By getDoneMessage() {
        return doneMessage;
    }
}
