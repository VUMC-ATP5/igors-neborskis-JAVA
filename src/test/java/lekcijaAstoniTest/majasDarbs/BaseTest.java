package lekcijaAstoniTest.majasDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {

    public WebDriver browserChrome;
    static int counter;

    @BeforeMethod
    public void openBrowser(){

        browserChrome = new ChromeDriver();
        browserChrome.get("https://www.saucedemo.com");
        browserChrome.manage().window().maximize();
        counter++;
    }

    @AfterMethod
    public void quitBrowser(){
        browserChrome.quit();
        System.out.println("*** Tests pabeigts ***\n");
    }

}
