package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;

public class P04_CompareBetweenSonyValues_Page extends Hooks {
private final By value1Sony = By.cssSelector("span[id=\"product-price-1\"]>span[class=\"price\"]");
    public By getValue1Sony() {
        return value1Sony;
    }
    private final By clickOnSony = By.id("product-collection-image-1");
    public By getClickOnSony() {
        return clickOnSony;
    }
    private final By value2Sony = By.cssSelector("span[class=\"price\"]");
    public By getValue2Sony() {
        return value2Sony;
    }
    private final By AddToCartButton = By.xpath("//li[@class=\"item last\"]//a[@title=\"Xperia\"]/following-sibling::div[@class=\"product-info\"]//div[@class=\"actions\"]//button[@title=\"Add to Cart\"]");
    public By getAddToCartButton() {
        return AddToCartButton;
    }

    private final By editInQty= By.cssSelector("td[class=\"product-cart-actions\"]>input[data-cart-item-id=\"MOB001\"]");
    public By getEditInQty() {
        return editInQty;
    }
    private final By updateButton = By.cssSelector("button[title=\"Update\"]");
    public By getUpdateButton() {
        return updateButton;
    }
    private final By empty_cart_button= By.id("empty_cart_button");

    public By getEmpty_cart_button() {
        return empty_cart_button;
    }
    private final By h1 = By.tagName("h1");

    public By getH1() {
        return h1;
    }
}
