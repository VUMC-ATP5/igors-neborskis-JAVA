package lekcijaTris.labDarbs;

import java.util.Scanner;

public class LabDarbs {
    public static void main(String[] args) {

        printNewLine();
        arrayExamples();

        printNewLine();
        whileCikls();

        printNewLine();
        uzdevumsViens();

        printNewLine();
        playCards();

        printNewLine();
        forEachExample();

        printNewLine();
        uzdevumsTris();

        printNewLine();
        uzdevumsCetri();

        printNewLine();
        printNewLine();
        uzdevumsDivi();

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
        printNewLine();
        String[] productList = {"Milk", "Bread", "Eggs", "Cheese"};
        System.out.println(productList[0] + " " + productList[1] + " " + productList[2] + " " + productList[3]);
        productList[3] = "Parmesan";
        System.out.println(productList[0] + " " + productList[1] + " " + productList[2] + " " + productList[3]);

        String allProducts = "";
        int z=0;
        while (z<4){
            allProducts = allProducts + productList[z] + " ";
            z++;
        }
        System.out.println(allProducts);


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

    public static void uzdevumsViens(){
        int[] monthlyCost = {800, 900, 600, 700, 800, 750, 1050, 950, 980, 780, 800, 890};

        for (int j=0; j<monthlyCost.length; j++) {
            System.out.println("mēnesis #" + j + " " + monthlyCost[j] + "EUR");
        }

        int arrayLength = monthlyCost.length;
        System.out.println("Masīva garums ir " + arrayLength);

        int[] yearlyCost;
        System.out.println(monthlyCost[0] + "+" + monthlyCost[1] + "+" + monthlyCost[2]);
    }

    public static void uzdevumsDivi(){

        // SCANNER IZVEIDOŠANA
        Scanner scannerInt = new Scanner(System.in);

        System.out.println("Ievadiet tikai pozitīvu skaitli. Ja tiks ievadīts negatīvs skaitlis vai nulle, programma tiks pārtraukta");
        int enteredNumber = scannerInt.nextInt();
        int intSum = 0;

        while (enteredNumber>0){
            intSum = intSum + enteredNumber;
            System.out.println("Tekošā ievadīto skaitļu summa ir " + intSum);
            System.out.println("Ievadiet tikai pozitīvu skaitli. Ja tiks ievadīts negatīvs skaitlis vai nulle, programma tiks pārtraukta");
            enteredNumber = scannerInt.nextInt();
        }

        if (enteredNumber==0){
            System.out.println("Ievadīta" + enteredNumber);
        } else {
            System.out.println("Ievadīts negatīvs skaitlis " + enteredNumber);
        }

        System.out.println("Ievadīto pozitīvo skaitļu summa ir " + intSum);
        System.out.println("*** Programma pabeigta ***");
    }

    public static void uzdevumsTris(){
        int countHouse = 0;
        for (int houseNumber = 1; houseNumber < 51; houseNumber++){
            if (!(houseNumber%3==0 || houseNumber%5==0)){
                countHouse++;
            }
        }

        System.out.println("Pieejamo māju skaits: " + countHouse);
    }

    public static void uzdevumsCetri(){
        char[] letter = {'I', 'g', 'o', 'r', 's'};
        for (char name: letter) {
            System.out.print(name);
        }
    }

    public static void playCards() {
        String[] kartis = {"Pīķa dūzis", "Ercena kalps", "Kreiča dūzis"};

        for (int i = 0; i < kartis.length; i++) {
            System.out.println(kartis[i] + " ");
        }

        printNewLine();
        for (String kartsNosaukums: kartis) {
            System.out.println(kartsNosaukums);
        }
    }

    public static void forEachExample() {
        long[] phoneNumber = {22222222, 333333333, 44444444, 55555555, 666666 ,777777};

        for (long number : phoneNumber) {
            System.out.println(number);
        }
    }




}
