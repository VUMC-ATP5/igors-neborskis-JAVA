package lekcijaAstoni.souceDemoPageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutOverviewPage {

    WebDriver browserChrome;

    private By pageTitle = By.cssSelector("span.title");

    public WebElement getPageTitle(){
        return browserChrome.findElement(pageTitle);
    }

    public CheckoutOverviewPage(WebDriver browserChrome) {
        this.browserChrome = browserChrome;
    }

}
