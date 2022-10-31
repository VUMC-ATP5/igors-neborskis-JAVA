package lekcijaPieci.majasDarbs;

public class LekcijaPieciMajasdarbs {
    public static void main(String[] args) {

        System.out.println("\n***** UZDEVUMS #1 - Cilindri *****");

        Cilindrs cilindrs1 = new Cilindrs();
        cilindrs1.setRadiuss(3);
        cilindrs1.setAugstums(7);
        System.out.println("Cilindra rādiuss ir " + cilindrs1.getRadiuss());
        System.out.println("Cilindra augstums ir " + cilindrs1.getAugstums());
        cilindrs1.cilindraLaukums();
        cilindrs1.cilindraTilpums();

        Cilindrs cilindrs2 = new Cilindrs(5,3);
        System.out.println("Cilindra rādiuss ir " + cilindrs2.getRadiuss());
        System.out.println("Cilindra augstums ir " + cilindrs2.getAugstums());
        cilindrs2.cilindraLaukums();
        cilindrs2.cilindraTilpums();
    }
}
