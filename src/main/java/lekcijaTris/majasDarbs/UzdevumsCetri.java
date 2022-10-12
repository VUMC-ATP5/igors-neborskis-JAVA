package lekcijaTris.majasDarbs;

import java.text.DecimalFormat;

public class UzdevumsCetri {
    public UzdevumsCetri() {
    }

    public static void uzdevumsCetri(int factorialNumber) {
        System.out.println("\n******* UZDEVUMS #4 *******");
        DecimalFormat df = new DecimalFormat("0");
        float factorialResult = 1.0F;

        for(int arrayCounter = factorialNumber; arrayCounter > 0; --arrayCounter) {
            factorialResult = (float)arrayCounter * factorialResult;
        }

        System.out.println("Skaitļa " + factorialNumber + " faktoriāls ir " + df.format((double)factorialResult));
    }
}