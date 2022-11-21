package lekcijaDevini.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class ResultsPage extends BasePage {

    private By searchResultList = By.cssSelector("div.b-product--wrap2");

    public List<WebElement> getSearchResultList(){
        return browserChrome.findElements(searchResultList);
    }

    //WebDriver konstruktors
    public ResultsPage(WebDriver browserChrome) {
        super(browserChrome);
    }

}