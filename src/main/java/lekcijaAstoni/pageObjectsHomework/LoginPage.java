package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

    WebDriver browserChrome;

    private By usernameInputField = By.id("user-name");
    private By passwordInputField = By.id("password");
    private By loginButton = By.id("login-button");
    private By errorMessage = By.cssSelector("div.error-message-container h3");


    public WebElement getUsernameInputField() {
        return browserChrome.findElement(usernameInputField);
    }

    public WebElement getPasswordInputField() {
        return browserChrome.findElement(passwordInputField);
    }

    public WebElement getLoginButton() {
        return browserChrome.findElement(loginButton);
    }

    public WebElement getErrorMessage() {
        return browserChrome.findElement(errorMessage);
    }

    public String getErrorText(){
        return browserChrome.findElement(errorMessage).getText();
    }

    public void login(String username, String password) throws InterruptedException {
        getUsernameInputField().sendKeys(username);
        getPasswordInputField().sendKeys(password);
        getLoginButton().click();
        Thread.sleep(5000);
    }

    public LoginPage(WebDriver browserChrome) {
        this.browserChrome = browserChrome;
    }
}
