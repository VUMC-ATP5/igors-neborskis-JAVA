package lekcijaAstoniTest.majasDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseTest {

    public WebDriver browserChrome;
    WebDriverWait wait;
    static int counter;

    @BeforeMethod
    public void openBrowser(){

        browserChrome = new ChromeDriver();
        browserChrome.get("https://www.saucedemo.com");
        browserChrome.manage().window().maximize();
        wait = new WebDriverWait(browserChrome, Duration.ofSeconds(10));
        browserChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        counter++;
    }

    @AfterMethod
    public void quitBrowser(){
        browserChrome.quit();
        System.out.println("*** Tests pabeigts ***\n");
    }

}
