package lekcijaSesiTest.majasDarbs;

import lekcijaSesi.majasDarbs.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCalculator {

    int counter = 1;
    Calculator calculator = new Calculator();

    @Test
    public void testCalculatorAdd() {
        System.out.println("\nTEST #" + counter + " - 'Calculator' tests - ADD");

        Assert.assertEquals(calculator.add(4,5), 9);
        Assert.assertEquals(calculator.add(0,0), 0);
        Assert.assertEquals(calculator.add(10,-5), 5);
        Assert.assertEquals(calculator.add(-5,-5), -10);
        Assert.assertEquals(calculator.add(-5,5), 0);
        counter++;
    }

    @Test
    public void testCalculatorSubstract() {
        System.out.println("\nTEST #" + counter + " - 'Calculator' tests - SUBSTRACT");

        Assert.assertEquals(calculator.substract(4,5), -1);
        Assert.assertEquals(calculator.substract(0,0), 0);
        Assert.assertEquals(calculator.substract(5,2),3);
        Assert.assertEquals(calculator.substract(-2,-3),1);
        Assert.assertEquals(calculator.substract(-2,3),-5);
        counter++;
    }

    @Test
    public void testCalculatorMultiply() {
        System.out.println("\nTEST #" + counter + " - 'Calculator' tests - MULTIPLY");

        Assert.assertEquals(calculator.multiply(4,5), 20);
        Assert.assertEquals(calculator.multiply(0,0), 0);
        Assert.assertEquals(calculator.multiply(-5,2),-10);
        Assert.assertEquals(calculator.multiply(-2,-3),6);
        Assert.assertEquals(calculator.multiply(-2,0),0);
        counter++;
    }

    @Test
    public void testCalculatorDivide() {
        System.out.println("\nTEST #" + counter + " - 'Calculator' tests - DIVIDE");

        Assert.assertEquals(calculator.divide(10,5), 2);
        Assert.assertEquals(calculator.divide(10,1), 10);
        Assert.assertEquals(calculator.divide(0,10),0);
        Assert.assertEquals(calculator.divide(-10,10),-1);
        Assert.assertEquals(calculator.divide(-1000,-1000),1);
        Assert.assertEquals(calculator.divide(1,10), 0.1);
        Assert.assertEquals(calculator.divide(2,8), 0.25);
        counter++;
    }
}