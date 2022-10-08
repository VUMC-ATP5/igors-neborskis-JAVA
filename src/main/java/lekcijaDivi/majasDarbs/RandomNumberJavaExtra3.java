package lekcijaDivi.majasDarbs;

import java.util.Random;
import java.util.Scanner;

public class RandomNumberJavaExtra3 {

    public static void main(String[] args) {

        // random generator
        Random random = new Random();
        int x = random.nextInt(50);

        // scanner
        Scanner scannerInt = new Scanner(System.in);

        // mainīgie
        int counter = 10;
        int x1 = 0;
        int x2 = 50;
        int enteredNumber;
        // kods
        while (counter>0) {
            System.out.println("\nAtlikušo mēģinājumu skaits: " + counter);
            System.out.println("Ievadiet skaitli, kas ir lielāks par " + x1 + " un mazāks par " + x2);
            enteredNumber = scannerInt.nextInt();

            if (enteredNumber<0 || enteredNumber>50){
                System.out.println("Ievadītais skaitlis ir ārpus robežām 0-50");
            }
            else if (enteredNumber==x){
                System.out.println("Apsveicu. Esi uzminējis. Uzģenerētais skaitlis ir " + x);
                counter--;
                System.out.println("Izmantoti " + (10-counter) + " mēģinājumi");
                System.out.println("*** PROGRAMMAS BEIGAS ***");
                System.exit(0);
            }
            else if (x>enteredNumber) {
                x1 = enteredNumber;
                System.out.println("Neuzminēji. Ievadītais skaitlis ir mazāks par uzģenerēto. Jaunās robežas ir " + x1 + "-" + x2);
            }
            else if (x<enteredNumber) {
                x2 = enteredNumber;
                System.out.println("Neuzminēji. Ievadītais skaitlis ir lielāks par uzģenerēto. Jaunās robežas ir " + x1 + "-" + x2);
            }
            counter--;
        }
        System.out.println("Visi mēģinājumi ir beigušies");
        System.out.println("*** PROGRAMMAS BEIGAS ***");
    }
}
