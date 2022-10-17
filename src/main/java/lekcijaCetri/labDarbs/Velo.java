package lekcijaCetri.labDarbs;

import java.util.Date;

public class Velo {
    String model;
    String size;
    int wheelSize;
    int speed = 0;
    Date productionDate;

    // bezargumenta jeb 'no-arg' konstruktors Velo()
    // tiek piešķirtas vērtības katram jaunam konstruktoram
    Velo(){
        System.out.println("Taisām Jaunu VELO!!!!!");
        productionDate = new Date();
        System.out.println("Velo izgatavošanas datums: " + productionDate);
    }

    // parametrizēts konstruktors
    Velo(String model, String size, int wheelSize, int speed){
        System.out.println("Taisām Jaunu VELO!!!!!");
        productionDate = new Date();
        System.out.println("Velo izgatavošanas datums: " + productionDate);
        this.model = model;
        this.size = size;
        this.wheelSize = wheelSize;
        this.speed = speed;
    }

    public void printSpeed(){
        System.out.println(model + "Velo ātrums ir " + speed);
    }

    public void speedUp(int x){
        speed = speed + x;
        System.out.println(model + "Velo pāatrinās. Ātrums ir " + speed);
    }

    public void speedDown(int y){
        if (speed <= y){
            speed = 0;
            System.out.println("Ātrums jau tā ir 0!");
        } else {
            speed = speed - y;
        }
        System.out.println(model + "Velo bremzē. Ātrums ir " + speed);
    }

}
