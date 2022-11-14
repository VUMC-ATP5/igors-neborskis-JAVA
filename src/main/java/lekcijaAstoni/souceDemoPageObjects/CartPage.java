package lekcijaAstoni.souceDemoPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver browserChrome;
    WebDriverWait wait;

    private By checkoutButton = By.id("checkout");
    private By pageTitle = By.cssSelector("span.title");


    public WebElement getCheckoutButton(){
        wait.until(ExpectedConditions.elementToBeClickable(checkoutButton));
        return browserChrome.findElement(checkoutButton);
    }

    public WebElement getPageTitle(){
        return browserChrome.findElement(pageTitle);
    }

    public CartPage(WebDriver browserChrome) {
        this.browserChrome = browserChrome;
        wait = new WebDriverWait(browserChrome, Duration.ofSeconds(10));
    }


}
