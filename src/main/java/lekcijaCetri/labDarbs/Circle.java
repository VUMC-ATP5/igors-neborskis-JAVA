package lekcijaCetri.labDarbs;

public class Circle {
    double r;
    double PI = Math.PI;
    String circleName;

    public Circle(double r) {
        this.r = r;
    }

    public double cirlceSquare (){
        return Math.round(r*r*PI);
    }

    public double circleLenght (){
        return Math.round(2*PI*r);
    }
}
