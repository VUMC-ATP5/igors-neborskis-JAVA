package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class CartPage extends BasePage{

    private By buttonCheckout = By.id("checkout");
    private By productNameBackpack = By.id("item_4_title_link");
    private By productNameJacket = By.id("item_5_title_link");
    private By productCountBadge = By.className("shopping_cart_badge");


    public WebElement getButtonCheckout(){
        wait.until(ExpectedConditions.elementToBeClickable(buttonCheckout));
        return browserChrome.findElement(buttonCheckout);
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
       super(browserChrome);
    }


}
