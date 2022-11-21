package lekcijaDevini.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BasePage {
    WebDriver browserChrome;
    WebDriverWait wait;

    public BasePage(WebDriver browserChrome) {
        this.browserChrome = browserChrome;
        wait = new WebDriverWait(browserChrome, Duration.ofSeconds(10));
    }

}
