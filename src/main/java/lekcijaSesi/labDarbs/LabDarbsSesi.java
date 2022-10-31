package lekcijaSesi.labDarbs;

import com.github.javafaker.Faker;

public class LabDarbsSesi {
    public static void main(String[] args) {
        Faker faker = new Faker();

        String name = faker.name().fullName(); // Miss Samanta Schmidt
        String firstName = faker.name().firstName(); // Emory
        String lastName = faker.name().lastName(); // Barton
        String streetAddress = faker.address().streetAddress(); // 60018 Sawayn Brooks Suite 449
        String animalName = faker.animal().name();

        System.out.println(name);
        System.out.println(lastName);
        System.out.println(animalName);
        System.out.println(streetAddress);

        System.out.println(" ");
        System.out.println(faker.harryPotter().character());

        System.out.println(" ");
        for (int i = 0; i < 10; i++){
            System.out.println(faker.aviation().aircraft());
        }

        System.out.println(" ");
        System.out.println(faker.address().streetName());
        System.out.println(faker.phoneNumber().phoneNumber());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.name().lastName());
        System.out.println(faker.chuckNorris().fact());

    }
}
