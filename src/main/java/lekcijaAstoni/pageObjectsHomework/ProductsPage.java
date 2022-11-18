package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    WebDriver browserChrome;

    private By pageTitle = By.cssSelector("span.title");
    private By buttonShoppingCart = By.id("shopping_cart_container");
    private By addToCartBackpack = By.id("add-to-cart-sauce-labs-backpack");
    private By productNameBackpack = By.id("item_4_title_link");
    private By addToCartJacket = By.id("add-to-cart-sauce-labs-fleece-jacket");
    private By productNameJacket = By.id("item_5_title_link");
    private By productCountBadge = By.className("shopping_cart_badge");

    public WebElement getPageTitle(){
        return browserChrome.findElement(pageTitle);
    }

    public WebElement getButtonShoppingCart(){
        return browserChrome.findElement(buttonShoppingCart);
    }

    public WebElement getAddToCartBackpack(){
        return browserChrome.findElement(addToCartBackpack);
    }

    public String getProductNameBackpack(){
        return browserChrome.findElement(productNameBackpack).getText();
    }

    public String getProductCountBadge(){
        return browserChrome.findElement(productCountBadge).getText();
    }

    public WebElement getAddToCartJacket(){
        return browserChrome.findElement(addToCartJacket);
    }

    public String getProductNameJacket(){
        return browserChrome.findElement(productNameJacket).getText();
    }
    public ProductsPage(WebDriver browserChrome) {
        this.browserChrome = browserChrome;
    }

}
