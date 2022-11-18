package lekcijaAstoniTest.labDarbs;

import lekcijaAstoni.pageObjectsHomework.LoginPage;
import lekcijaAstoni.pageObjectsHomework.ProductsPage;
import lekcijaSeptiniTest.labDarbs.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestLoginPageObject extends BaseTest {

    @Test
    public void testCorrectLogin() throws InterruptedException {
        LoginPage loginPage = new LoginPage(browserChrome);
        loginPage.login("locked_out_user", "secret_sauce");

        //        loginPage.getLoginButton().sendKeys("standard_user");
        //        loginPage.getPasswordInputField().sendKeys("secret_sauce");
        //        loginPage.getLoginButton().click();

        Thread.sleep(1000);
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
}
