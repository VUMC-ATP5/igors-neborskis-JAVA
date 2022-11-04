package lekcijaSesi.majasDarbs;

public class Calculator {
    int result;
    float resultDivideFloat;

    //Method for addition
    public int add(int num1, int num2){
        result = num1+num2;
        System.out.println(num1 + " + " + num2 + " = " + result);
        return result;
    }
    //Method for subtraction
    public int substract(int num1, int num2){
        result = num1-num2;
        System.out.println(num1 + " - " + num2 + " = " + result);
        return result;
    }
    //Method for multiplication
    public int multiply(int num1, int num2){
        result = num1*num2;
        System.out.println(num1 + " * " + num2 + " = " + result);
        return result;
    }
    //Method for division
    public double divide(double num1, double num2){
        resultDivideFloat = (float) (num1/num2);
        double resultDivideDouble = Double.valueOf(String.valueOf(resultDivideFloat));
        System.out.println(num1 + " / " + num2 + " = " + resultDivideDouble);
        return resultDivideDouble;
    }
}