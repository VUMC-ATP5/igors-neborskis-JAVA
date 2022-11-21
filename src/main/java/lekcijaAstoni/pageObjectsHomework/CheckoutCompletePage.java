package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutCompletePage extends BasePage {

    private By completeMessage = By.className("complete-header");
    private By buttonBackHome = By.id("back-to-products");

    public WebElement getCompleteMessage() {
        return browserChrome.findElement(completeMessage);
    }

    public WebElement getButtonBackHome() {
        return browserChrome.findElement(buttonBackHome);
    }

    public CheckoutCompletePage(WebDriver browserChrome) {
        super(browserChrome);
    }
}


