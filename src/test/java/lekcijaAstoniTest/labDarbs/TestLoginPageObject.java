package lekcijaAstoniTest.labDarbs;

import lekcijaAstoni.pageObjectsHomework.LoginPage;
import lekcijaAstoni.pageObjectsHomework.ProductsPage;
import lekcijaSeptiniTest.labDarbs.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class TestLoginPageObject extends BaseTest {

    @Test
    public void testCorrectLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(browserChrome);
        productsPage.getLinkedInButton().click();

        // pārslēgšanās starp tabiem
        ArrayList<String> tabs = new ArrayList<>(browserChrome.getWindowHandles());
        System.out.println("Tabu skaits: " + tabs.size());
        browserChrome.switchTo().window(tabs.get(1)); // pārslēdz driver uz 2.tabu
        System.out.println(browserChrome.getTitle());
        browserChrome.close();
        browserChrome.switchTo().window(tabs.get(0)); // pārslēdz driver atpakaļ uz 1.tabu
        System.out.println(browserChrome.getTitle());

        tabs = new ArrayList<>(browserChrome.getWindowHandles()); // nepieciešams, jo Selenium tabu liste ir nomainījusies

        // Javascript palaišana
        ((JavascriptExecutor) browserChrome).executeScript("arguments[0].scrollIntoView(true);", productsPage.getLinkedInButton());
        ((JavascriptExecutor) browserChrome).executeScript("alert('test123')");

        Thread.sleep(2000);
    }

    @Test
    public void testWithoutLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login("", "secret_sauce");
        Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username is required");

        Thread.sleep(1000);
    }

    @Test
    public void testWithoutPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login("locked_out_user", "");
        Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Password is required");

        Thread.sleep(1000);
    }

    @Test
    public void testWithoutLoginPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login("", "");
        Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username is required");

        Thread.sleep(1000);
    }

    @Test
    public void testWrongPassword() throws InterruptedException {
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login("locked_out_user", "WrongPassword");
        Assert.assertEquals(loginPage.getErrorText(),"Epic sadface: Username and password do not match any user in this service");

        Thread.sleep(1000);
    }

    @Test
    public void validateLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login("standard_user", "secret_sauce");
        //loginPage.wait(1000,100);

        ProductsPage productsPage = new ProductsPage(browserChrome);
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");


        Thread.sleep(1000);
    }

    @Test public void actionTest() throws InterruptedException {
        browserChrome.navigate().to("https://www.w3schools.com/howto/howto_css_dropdown.asp");
        browserChrome.findElement(By.id("accept-choices")).click();

        Actions actions = new Actions(browserChrome);
        WebElement moveToHover = browserChrome.findElement(By.cssSelector("div.dropdown2"));
        actions.moveToElement(moveToHover).build().perform();

        WebElement dropdownLink = browserChrome.findElement(By.cssSelector("div.dropdown2 a"));
        actions.click(dropdownLink).build().perform();

        Thread.sleep(3000);
    }

    // Selenium RemoteWebDriver;
    @Test
    public void validateLoginByRemote() throws InterruptedException {
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login("standard_user", "secret_sauce");
        //loginPage.wait(1000,100);

        ProductsPage productsPage = new ProductsPage(browserChrome);
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");

        Thread.sleep(1000);
    }


}
