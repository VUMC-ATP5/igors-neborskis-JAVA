package lekcijaAstoniTest.seleniumHomework;

import com.github.javafaker.Faker;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {

    // Declare colors
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";

    // Initialize WebDriver
    public static WebDriver browserChrome;
    WebDriverWait wait;

    // Create and define Faker
    Faker faker = new Faker();
    String firstName = faker.name().firstName();
    String lastName = faker.name().lastName();
    String postalCode = faker.address().zipCode();

    // Variables for 'saucedemo.com' page
    String loginStandardUser = "standard_user";
    String passwordCorrect = "secret_sauce";
    String testURL = "https://www.saucedemo.com";

    // Other variables
    protected static int counter;

    @BeforeTest
    public void setupBefore(){
        System.out.println(ANSI_GREEN + "*** TEST STARTED ***\n" + ANSI_RESET);
        System.out.println(ANSI_YELLOW + "Testing page: " + testURL + ANSI_RESET);

        System.setProperty("webdriver.chrome.silentOutput", "true");
    }

    @BeforeMethod
    public void openBrowser(){

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized"); // open Browser in maximized mode
        //options.addArguments("--headless");
        options.addArguments("--disable-logging");
        options.addArguments("--log-level=3");
        //options.addArguments("--disable-infobars"); // disabling infobars
        //options.addArguments("--disable-extensions"); // disabling extensions
        //options.addArguments("--disable-gpu"); // applicable to windows os only
        //options.addArguments("--disable-dev-shm-usage"); // overcome limited resource problems
        options.addArguments("--no-sandbox"); // Bypass OS security model
        this.browserChrome = new ChromeDriver(options);

        wait = new WebDriverWait(browserChrome, Duration.ofSeconds(10));
        browserChrome.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        browserChrome.get(testURL);
        counter++;
    }

    @AfterMethod
    public void quitBrowser(){
        browserChrome.quit();
        System.out.println(ANSI_GREEN + "*** TEST FINISHED ***\n" + ANSI_RESET);
    }
}
