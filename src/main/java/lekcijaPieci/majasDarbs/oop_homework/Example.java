package lekcijaPieci.majasDarbs.oop_homework;

import com.github.javafaker.Faker;

public class Example {
    public static void main(String[] args) {
        System.out.println("\n***** extraUZDEVUMS #2 - Atlaižu sistēma *****");

        // Customer customer = new Customer (String name, boolean member, String memberType) - pircēja konstruktors
        // customer.visit (double productExpense, double serviceExpense) - vizītes izmaksu iestatīšana
        // iespējamie atlaižu līmeņi - PREMIUM, GOLD, SILVER. Viss pārējais netiek uzskatīts
        // prepareCheck() - čeka drukāšana

        Faker faker = new Faker();
        faker.superhero().name();

        Customer customer1 = new Customer(faker.superhero().name(), true,"PREMIUM");
        System.out.println(customer1.toString());
        customer1.visit(400,200);
        customer1.prepareCheck();

        Customer customer2 = new Customer(faker.superhero().name(), true, "GOLD");
        System.out.println(customer2.toString());
        customer2.visit(300,150);
        customer2.prepareCheck();

        Customer customer3 = new Customer(faker.superhero().name(), true, "SILVER");
        System.out.println(customer3.toString());
        customer3.visit(200,100);
        customer3.prepareCheck();

        Customer customer4 = new Customer(faker.superhero().name(), false, "N/A");
        System.out.println(customer4.toString());
        customer4.visit(100,50);
        customer4.prepareCheck();

    }

}
