package lekcijaAstoni.souceDemoPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductsPage {
    WebDriver browserChrome;

    private By pageTitle = By.cssSelector("span.title");
    private By shoppingCartButton = By.id("shopping_cart_container");

    public WebElement getPageTitle(){
        return browserChrome.findElement(pageTitle);
    }

    public WebElement getShoppingCartButton(){
        return browserChrome.findElement(shoppingCartButton);
    }



    public ProductsPage(WebDriver browserChrome) {
        this.browserChrome = browserChrome;
    }

}
