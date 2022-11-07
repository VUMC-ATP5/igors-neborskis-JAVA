package lekcijaSeptiniTest.labDarbs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestSeleniumFirst {

    static WebDriver browserChrome = new ChromeDriver();
    static int counter;

    @BeforeMethod
    public static void openBrowser(){

        browserChrome.get("https://www.lu.lv");
        //browserChrome.navigate().to("https://www.lu.lv"); //alternatīva 'get'
        browserChrome.manage().window().maximize();
        counter++;
    }

    @AfterMethod
    public static void quitBrowser(){
        browserChrome.quit();
        System.out.println("*** Tests pabeigts ***\n");
    }

    @Test
    public void testFirstWebPage() {
        System.out.println("Selenium tests #" + counter + " - weblapas " + browserChrome.getCurrentUrl() + " Title pārbaude");

        String expectedTitle = "Latvijas Universitāte";
        String actualTitle = browserChrome.getTitle();
        System.out.println("Sagaidāmais rezultāts: " + expectedTitle + " ; aktuālais rezultāts: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle);
    }

}
