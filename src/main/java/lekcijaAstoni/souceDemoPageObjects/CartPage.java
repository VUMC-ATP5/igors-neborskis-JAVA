package lekcijaAstoni.souceDemoPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CartPage {

    WebDriver browserChrome;

    private By checkoutButton = By.id("checkout");
    private By pageTitle = By.cssSelector("span.title");


    public WebElement getCheckoutButton(){
        return browserChrome.findElement(checkoutButton);
    }

    public WebElement getPageTitle(){
        return browserChrome.findElement(pageTitle);
    }

    public CartPage(WebDriver browserChrome) {
        this.browserChrome = browserChrome;
    }


}
