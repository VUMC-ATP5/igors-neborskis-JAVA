package lekcijaDevini.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class MainPage extends BasePage {

    private By searchBar = By.cssSelector("header.b-header input.b-search");
    private By loginButton = By.id("fti-header-login");


    public void searchProduct(String productName){
        browserChrome.findElement(searchBar).sendKeys(productName);
        browserChrome.findElement(searchBar).sendKeys(Keys.ENTER);
    }

    public WebElement buttonLogin(){
        return browserChrome.findElement(loginButton);
    }




    //WebDriver konstruktors
    public MainPage(WebDriver browserChrome) {
        super(browserChrome);
    }

}
