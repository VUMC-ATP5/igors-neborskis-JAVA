package lekcijaSeptiniTest.labDarbs;

import lekcijaCetri.labDarbs.Circle;
import org.testng.Assert;
import org.testng.annotations.*;

public class TestAnnotations {

    int counter = 1;

    @BeforeTest
    public void setupBeforeTest(){
        //System.out.println("Šī metode tiek izpildīta pirms katra testa");
        System.out.println("********** TESTA SĀKUMS **********\n");
    }

    @AfterTest
    public void setupAfterTest(){
        //System.out.println("Šī metode tiek izpildīta pēc katra testa");
        System.out.println("********** TESTA BEIGAS **********");
    }

    @BeforeMethod
    public void setupBeforeMethod(){
        //System.out.println("Šī metode tiek izpildīta pirms katras metodes");
        System.out.println("--- TESTA #" + counter + " SĀKUMS ---");
    }

    @AfterMethod
    public void setupAfterMethod(){
        //System.out.println("Šī metode tiek izpildīta pēc katras metodes");
        System.out.println("--- TESTA #" + counter + " BEIGAS ---");
        System.out.println(" ");
        counter++;
    }

    @Test
    public void testCirlceTwo(){
        System.out.println("Riņķa laukuma pārbaude");
        Circle circle1 = new Circle(4.5);

        // expectedResult - sagaidāmais rezultāts
        // actualResult - reālais rezultāts

        double expectedArea = 64.0;
        double actualArea = circle1.cirlceSquare();

        Assert.assertEquals(actualArea, expectedArea);
    }

    @Test
    public void testCircleLenghtTwo(){
        System.out.println("Riņķa līnijas garuma pārbaude");
        Circle circle2 = new Circle(5);
        double expectedLenght = 31.0;
        double actualLenght = circle2.circleLenght();

        Assert.assertEquals(expectedLenght, actualLenght);
    }

    @Test
    public void testCircleLenght2Two(){
        System.out.println("Riņķa līnijas garuma pārbaude");
        Circle circle3 = new Circle(0);
        double expectedLenght = 0;
        double actualLenght = circle3.circleLenght();

        Assert.assertEquals(expectedLenght, actualLenght);
    }

    @Test
    public void testCircleLenght3Two(){
        System.out.println("Riņķa līnijas garuma pārbaude");
        Circle circle2 = new Circle(5);
        double expectedLenght = 31.0;
        double actualLenght = circle2.circleLenght();

        Assert.assertEquals(expectedLenght, actualLenght);
    }

    @Test
    public void testCircleLenght4Two(){
        testCircleLenghtMethodTwo(5,31);
        testCircleLenghtMethodTwo(4,25);
        testCircleLenghtMethodTwo(0,0);
    }

    private void testCircleLenghtMethodTwo(double r, double expectedLenght){
        System.out.println("Riņķa līnijas garuma pārbaude");
        Circle circle4 = new Circle(r);
        double actualLenght = circle4.circleLenght();

        Assert.assertEquals(expectedLenght, actualLenght);
    }
}
