package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage {

    private By firstName = By.id("first-name");
    private By lastName = By.id("last-name");
    private By postalCode = By.id("postal-code");
    private By continueButton = By.id("continue");
    private By errorMessage = By.cssSelector("div.error-message-container h3");

    public WebElement getFirstName(){
        return browserChrome.findElement(firstName);
    }
    public WebElement getLastName(){
        return browserChrome.findElement(lastName);
    }
    public WebElement getPostalCode(){
        return browserChrome.findElement(postalCode);
    }
    public WebElement getContinueButton(){
        return browserChrome.findElement(continueButton);
    }

    public WebElement getErrorMessage(){
        return browserChrome.findElement(errorMessage);
    }



    public void fillCheckoutFields(String firstName, String lastName, String postalCode) throws InterruptedException {
        getFirstName().sendKeys(firstName);
        getLastName().sendKeys(lastName);
        getPostalCode().sendKeys(postalCode);
        Thread.sleep(3000);
        getContinueButton().click();
    }
    public CheckoutPage(WebDriver browserChrome) {
        super(browserChrome);
    }


}
