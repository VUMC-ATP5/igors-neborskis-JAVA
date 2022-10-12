package lekcijaTris.majasDarbs;

import java.util.Scanner;

public class ExtraUzdevumsCetri {
    public ExtraUzdevumsCetri() {
    }

    public static void extraUzdevumsCetri() {
        System.out.println("\n******* extraUZDEVUMS #4 *******");
        Scanner scannerPrimeNumber = new Scanner(System.in);
        System.out.println("Ievadiet konsolē naturālo skaitli (>1)");
        int enteredNumber = scannerPrimeNumber.nextInt();
        if (enteredNumber <= 0) {
            System.out.println("Ievadītais skaitlis " + enteredNumber + " nav naturāls skaitlis");
        } else if (enteredNumber == 1) {
            System.out.println("Skaitlis " + enteredNumber + " NETIEK uzskatīts par pirmskaitli");
        } else {
            for(int counter = 2; counter <= enteredNumber; ++counter) {
                if (enteredNumber % counter == 0 && counter != enteredNumber) {
                    System.out.println("Skaitlis " + enteredNumber + " NAV pirmskaitlis");
                    ++counter;
                    //System.exit(0);
                } else if (enteredNumber % counter == 0 && counter == enteredNumber) {
                    System.out.println("Skaitlis " + enteredNumber + " IR pirmskaitlis");
                    //System.exit(0);
                }
            }
        }

    }
}