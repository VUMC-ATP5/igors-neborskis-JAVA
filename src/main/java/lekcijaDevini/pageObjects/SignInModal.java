package lekcijaDevini.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class SignInModal extends BasePage{

    public SignInModal(WebDriver browserChrome) {
        super(browserChrome);
    }

    By modalWindow = By.cssSelector("div.b-login-modal");
    By closeButton = By.cssSelector("div.b-login-modal button.close");


    public List<WebElement> getModalWindow(){
        return browserChrome.findElements(modalWindow);
    }

    public void waitForSignInModalAppears(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(modalWindow));
    }

    public void closeModalWindow(){
        browserChrome.findElement(closeButton).click();
    }

    public void waitForSignInModalToDisappear(){
        wait.until(ExpectedConditions.invisibilityOfElementLocated(modalWindow));
    }
}
