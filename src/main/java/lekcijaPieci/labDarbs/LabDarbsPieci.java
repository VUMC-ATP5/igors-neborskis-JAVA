package lekcijaPieci.labDarbs;

public class LabDarbsPieci {
    public static void main(String[] args) {

        Cat Milka = new Cat();
        Dog Reksis = new Dog(5);
        Cow Gauja = new Cow();
        Fish Menca = new Fish();

        Milka.age = 12;
        Milka.name = "Milka";
        Milka.canClimbTrees = true;
        Milka.breathe();
        Milka.makeSound();
        Milka.sharpenClaws();
        System.out.println("Kaķa " + Milka.name + " vecums ir " + Milka.age + " gadi.");
        Milka.printClimbing();

//        Reksis.age = 7;
        Reksis.name = "Reksis";
        Reksis.breathe();
        Reksis.makeSound();
        Reksis.growl();
        System.out.println("Suņa " + Reksis.name + " vecums ir " + Reksis.age + " gadi.");

        Gauja.name = "Gauja";
        Gauja.breathe();
        Gauja.makeSound(); //override - jo klasē 'Cow' nav definēts 'makeSound',
            // tāpēc tas tiek ņemts no 'Animal'

        Menca.name = "Menca";
        Menca.breathe();

        // IEKAPSULĒŠANA
        System.out.println("\n\n***** IEKAPSULĒŠANA *****");

            // klase var būt tikai 'public' vai 'default' (package-private)
            // 'private' atļauj piekļūt tikai klases ietvaros

        House maja1 = new House(2,150,7.3,15,7.5,"Silmaļu 17","kieģeļu", 930000, 980, false );

        maja1.printHouse();
        System.out.println("Cena par m2 ir: " + maja1.getHousePricePerMeter());

        maja1.setHousePricePerMeter(1500);
        maja1.printHouse();
        System.out.println("Cena par m2 ir: " + maja1.getHousePricePerMeter());

        System.out.println(" ");
        Person cilveks1 = new Person("Igors", "Neborskis");
        System.out.println("Vārds: " + cilveks1.getVards());
        System.out.println("Uzvārds: " + cilveks1.getUzvards());
        cilveks1.setVecums(39);
        System.out.println("Vecums: " + cilveks1.getVecums());
        System.out.println("Personas kods: " + cilveks1.getPersonasKods());

        // POLIMORFISMS - dažādas metodes, vienāds nosaukums
        System.out.println("\n\n***** POLIMORFISMS  - dažādas metodes, vienāds nosaukums *****");
        Calculator calculator = new Calculator();
        System.out.println(calculator.add(1,2,3));
        System.out.println(calculator.add(1,2));
        System.out.println(calculator.add(1,5.5));

        // STATIKA
        System.out.println("\n\n***** STATIKA *****");
    }
}
