package lekcijaPieci.labDarbs;

public class Dog extends Animal{

    public void makeSound(){
        System.out.println("Vau!");
    }

    public void growl(){
        System.out.println(name + " rūc...");
    }

    public Dog(int age) {
        super.age = age; // 'super' - ņem no super klases
    }
}
