package lekcijaAstoniTest.majasDarbs;

import lekcijaAstoni.souceDemoPageObjects.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestScenarijsDivi extends BaseTest {

    @Test
    public void testMandatoryFirstName() throws InterruptedException {
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(browserChrome);
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");
        productsPage.getShoppingCartButton().click();
        Thread.sleep(500);

        CartPage cartPage = new CartPage(browserChrome);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        cartPage.getCheckoutButton().click();

        CheckoutPage checkoutPage = new CheckoutPage(browserChrome);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutPage.validateFields("", "Mencis", "LV2132");
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: First Name is required");
        Thread.sleep(500);
    }

    @Test
    public void testMandatoryLastName() throws InterruptedException {
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(browserChrome);
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");
        productsPage.getShoppingCartButton().click();
        Thread.sleep(500);

        CartPage cartPage = new CartPage(browserChrome);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        cartPage.getCheckoutButton().click();

        CheckoutPage checkoutPage = new CheckoutPage(browserChrome);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutPage.validateFields("Jānis", "", "LV2132");
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: Last Name is required");
        Thread.sleep(500);
    }

    @Test
    public void testMandatoryPostal() throws InterruptedException {
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(browserChrome);
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");
        productsPage.getShoppingCartButton().click();
        Thread.sleep(500);

        CartPage cartPage = new CartPage(browserChrome);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        cartPage.getCheckoutButton().click();

        CheckoutPage checkoutPage = new CheckoutPage(browserChrome);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutPage.validateFields("Jānis", "Mencis", "");
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: Postal Code is required");
        Thread.sleep(500);
    }

    @Test
    public void testMandatoryCheckAll() throws InterruptedException {
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login("standard_user", "secret_sauce");

        ProductsPage productsPage = new ProductsPage(browserChrome);
        wait.until(ExpectedConditions.visibilityOf(productsPage.getPageTitle()));
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");
        productsPage.getShoppingCartButton().click();
        Thread.sleep(500);

        CartPage cartPage = new CartPage(browserChrome);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        cartPage.getCheckoutButton().click();

        CheckoutPage checkoutPage = new CheckoutPage(browserChrome);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutPage.validateFields("", "", "");
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: First Name is required");
        Thread.sleep(500);
        checkoutPage.validateFields("Artūrs", "", "");
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: Last Name is required");
        Thread.sleep(500);
        browserChrome.navigate().refresh();
        checkoutPage.validateFields("Artūrs", "Ranka", "");
        Assert.assertEquals(checkoutPage.getErrorMessage().getText(), "Error: Postal Code is required");
        Thread.sleep(500);
        browserChrome.navigate().refresh();
        checkoutPage.validateFields("Artūrs", "Ranka", "LV2222");
        Thread.sleep(500);

        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(browserChrome);
        Assert.assertEquals(checkoutOverviewPage.getPageTitle().getText(),"CHECKOUT: OVERVIEW");
    }

}
