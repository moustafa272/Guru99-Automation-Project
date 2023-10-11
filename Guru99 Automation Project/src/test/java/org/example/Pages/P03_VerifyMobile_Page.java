package org.example.Pages;
import org.openqa.selenium.By;
public class P03_VerifyMobile_Page {

private final By text = By.tagName("h2");
public By getText(){
    return text;
}
private final By clkOnMobile = By.cssSelector("a[href=\"http://live.techpanda.org/index.php/mobile.html\"]");
    public By getClkOnMobile() {
        return clkOnMobile;
    }
private final By assertMobile = By.tagName("h1");
    public By getAssertMobile() {
        return assertMobile;
    }
    private final By clickOnCheckList = By.cssSelector("body>div>div>div>div>div>div>div>div>div>div>select[onchange=\"setLocation(this.value)\"]");
    public By getClickOnCheckList() {
        return clickOnCheckList;
    }
    private final By clickInName = By.cssSelector("body>div>div>div>div>div>div>div>div>div>div>select>option[value=\"http://live.techpanda.org/index.php/mobile.html?dir=asc&order=name\"]");
    public By getClickInName() {
        return clickInName;
    }
    private final By firstProduct = By.cssSelector("div>h2>a[href=\"http://live.techpanda.org/index.php/mobile/iphone.html\"]");
    public By getFirstProduct() {
        return firstProduct;
    }
    private final By SecondProduct = By.cssSelector("div>h2>a[href=\"http://live.techpanda.org/index.php/mobile/samsung-galaxy.html\"]");

    public By getSecondProduct() {
        return SecondProduct;
    }
    private final By thirdProduct = By.cssSelector("div>h2>a[href=\"http://live.techpanda.org/index.php/mobile/sony-xperia.html\"]");
    public By getThirdProduct() {
        return thirdProduct;
    }
}

