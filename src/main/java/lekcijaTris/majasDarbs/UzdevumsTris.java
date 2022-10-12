package lekcijaTris.majasDarbs;

public class UzdevumsTris {
    public UzdevumsTris() {
    }

    public static void uzdevumsTris() {
        NewLine.newLine();
        System.out.println("\n******* UZDEVUMS #3 *******");
        int[] arrayHundred = new int[100];

        for(int arrayCounter = 0; arrayCounter < arrayHundred.length; ++arrayCounter) {
            arrayHundred[arrayCounter] = arrayCounter + 1;
            if (arrayHundred[arrayCounter] % 2 == 0) {
                System.out.print(arrayHundred[arrayCounter] + " ");
            }
        }

    }
}