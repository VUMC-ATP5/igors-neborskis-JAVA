package lekcijaAstoniTest.seleniumHomework;

import lekcijaAstoni.pageObjectsHomework.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SauceDemoTestsScenarioOne extends BaseTest{
    @Test
    public void testAddProduct() throws InterruptedException {

        //LoginPage
        System.out.println("STEP #" + counter + " - 'Login page'. Correct log in and navigate to 'Products page'");
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login(loginStandardUser, passwordCorrect);
        counter++;
//        Thread.sleep(1000);

        //ProductsPage
        System.out.println("STEP #" + counter + " - 'Products page'. Add 2 products (backpack & jacket) to cart and navigate to 'Cart page'");
        ProductsPage productsPage = new ProductsPage(browserChrome);
        wait.until(ExpectedConditions.visibilityOf(productsPage.getPageTitle()));
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");
        productsPage.getAddToCartBackpack().click();
        productsPage.getAddToCartJacket().click();
        productsPage.getButtonShoppingCart().click();
        String expectedProductNameBackpack = productsPage.getProductNameBackpack();
        String expectedProductNameJacket = productsPage.getProductNameJacket();
        Assert.assertEquals(productsPage.getProductCountBadge(),"2");
        counter++;
//        Thread.sleep(1000);

        //CartPage
        System.out.println("STEP #" + counter + " - 'Cart page'. Validate products (backpack & jacket) in cart and navigate to 'Checkout page'");
        CartPage cartPage = new CartPage(browserChrome);
        Assert.assertEquals(cartPage.getPageTitle().getText(),"YOUR CART");
        Assert.assertEquals(cartPage.getProductNameBackpack(),expectedProductNameBackpack);
        Assert.assertEquals(cartPage.getProductNameJacket(),expectedProductNameJacket);
        Assert.assertEquals(cartPage.getProductCountBadge(),"2");
        cartPage.getButtonCheckout().click();
        counter++;
//        Thread.sleep(1000);

        //CheckoutPage
        System.out.println("STEP #" + counter + " - 'Checkout page'. Fill requested fields (first name, last name & postal code) and navigate to 'Checkout Overview page'");
        CheckoutPage checkoutPage = new CheckoutPage(browserChrome);
        Assert.assertEquals(checkoutPage.getPageTitle().getText(),"CHECKOUT: YOUR INFORMATION");
        checkoutPage.fillCheckoutFields(firstName, lastName, postalCode);
        counter++;
//        Thread.sleep(1000);

        //CheckoutOverviewPage
        System.out.println("STEP #" + counter + " - 'Checkout Overview page'. Validate products (backpack & jacket) in cart and finish order");
        CheckoutOverviewPage checkoutOverviewPage = new CheckoutOverviewPage(browserChrome);
        Assert.assertEquals(checkoutOverviewPage.getPageTitle().getText(),"CHECKOUT: OVERVIEW");
        Assert.assertEquals(checkoutOverviewPage.getProductNameBackpack(),expectedProductNameBackpack);
        Assert.assertEquals(checkoutOverviewPage.getProductNameJacket(),expectedProductNameJacket);
        Assert.assertEquals(checkoutOverviewPage.getProductCountBadge(),"2");
        checkoutOverviewPage.getButtonFinish().click();
        counter++;
//        Thread.sleep(1000);

        //CheckoutCompletePage
        System.out.println("STEP #" + counter + " - 'Checkout Complete page'. Validate order complete and navigate back to 'Products page'");
        CheckoutCompletePage checkoutCompletePage = new CheckoutCompletePage(browserChrome);
        Assert.assertEquals(checkoutCompletePage.getCompleteMessage().getText(),"THANK YOU FOR YOUR ORDER");
        checkoutCompletePage.getButtonBackHome().click();
        counter++;
//        Thread.sleep(1000);

        //Test end - navigate to ProductsPage
        System.out.println("STEP #" + counter + " - 'Products page'. Validate navigation to 'Products page' and TEST FINISH");
        wait.until(ExpectedConditions.visibilityOf(productsPage.getPageTitle()));
        Assert.assertEquals(productsPage.getPageTitle().getText(),"PRODUCTS");
        System.out.println(ANSI_GREEN + "*** SUCCESS ***" + ANSI_RESET);
    }
}
