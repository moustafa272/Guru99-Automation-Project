package org.example.Pages;

import org.openqa.selenium.By;

public class P05_CompareBetweenTwoItems_Page {
    private final By sonyCompareButton = By.xpath("//li[@class=\"item last\"]//a[@title=\"Xperia\"]/following-sibling::div//ul//li//a[@class=\"link-compare\"]");
    public By getSonyCompareButton() {
        return sonyCompareButton;
    }
    private final By iphoneCompareButton = By.xpath("//li[@class=\"item last\"]//a[@title=\"IPhone\"]/following-sibling::div//ul//li//a[@class=\"link-compare\"]");
    public By getIphoneCompareButton() {
        return iphoneCompareButton;
    }
    private final By compareButton = By.cssSelector("button[title=\"Compare\"]");

    public By getCompareButton() {
        return compareButton;
    }
    private final By textSonyMobile = By.cssSelector("h2>a[title=\"Sony Xperia\"]");

    public By getTextSonyMobile() {
        return textSonyMobile;
    }
    private final By textIphoneMobile = By.cssSelector("h2>a[title=\"IPhone\"]");

    public By getTextIphoneMobile() {
        return textIphoneMobile;
    }
    private final By closePopUpButton = By.xpath("//button[@class=\"button\"]");

    public By getClosePopUpButton() {
        return closePopUpButton;
    }
}
