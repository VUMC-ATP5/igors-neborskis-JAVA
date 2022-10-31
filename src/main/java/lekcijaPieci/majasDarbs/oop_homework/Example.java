package lekcijaPieci.majasDarbs.oop_homework;

public class Example {
    public static void main(String[] args) {
        System.out.println("\n***** extraUZDEVUMS #2 - Atlaižu sistēma *****\n");

        Customer noMember = new Customer("no membership", false, "none");
        Customer premiumMember = new Customer("PREMIUM member", true,"Premium");
        Customer goldMember = new Customer("GOLD member", true, "Gold");
        Customer silverMember = new Customer("SILBER member", true, "Silver");

        System.out.println(noMember.toString());
        System.out.println(premiumMember.toString());
        System.out.println(goldMember.toString());
        System.out.println(silverMember.toString());

        noMember.memberVisit();
    }
}
