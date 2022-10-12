package lekcijaTris.majasDarbs;

import java.util.Scanner;

public class UzdevumsViens {
    public UzdevumsViens() {
    }

    public static void uzdevumsViens() {
        System.out.println("\n******* UZDEVUMS #1 *******");
        Scanner scannerSum = new Scanner(System.in);
        int counterAttempt = 1;
        int sumTotal = 0;
        System.out.println("Ievadiet konsolē veselo skaitli #" + counterAttempt);
        int enteredNumber = scannerSum.nextInt();

        for(sumTotal += enteredNumber; sumTotal <= 100; sumTotal += enteredNumber) {
            System.out.println("Ievadīto skaitļu summa ir: " + sumTotal);
            ++counterAttempt;
            System.out.println("Ievadiet konsolē veselo skaitli #" + counterAttempt);
            enteredNumber = scannerSum.nextInt();
        }

        System.out.println("Gatavs. Ievadīto skaitļu summa ir pārsniegusi 100");
        System.out.println("Kopējā ievadīto skaitļu summa ir " + sumTotal);
    }
}