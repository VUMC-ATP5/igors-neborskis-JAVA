package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CartPage {

    WebDriver browserChrome;
    WebDriverWait wait;

    private By buttonCheckout = By.id("checkout");
    private By pageTitle = By.cssSelector("span.title");
    private By productNameBackpack = By.id("item_4_title_link");
    private By productNameJacket = By.id("item_5_title_link");
    private By productCountBadge = By.className("shopping_cart_badge");


    public WebElement getButtonCheckout(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonCheckout));
        return browserChrome.findElement(buttonCheckout);
    }

    public WebElement getPageTitle(){
        return browserChrome.findElement(pageTitle);
    }

    public String getProductNameBackpack(){
        return browserChrome.findElement(productNameBackpack).getText();
    }

    public String getProductNameJacket(){
        return browserChrome.findElement(productNameJacket).getText();
    }

    public String getProductCountBadge(){
        return browserChrome.findElement(productCountBadge).getText();
    }
    public CartPage(WebDriver browserChrome) {
        this.browserChrome = browserChrome;
        wait = new WebDriverWait(browserChrome, Duration.ofSeconds(10));
    }


}
