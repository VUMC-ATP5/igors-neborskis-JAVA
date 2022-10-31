package lekcijaPieci.majasDarbs;

public class Cilindrs {
    private int radiuss;
    private int augstums;
    double laukums, laukumsNoapalots;
    double tilpums, tilpumsNoapalots;
    double pi = Math.PI;

    // arg & no-arg konstruktori
    public Cilindrs(){
        System.out.println("\nCilindrs #1 izveidots ar no-arg konstruktoru");
    }

    public Cilindrs(int radiuss, int augstums){
        System.out.println("\nCilindrs #2 izveidots ar arg konstruktoru");
        this.radiuss = radiuss;
        this.augstums = augstums;
    }

    // setters & getters
    public int getRadiuss() {
        return radiuss;
    }

    public void setRadiuss(int radiuss) {
        this.radiuss = radiuss;
    }

    public int getAugstums() {
        return augstums;
    }

    public void setAugstums(int augstums) {
        this.augstums = augstums;
    }

    // cilindra laukuma un tilpuma aprēķina metodes
    public void cilindraLaukums(){
        laukums = (2 * pi * radiuss) * augstums + 2 * pi * (radiuss * radiuss);
        laukumsNoapalots = Math.round(laukums * 100.00) / 100.00;
        System.out.println("Cilindra laukums ir " + laukumsNoapalots);
    }

    public void cilindraTilpums(){
        tilpums = pi * (radiuss * radiuss) * augstums;
        tilpumsNoapalots = Math.round(tilpums * 100.00) / 100.00;
        System.out.println("Cilindra tilpums ir " + tilpumsNoapalots);
    }
}
