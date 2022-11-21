package lekcijaDeviniTest;

import lekcijaDevini.pageObjects.MainPage;
import lekcijaDevini.pageObjects.ResultsPage;
import lekcijaDevini.pageObjects.SignInModal;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BarboraTest extends BaseTest{

    @Test
    public void testSearchFunctionality() throws InterruptedException {

        System.out.println("STEP #" + counter + " - MainPage: meklētājā tiek ievadīts produkts");
        MainPage mainPage = new MainPage(browserChrome);
        mainPage.searchProduct("banāni");
        int expectedResult = 8;
        counter++;
        Thread.sleep(1000);


        System.out.println("STEP #" + counter + " - ResultsPage:");
        ResultsPage resultsPage = new ResultsPage(browserChrome);
        List<WebElement> searchResultList = resultsPage.getSearchResultList();
        System.out.println("    - Atrasto produktu skaits: " + searchResultList.size());
        System.out.println("    - Sagaidāmais rezultāts: " + expectedResult);
        Assert.assertEquals(searchResultList.size(), expectedResult);
        counter++;
        Thread.sleep(1000);

        int productCounter = 1;
        for (WebElement webElement : searchResultList) {
            System.out.println("\nProdukts #" + productCounter);
            System.out.println(webElement.getText());
            productCounter++;
        }

    }

    @Test
    public void testRegistrationWindowClosesCorrectly() throws InterruptedException {
        System.out.println("STEP #" + counter + " - MainPage: tiek atvērts logs 'Ienākt'");
        MainPage mainPage = new MainPage(browserChrome);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("b-mui-carousel--placeholder")));
        mainPage.buttonLogin().click();

        counter++;
        Thread.sleep(1000);

        System.out.println("STEP #" + counter + " - SignInModal: tiek nospiesta aizvērt poga");
        SignInModal signInModal = new SignInModal(browserChrome);
        signInModal.waitForSignInModalAppears();
        Thread.sleep(1000);
        signInModal.closeModalWindow();
        counter++;
        Thread.sleep(1000);

        System.out.println("STEP #" + counter + " - SignInModal: pārbaude vai SignModal ir aizvērts");
        signInModal.waitForSignInModalToDisappear();
        Assert.assertEquals(signInModal.getModalWindow().size(),0);

    }
}
