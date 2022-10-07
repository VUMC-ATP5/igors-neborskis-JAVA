package lekcijaDivi.majasDarbs;

public class PrintBusinessCard {
    public static void printBusinessCard(){
        String name = "Igors";
        String surname = "Ņeborskis";
        String phone = "+371 .....";
        int birthYear = 1983;

        System.out.println("\nVizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Tālr.: " + phone);
        System.out.println("Dzimšanas gads: " + birthYear);
    }
}
