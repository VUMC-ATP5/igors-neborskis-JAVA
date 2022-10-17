package lekcijaCetri.labDarbs;

public class Cat {
    String suga;
    int gadi;
    boolean vaiIzsalcis = true;
    String vards;

    public void feedCat(Fish zivs){
        if (zivs.species.equals("Reņģe")){
            System.out.println("Kaķim nepatīk šī zivs...");
        } else {
            System.out.println("Kaķis apēda " + zivs.species);
            vaiIzsalcis = false;
        }
    }

    public void printKakis() {
        System.out.println("Kakis{" +
                "suga='" + suga + '\'' +
                ", gadi=" + gadi +
                ", vaiIzsalcis=" + vaiIzsalcis +
                ", vards='" + vards + '\'' +
                '}');
    }
}
