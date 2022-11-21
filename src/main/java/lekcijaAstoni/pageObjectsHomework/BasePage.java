package lekcijaAstoni.pageObjectsHomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    WebDriver browserChrome;
    WebDriverWait wait;

    private By pageTitle = By.cssSelector("span.title");

    public BasePage(WebDriver browserChrome) {
        this.browserChrome = browserChrome;
        wait = new WebDriverWait(browserChrome, Duration.ofSeconds(10));
    }

    public WebElement getPageTitle(){
        return browserChrome.findElement(pageTitle);
    }
}
