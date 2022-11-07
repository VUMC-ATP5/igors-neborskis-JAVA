package lekcijaSeptiniTest.labDarbs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestSauceDemoLogin extends BaseTest{

    WebDriver browserChrome;
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

    @Test
    public void testRightLogin() throws InterruptedException {
        System.out.println("Selenium tests #" + counter + " - weblapas " + browserChrome.getCurrentUrl() + " pareiza login pārbaude");

        WebElement loginField = browserChrome.findElement(By.id("user-name"));
        loginField.sendKeys("standard_user");

        WebElement passwordField = browserChrome.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        WebElement loginButton = browserChrome.findElement(By.id("login-button"));
        loginButton.click();

        Thread.sleep(1000);
    }

    @Test
    public void testWrongLogin() throws InterruptedException {

        System.out.println("Selenium tests #" + counter + " - weblapas " + browserChrome.getCurrentUrl() + " nepareiza login pārbaude");

        WebElement loginField = browserChrome.findElement(By.id("user-name"));
        loginField.sendKeys("standard_user");

        WebElement passwordField = browserChrome.findElement(By.id("password"));
        passwordField.sendKeys("secret_sausage");

        WebElement loginButton = browserChrome.findElement(By.id("login-button"));
        loginButton.click();

        WebElement errorMessage = browserChrome.findElement(By.cssSelector("div.error-message-container h3"));
        String expectedText = "Epic sadface: Username and password do not match any user in this service";
        Assert.assertEquals(errorMessage.getText(), expectedText);

        Thread.sleep(1000);
    }

    @Test
    public void testCorrectLogin() throws InterruptedException {

        System.out.println("Selenium tests #" + counter + " - weblapas " + browserChrome.getCurrentUrl() + " pareiza login pārbaude");
        userLoginAndPassword("performance_glitch_user", "secret_sauce");

        Thread.sleep(1000);
    }

    @Test
    public void testWithoutLogin() throws InterruptedException {

        System.out.println("Selenium tests #" + counter + " - weblapas " + browserChrome.getCurrentUrl() + " tukša login lauka pārbaude");
        userLoginAndPassword("", "secret_sauce");
        validateErrorMessage("Epic sadface: Username is required");

        Thread.sleep(1000);
    }

    @Test
    public void testWithoutPassword() throws InterruptedException {

        System.out.println("Selenium tests #" + counter + " - weblapas " + browserChrome.getCurrentUrl() + " tukša paroles lauka pārbaude");
        userLoginAndPassword("problem_user", "");
        validateErrorMessage("Epic sadface: Password is required");

        Thread.sleep(1000);
    }

    @Test
    public void testEmptyLoginAndPassword() throws InterruptedException {

        System.out.println("Selenium tests #" + counter + " - weblapas " + browserChrome.getCurrentUrl() + " tukšu login un paroles un lauku pārbaude");
        userLoginAndPassword("", "");
        validateErrorMessage("Epic sadface: Username is required");

        Thread.sleep(1000);
    }

    // metodes
    private void userLoginAndPassword(String login, String password){

        WebElement loginField = browserChrome.findElement(By.id("user-name"));
        loginField.sendKeys(login);

        WebElement passwordField = browserChrome.findElement(By.id("password"));
        passwordField.sendKeys(password);

        pressLoginButton();
    }

    private void validateErrorMessage(String expectedText){
        WebElement errorMessage = browserChrome.findElement(By.cssSelector("div.error-message-container h3"));
        Assert.assertEquals(errorMessage.getText(), expectedText);
    }

    private void pressLoginButton(){
        WebElement loginButton = browserChrome.findElement(By.id("login-button"));
        loginButton.click();
    }


}
