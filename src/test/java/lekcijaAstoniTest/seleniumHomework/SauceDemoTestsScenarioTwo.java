package lekcijaAstoniTest.seleniumHomework;

import lekcijaAstoni.pageObjectsHomework.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoTestsScenarioTwo extends BaseTest {

    @Test
    public void testMandatoryFirstName() throws InterruptedException {
        System.out.println("TEST #" + counter + " - CheckoutPage. Validate that 'First Name' field is mandatory");

        //LoginPage
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login(loginStandardUser, passwordCorrect);

        //ProductsPage
        ProductsPage productsPage = new ProductsPage(browserChrome);
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");
        productsPage.getButtonShoppingCart().click();
        Thread.sleep(500);

        //CartPage
        CartPage cartPage = new CartPage(browserChrome);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        cartPage.getButtonCheckout().click();

        //CheckoutPage
        CheckoutPage checkoutPage = new CheckoutPage(browserChrome);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutPage.fillCheckoutFields("", lastName, postalCode);
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: First Name is required");
        Thread.sleep(500);
    }

    @Test
    public void testMandatoryLastName() throws InterruptedException {
        System.out.println("TEST #" + counter + " - CheckoutPage. Validate that 'Last Name' field is mandatory");

        //LoginPage
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login(loginStandardUser, passwordCorrect);

        //ProductsPage
        ProductsPage productsPage = new ProductsPage(browserChrome);
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");
        productsPage.getButtonShoppingCart().click();
        Thread.sleep(500);

        //CartPage
        CartPage cartPage = new CartPage(browserChrome);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        cartPage.getButtonCheckout().click();

        //CheckoutPage
        CheckoutPage checkoutPage = new CheckoutPage(browserChrome);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutPage.fillCheckoutFields(firstName, "", postalCode);
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: Last Name is required");
        Thread.sleep(500);
    }

    @Test
    public void testMandatoryPostal() throws InterruptedException {
        System.out.println("TEST #" + counter + " - CheckoutPage. Validate that 'Postal Code' field is mandatory");

        //LoginPage
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login(loginStandardUser, passwordCorrect);

        //ProductsPage
        ProductsPage productsPage = new ProductsPage(browserChrome);
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");
        productsPage.getButtonShoppingCart().click();
        Thread.sleep(500);

        //CartPage
        CartPage cartPage = new CartPage(browserChrome);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        cartPage.getButtonCheckout().click();

        //CheckoutPage
        CheckoutPage checkoutPage = new CheckoutPage(browserChrome);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutPage.fillCheckoutFields(firstName, lastName, "");
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: Postal Code is required");
        Thread.sleep(500);
    }

    @Test
    public void testMandatoryCheckAll() throws InterruptedException {
        System.out.println("TEST #" + counter + " - CheckoutPage. Validate that all three fields are mandatory");

        //LoginPage
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login(loginStandardUser, passwordCorrect);

        //ProductsPage
        ProductsPage productsPage = new ProductsPage(browserChrome);
        wait.until(ExpectedConditions.visibilityOf(productsPage.getPageTitle()));
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");
        productsPage.getButtonShoppingCart().click();
        Thread.sleep(500);

        //CartPage
        CartPage cartPage = new CartPage(browserChrome);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        cartPage.getButtonCheckout().click();

        //CheckoutPage
        CheckoutPage checkoutPage = new CheckoutPage(browserChrome);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutPage.fillCheckoutFields("", "", "");
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: First Name is required");
        Thread.sleep(500);
        checkoutPage.fillCheckoutFields(firstName, "", "");
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: Last Name is required");
        Thread.sleep(500);
        browserChrome.navigate().refresh();
        checkoutPage.fillCheckoutFields(firstName, lastName, "");
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: Postal Code is required");
        Thread.sleep(500);
        browserChrome.navigate().refresh();
        checkoutPage.fillCheckoutFields(firstName, lastName, postalCode);
        Thread.sleep(500);

        //CheckoutOverviewPage
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(browserChrome);
        Assert.assertEquals(checkoutOverviewPage.getPageTitle().getText(),"CHECKOUT: OVERVIEW");
    }

}
