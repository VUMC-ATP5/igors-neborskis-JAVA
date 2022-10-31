package lekcijaSesiTest.labDarbs;

import lekcijaCetri.labDarbs.Circle;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCircle {

    int counter = 1;

    @Test
    public void testCirlceSquare(){
        System.out.println("TEST #" + counter + " - riņķa laukuma pārbaude");
        Circle circle1 = new Circle(4.5);

        // expectedResult - sagaidāmais rezultāts
        // actualResult - reālais rezultāts

        double expectedArea = 64.0;
        double actualArea = circle1.cirlceSquare();

        Assert.assertEquals(actualArea, expectedArea);

        counter++;
    }

    @Test
    public void testCircleLenght(){
        System.out.println("TEST #" + counter + " - riņķa līnijas garuma pārbaude");
        Circle circle2 = new Circle(5);
        double expectedLenght = 31.0;
        double actualLenght = circle2.circleLenght();

        Assert.assertEquals(expectedLenght, actualLenght);
        counter++;
    }

    @Test
    public void testCircleLenght2(){
        System.out.println("TEST #" + counter + " - riņķa līnijas garuma pārbaude");
        Circle circle3 = new Circle(0);
        double expectedLenght = 0;
        double actualLenght = circle3.circleLenght();

        Assert.assertEquals(expectedLenght, actualLenght);
        counter++;
    }

    @Test
    public void testCircleLenght3(){
        System.out.println("TEST #" + counter + " - riņķa līnijas garuma pārbaude");
        Circle circle2 = new Circle(5);
        double expectedLenght = 31.0;
        double actualLenght = circle2.circleLenght();

        Assert.assertEquals(expectedLenght, actualLenght);
        counter++;
    }

    @Test
    public void testCircleLenght4(){
        testCircleLenghtMethod(5,31);
        testCircleLenghtMethod(4,25);
        testCircleLenghtMethod(0,0);
        counter++;
    }

    private void testCircleLenghtMethod(double r, double expectedLenght){
        System.out.println("TEST #" + counter + " - riņķa līnijas garuma pārbaude");
        Circle circle4 = new Circle(r);
        double actualLenght = circle4.circleLenght();

        Assert.assertEquals(expectedLenght, actualLenght);
        counter++;
    }

}
