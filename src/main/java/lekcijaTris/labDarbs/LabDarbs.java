package lekcijaTris.labDarbs;

public class LabDarbs {
    public static void main(String[] args) {

        printNewLine();
        arrayExamples();

        printNewLine();
        whileCikls();

    }

    public static void printName(){
        System.out.println("@@@@@@@@@@@@@");
        System.out.println("Vārds: Igors");
        System.out.println("@@@@@@@@@@@@@");
        System.out.println(rectangularSquare(5,7));
        printNewLine();
    }

    public static void printNewLine(){
        System.out.println(" ");
    }

    static int rectangularSquare(int malaA, int malaB){
        return malaA*malaB;
    }

    public static void whileCikls(){

        int i=0;
        while (i<2){
            System.out.println("Cikla kārtas numurs [i] = " + i);
            printName();
            i++;
        }

    }

    public static void arrayExamples(){
        // MASIVI
        int[] monthlyCost = {800, 900, 600, 700, 800, 750, 1050, 950, 980, 780, 800, 890};
        int[] yearlyCost;
        System.out.println(monthlyCost[0] + "+" + monthlyCost[1] + "+" + monthlyCost[2]);
        int arrayLength = monthlyCost.length;
        System.out.println("Masīva garums ir " + arrayLength);
        for (int j=0; j<12; j++) {
            System.out.println("mēnesis #" + j + " " + monthlyCost[j] + "EUR");
        }

        printNewLine();
        String[] productList = {"Milk", "Bread", "Eggs", "Cheese"};
        System.out.println(productList[0] + " " + productList[1] + " " + productList[2] + " " + productList[3]);
        productList[3] = "Parmesan";
        System.out.println(productList[0] + " " + productList[1] + " " + productList[2] + " " + productList[3]);

        printNewLine();
        String[] monthsInYear = new String[12];
        monthsInYear[0]="JAN";
        monthsInYear[1]="FEB";
        monthsInYear[2]="MAR";
        monthsInYear[3]="APR";

        System.out.println(monthsInYear[0] + " " + monthsInYear[1] + " " + monthsInYear[2] + " " + monthsInYear[3]);

        printNewLine();
        String[] studentuSaraksts = new String[23];
        studentuSaraksts[0] = "Jānis Bērziņš";
        studentuSaraksts[1] = "Jana Ozoloņa";
        System.out.println(studentuSaraksts[0]);
        System.out.println(studentuSaraksts[1]);
        System.out.println(studentuSaraksts[2]); //rādīs null, jo masīvā vēl nav piešķirta vērtība
    }

}
