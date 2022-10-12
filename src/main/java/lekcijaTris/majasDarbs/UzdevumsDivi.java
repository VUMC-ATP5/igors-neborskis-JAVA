package lekcijaTris.majasDarbs;

public class UzdevumsDivi {
    public UzdevumsDivi() {
    }

    public static void uzdevumsDivi() {
        System.out.println("\n******* UZDEVUMS #2 *******");
        String[] pupilsNames = new String[]{"Jānis", "Pēteris", "Zane", "Alise"};
        int[] classNumber = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12};
        char[] classAttributes = new char[]{'a', 'b', 'c', 'd'};
        System.out.println("\n--- a. while ---");
        System.out.print("String[] pupilsNames: ");

        int arrayCounter;
        for(arrayCounter = 0; arrayCounter < pupilsNames.length; ++arrayCounter) {
            System.out.print(pupilsNames[arrayCounter] + " ");
        }

        System.out.print("\nint[] classNumber: ");

        for(arrayCounter = 0; arrayCounter < classNumber.length; ++arrayCounter) {
            System.out.print(classNumber[arrayCounter] + " ");
        }

        System.out.print("\nchar[] classAttributes: ");

        for(arrayCounter = 0; arrayCounter < classAttributes.length; ++arrayCounter) {
            System.out.print(classAttributes[arrayCounter] + " ");
        }

        System.out.println("\n--- b. do..while ---");
        System.out.print("String[] pupilsNames: ");
        arrayCounter = 0;

        do {
            System.out.print(pupilsNames[arrayCounter] + " ");
            ++arrayCounter;
        } while(arrayCounter < pupilsNames.length);

        System.out.print("\nint[] classNumber: ");
        arrayCounter = 0;

        do {
            System.out.print(classNumber[arrayCounter] + " ");
            ++arrayCounter;
        } while(arrayCounter < classNumber.length);

        System.out.print("\nchar[] classAttributes: ");
        arrayCounter = 0;

        do {
            System.out.print(classAttributes[arrayCounter] + " ");
            ++arrayCounter;
        } while(arrayCounter < classAttributes.length);

        System.out.println("\n--- c. for ---");
        System.out.print("String[] pupilsNames: ");

        for(arrayCounter = 0; arrayCounter < pupilsNames.length; ++arrayCounter) {
            System.out.print(pupilsNames[arrayCounter] + " ");
        }

        System.out.print("\nint[] classNumber: ");

        for(arrayCounter = 0; arrayCounter < classNumber.length; ++arrayCounter) {
            System.out.print(classNumber[arrayCounter] + " ");
        }

        System.out.print("\nchar[] classAttributes: ");

        for(arrayCounter = 0; arrayCounter < classAttributes.length; ++arrayCounter) {
            System.out.print(classAttributes[arrayCounter] + " ");
        }

        System.out.println("\n--- d. for..each ---");
        System.out.print("String[] pupilsNames: ");
        String[] var4 = pupilsNames;
        int var5 = pupilsNames.length;

        int var6;
        for(var6 = 0; var6 < var5; ++var6) {
            String pupils = var4[var6];
            System.out.print(pupils + " ");
        }

        System.out.print("\nint[] classNumber: ");
        int[] var8 = classNumber;
        var5 = classNumber.length;

        for(var6 = 0; var6 < var5; ++var6) {
            int number = var8[var6];
            System.out.print("" + number + " ");
        }

        System.out.print("\nchar[] classAttributes: ");
        char[] var9 = classAttributes;
        var5 = classAttributes.length;

        for(var6 = 0; var6 < var5; ++var6) {
            char attributes = var9[var6];
            System.out.print("" + attributes + " ");
        }

    }
}