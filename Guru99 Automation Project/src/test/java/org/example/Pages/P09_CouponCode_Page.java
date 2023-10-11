package org.example.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.example.StepDefinitions.Hooks.driver;

public class P09_CouponCode_Page {
    private final By MobileButton = By.cssSelector("a[href=\"http://live.techpanda.org/index.php/mobile.html\"]");

    public By getMobileButton() {
        return MobileButton;
    }
    private final By addIPhoneButton = By.xpath("//li[@class=\"item last\"]//a[@title=\"IPhone\"]/following-sibling::div//button[@title=\"Add to Cart\"]");

    public By getAddIPhoneButton() {
        return addIPhoneButton;
    }
    private final By couponField = By.id("coupon_code");

    public By getCouponField() {
        return couponField;
    }
    private final By discount = By.cssSelector("span[class=\"price selectorgadget_selected\"]");

    public By getDiscount() {
        return discount;
    }
    private final By applyButton = By.cssSelector("button[title=\"Apply\"]");

    public By getApplyButton() {
        return applyButton;
    }



}
