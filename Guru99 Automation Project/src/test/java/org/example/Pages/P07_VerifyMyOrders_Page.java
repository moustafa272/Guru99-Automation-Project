package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.testng.asserts.SoftAssert;

public class P07_VerifyMyOrders_Page extends Hooks {
    private final By accButton = By.cssSelector("a[data-target-element=\"#header-account\"]>span[class=\"label\"]");

    public By getAccButton() {
        return accButton;
    }
    private final By myAccountButton = By.cssSelector("div[id=\"header-account\"]>div>ul>li[class=\"first\"]>a[title=\"My Account\"]");

    public By getMyAccountButton() {
        return myAccountButton;
    }
    private final By myOrdersButton = By.cssSelector("li>a[href=\"http://live.techpanda.org/index.php/sales/order/history/\"]");

    public By getMyOrdersButton() {
        return myOrdersButton;
    }
    private final By viewOrderButton = By.cssSelector("td[class=\"a-center view last\"]>span>a");

    public By getViewOrderButton() {
        return viewOrderButton;
    }
    private final By textToOrder = By.cssSelector("div[class=\"page-title title-buttons\"]>h1");

    public By getTextToOrder() {
        return textToOrder;
    }
    private final By printButton = By.cssSelector("div[class=\"page-title title-buttons\"]>a[class=\"link-print\"]");

    public By getPrintButton() {
        return printButton;
    }
    private final By saveButton = By.xpath("//cr-button[@class=\"action-button\"]");

    public By getSaveButton() {
        return saveButton;
    }
}
