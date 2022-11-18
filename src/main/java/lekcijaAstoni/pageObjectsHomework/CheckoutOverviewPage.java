package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {

    WebDriver browserChrome;

    private By pageTitle = By.cssSelector("span.title");
    private By productNameBackpack = By.id("item_4_title_link");
    private By productNameJacket = By.id("item_5_title_link");
    private By productCountBadge = By.className("shopping_cart_badge");
    private By buttonFinish = By.id("finish");

    public WebElement getPageTitle(){
        return browserChrome.findElement(pageTitle);
    }

    public WebElement getButtonFinish(){
        return browserChrome.findElement(buttonFinish);
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

    public CheckoutOverviewPage(WebDriver browserChrome) {
        this.browserChrome = browserChrome;
    }

}
