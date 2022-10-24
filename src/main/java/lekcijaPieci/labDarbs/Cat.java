package lekcijaPieci.labDarbs;

public class Cat extends Animal {

    public void makeSound(){
            System.out.println("Ņau!");
        }

        public void sharpenClaws(){
            System.out.println(name + " asina nagus...");
        }

        public void printClimbing(){
            if (canClimbTrees == true){
                System.out.println(name + " var rāpties kokos...");
            } else {
                System.out.println(name + " nemāk rāpties kokos...");
            }
        }

}
