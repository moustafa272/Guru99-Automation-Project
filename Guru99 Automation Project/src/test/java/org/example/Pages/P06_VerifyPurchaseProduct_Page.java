package org.example.Pages;

import org.example.StepDefinitions.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class P06_VerifyPurchaseProduct_Page extends Hooks {
    private final By wishListButton = By.xpath("//div[@class=\"block-content\"]//ul//li//a[@href=\"http://live.techpanda.org/index.php/wishlist/\"]");

    public By getWishListButton() {
        return wishListButton;
    }
    private final By addToCartButton = By.cssSelector("button[title=\"Add to Cart\"]");

    public By getAddToCartButton() {
        return addToCartButton;
    }
    private final By proceedToCheckout = By.xpath("//div[@class=\"page-title title-buttons\"]//ul//li//button[@title=\"Proceed to Checkout\"]");

    public By getProceedToCheckout() {
        return proceedToCheckout;
    }
    private final By addressField = By.xpath("//input[@id=\"billing:street1\"]");

    public By getAddressField() {
        return addressField;
    }
    private final By cityField = By.id("billing:city");

    public By getCityField() {
        return cityField;
    }
    private final By companyField = By.id("billing:company");

    public By getCompanyField() {
        return companyField;
    }
    private final By streetField = By.id("billing:street2");

    public By getStreetField() {
        return streetField;
    }
    private final By provinceField = By.xpath("//div[@class=\"field\"]//div[@class=\"input-box\"]//select[@class=\"validate-select required-entry\"]");

    public By getProvinceField() {
        return provinceField;
    }
    public WebElement provinceField1(){
    WebElement province = driver.findElement(By.xpath("//select[@id=\"shipping:region_id\"]"));
    return  province;
    }
    private final By postcodeField = By.id("billing:postcode");

    public By getPostcodeField() {
        return postcodeField;
    }
    private final By countrySelect = By.xpath("//select[@id=\"shipping:country_id\"]");

    public By getCountrySelect() {
        return countrySelect;
    }
    private final By phoneField = By.id("billing:telephone");

    public By getPhoneField() {
        return phoneField;
    }
    private final By faxField = By.id("billing:fax");

    public By getFaxField() {
        return faxField;
    }
    private final By continueButton = By.cssSelector("div[id=\"billing-buttons-container\"]>button[title=\"Continue\"]");
    public By getContinueButton() {
        return continueButton;
    }
    private final By countrySelection = By.id("country");

    public By getCountrySelection() {
        return countrySelection;
    }
    private final By selectProvinceField = By.id("region_id");

    public By getSelectProvinceField() {
        return selectProvinceField;
    }
    private final By postCode = By.id("postcode");

    public By getPostCode() {
        return postCode;
    }
    private final By estimateButton = By.cssSelector("button[title=\"Estimate\"]");

    public By getEstimateButton() {
        return estimateButton;
    }
    private final By updateButton = By.cssSelector("button[title=\"Update Total\"]");

    public By getUpdateButton() {
        return updateButton;
    }
    private final By ratioClick = By.id("s_method_flatrate_flatrate");

    public By getRatioClick() {
        return ratioClick;
    }
    private final By priceOfPeace = By.cssSelector("table[id=\"shopping-cart-totals-table\"]>tbody>tr>td>span[class=\"price\"]");

    public By getPriceOfPeace() {
        return priceOfPeace;
    }
    private final By updatedValue = By.cssSelector("strong>span[class=\"price\"]");

    public By getUpdatedValue() {
        return updatedValue;
    }
    private final By checkoutButton = By.cssSelector("ul[class=\"checkout-types bottom\"]>li>button[title=\"Proceed to Checkout\"]");

    public By getCheckoutButton() {
        return checkoutButton;
    }
    private final By ContinueShippingButton = By.cssSelector("div[id=\"shipping-method-buttons-container\"]>button[class=\"button\"]>span>span");
    public By getContinueShippingButton() {
        return ContinueShippingButton;
    }

    private final By ratioButtonToCheck= By.id("p_method_checkmo");

    public By getRatioButtonToCheck() {
        return ratioButtonToCheck;
    }
    private final By continuePaymentButton = By.xpath("//div[@id=\"payment-buttons-container\"]//button[@type=\"button\"]");

    public By getContinuePaymentButton() {
        return continuePaymentButton;
    }
    private final By placeOrderButton = By.xpath("//button[@title=\"Place Order\"]");

    public By getPlaceOrderButton() {
        return placeOrderButton;
    }
    private final By OrderCreate = By.xpath("//div[@class=\"page-title\"]//h1");

    public By getOrderCreate() {
        return OrderCreate;
    }
    private final By orderNumber = By.cssSelector("div[class=\"col-main\"]>p>a[href=\"http://live.techpanda.org/index.php/sales/order/view/order_id/20163/\"]");
    public By getOrderNumber() {
        return orderNumber;
    }
}
