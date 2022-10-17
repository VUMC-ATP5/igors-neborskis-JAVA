package lekcijaCetri.labDarbs;

public class Velo {
    String model;
    String size;
    int wheelSize;
    int speed = 0;

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
