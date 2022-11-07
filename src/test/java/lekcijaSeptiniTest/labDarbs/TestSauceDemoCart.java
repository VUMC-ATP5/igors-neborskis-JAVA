package lekcijaSeptiniTest.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSauceDemoCart extends BaseTest {

    @Test
    public void testEmptyLoginAndPassword() throws InterruptedException {

        System.out.println("Selenium tests #" + counter + " - weblapas " + browserChrome.getCurrentUrl() + " preces pievienošana");
        userLoginAndPassword();
        validateLogin();
        addToCart("Sauce Labs Backpack");


        Thread.sleep(3000);
    }

    // metodes
    private void userLoginAndPassword(){

        WebElement loginField = browserChrome.findElement(By.id("user-name"));
        loginField.sendKeys("standard_user");

        WebElement passwordField = browserChrome.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        pressLoginButton();
    }

    private void validateErrorMessage(String expectedText){
        WebElement errorMessage = browserChrome.findElement(By.cssSelector("div.error-message-container h3"));
        Assert.assertEquals(errorMessage.getText(), expectedText);
    }

    private void validateLogin(){
        WebElement productPageTitle = browserChrome.findElement(By.cssSelector("span.title"));
        Assert.assertEquals(productPageTitle.getText(), "PRODUCTS");
    }

    private void addToCart(String productName){
        WebElement productAdd = browserChrome.findElement(By.cssSelector("div.inventory_item_name")).findElement(By.partialLinkText(productName));
    }

    private void pressLoginButton(){
        WebElement loginButton = browserChrome.findElement(By.id("login-button"));
        loginButton.click();
    }


}
