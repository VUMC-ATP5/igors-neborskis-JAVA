package lekcijaTris.majasDarbs;

import java.util.Scanner;

public class ExtraUzdevumsPieci {
    public ExtraUzdevumsPieci() {
    }

    public static void extraUzdevumsPieci() {
        System.out.println("\n******* extraUZDEVUMS #5 *******");
        Scanner scannerPin = new Scanner(System.in);
        int pinCorrect = 0;
        int pinAttempts = 3;

        do {
            System.out.println("\n### Ievadiet konsolē korektu PIN kodu (4 cipari) ###");
            System.out.println("Atlikušo mēģinājumu skaits: " + pinAttempts);

            String pinEntryString;
            for(pinEntryString = scannerPin.nextLine(); pinEntryString.length() != 4; pinEntryString = scannerPin.nextLine()) {
                System.out.println("!!! PIN kodam jāsastāv no 4 cipariem. Atkārtojiet! !!!");
            }

            int pinEntry = Integer.parseInt(pinEntryString);
            if (pinEntry != pinCorrect) {
                --pinAttempts;
            } else {
                System.out.println("\nPIN ir pieņemts, laipni lūdzam atpakaļ.");
                System.out.println("*** PROGRAMMAS BEIGAS ***");
                System.exit(0);
            }
        } while(pinAttempts > 0);

        System.out.println("\nAtvainojiet, bet jūs esat bloķēts");
        System.out.println("*** PROGRAMMAS BEIGAS ***");
        System.exit(0);
    }
}