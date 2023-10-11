package org.example.Pages;

import org.openqa.selenium.By;

public class P08_EditInOrder_Page {
    private final By recorderButton = By.cssSelector("td[class=\"a-center view last\"]>span>a[class=\"link-reorder\"]");

    public By getRecorderButton() {
        return recorderButton;
    }
    private final By qtyField = By.cssSelector("td[class=\"product-cart-actions\"]>input[type=\"text\"]");

    public By getQtyField() {
        return qtyField;
    }
    private final By updateButton = By.cssSelector("td[class=\"product-cart-actions\"]>button[type=\"submit\"]");

    public By getUpdateButton() {
        return updateButton;
    }
    private final By newPrice = By.cssSelector("td[class=\"product-cart-total\"]>span[class=\"cart-price\"]>span[class=\"price\"]");

    public By getNewPrice() {
        return newPrice;
    }
    private final By orderNumber = By.cssSelector("div>p>a[href=\"http://live.techpanda.org/index.php/sales/order/view/order_id/20196/\"]");

    public By getOrderNumber() {
        return orderNumber;
    }
}
