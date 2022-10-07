package lekcijaDivi.majasDarbs;

import java.util.Scanner;

public class HomeWorkTwo {
    public static void main(String[] args) {

        // SCANNER IZVEIDOŠANA
        Scanner scannerInt = new Scanner(System.in);

        // *** UZDEVUMS #1 - LOĢISKĀS IZTEIKSMES ***

        int x, t1, t2; // Mainīgo definēšana, t1 un t2 robežvērtību pārbaudei u.c. testiem

        System.out.println("\n*** UZDEVUMS #1 - LOĢISKĀS IZTEIKSMES ***");
        System.out.println("a) vai x ir pozitīvs (iegūt rezultātu true)");
        x = 5;
        t1 = 0;
        t2 = -2;
        System.out.println("x=" + x + " " + (x > 0));
        System.out.println("t1=" + t1 + " " + (t1 > 0));
        System.out.println("t2=" + t2 + " " + (t2 > 0));

        System.out.println("\nb) vai x ir negatīvs (iegūt rezultātu false)");
        x = 3;
        t1 = 0;
        t2 = -2;
        System.out.println("x=" + x + " " + (x < 0));
        System.out.println("t1=" + t1 + " " + (t1 < 0));
        System.out.println("t2=" + t2 + " " + (t2 < 0));

        System.out.println("\nc) vai x ir lielāks par 5 un x ir mazāks vai vienāds par 10(iegūt rezultātu true)");
        x = 10;
        t1 = 5;
        t2 = 11;
        System.out.println("x=" + x + " " + (x > 5 && x <= 10));
        System.out.println("t1=" + t1 + " " + (t1 > 5 && t1 <= 10));
        System.out.println("t2=" + t2 + " " + (t2 > 5 && t2 <= 10));

        System.out.println("\nd) vai x NAV mazāks vai vienāds par 5 un x ir mazāks par 10(iegūt rezultātu true)");
        x = 7;
        t1 = 5;
        t2 = 10;
        System.out.println("x=" + x + " " + (x != 5 && x > 5 && x < 10));
        System.out.println("t1=" + t1 + " " + (t1 != 5 && t1 > 5 && t1 < 10));
        System.out.println("t2=" + t2 + " " + (t2 != 5 && t2 > 5 && t2 < 10));

        System.out.println("\ne) vai x ir vienāds 0 vai x ir vienāds 10(rezultāts false)");
        x = 7;
        t1 = 0;
        t2 = 10;
        System.out.println("x=" + x + " " + (x == 0 || x == 10));
        System.out.println("t1=" + t1 + " " + (t1 == 0 || t1 == 10));
        System.out.println("t2=" + t2 + " " + (t2 == 0 || t2 == 10));

        System.out.println("\nf) vai x * x reizinājums ir lielāks par 10 (rezultātus true)");
        x = 4;
        t1 = 2;
        t2 = -4;
        System.out.println("x=" + x + " " + ((x * x) > 10));
        System.out.println("t1=" + t1 + " " + ((t1 * t1) > 10));
        System.out.println("t2=" + t2 + " " + ((t2 * t2) > 10));


        // *** UZDEVUMS #2 - KALENDĀRS ***
            // Tajā pašā klasē un main metodē zemāk uzrakstīt programmu,
            // kas pieņem Mēneša numuru (vesels skaitlis)
            // un izvada uz ekrāna mēneša nosaukumu ar vārdu. (izmantot switch)

        int monthNumber;

        System.out.println("\n\n*** UZDEVUMS #2 - KALENDĀRS ***");
        System.out.println("Ievadiet mēneša skaitli");
        monthNumber = scannerInt.nextInt();
        switch (monthNumber) {
            case 1:
                System.out.println("JANVĀRIS");
                break;
            case 2:
                System.out.println("FEBRUĀRIS");
                break;
            case 3:
                System.out.println("MARTS");
                break;
            case 4:
                System.out.println("APRĪLIS");
                break;
            case 5:
                System.out.println("MAIJS");
                break;
            case 6:
                System.out.println("JŪNIJS");
                break;
            case 7:
                System.out.println("JŪLIJS");
                break;
            case 8:
                System.out.println("AUGUSTS");
                break;
            case 9:
                System.out.println("SEPTEMBRIS");
                break;
            case 10:
                System.out.println("OKTOBRIS");
                break;
            case 11:
                System.out.println("NOVEMBRIS");
                break;
            case 12:
                System.out.println("DECEMBRIS");
                break;
            default:
                System.out.println("Mēnesis ar šādu kārtas numuru neeksistē");
                break;
        }

        // *** UZDEVUMS #3 - LIELĀKAIS SKAITLIS ***
            // Tajā pašā klasē un main metodē zemāk uzrakstīt programmu,
            // kas pieņem trīs veselus skaitļus un izvada uz ekrāna,
            // kurš ir lielākais no šiem trīs skaitļiem.

        int a, b, c;

        System.out.println("\n\n*** UZDEVUMS #3 - LIELĀKAIS SKAITLIS ***");
        System.out.println("Ievadiet pirmo skaitli");
        a = scannerInt.nextInt();
        System.out.println("Ievadiet otro skaitli");
        b = scannerInt.nextInt();
        System.out.println("Ievadiet trešo skaitli");
        c = scannerInt.nextInt();

        if ((Math.max(a, b))>(Math.max(b, c))){
            System.out.println("Lielākais skaitlis ir " + Math.max(a, b));
        } else {
            System.out.println("Lielākais skaitlis ir " + Math.max(b, c));
        }

        // *** UZDEVUMS #4 - LUKSOFORS ***
            // Tajā pašā klasē un main metodē zemāk uzrakstīt programmu,
            // kas nolasa krāsu(String) sarkans/dzeltens/zaļš un izvada uz ekrāna,
            // gājēja darbības pie luksofora. Uzrakstīt arī ko darīt,
            // ja nedeg ne zaļa/dzeltena/sarkana gaisma.

        System.out.println("\n\n*** UZDEVUMS #4 - LUKSOFORS ***");
        String trafficLight;
        System.out.println("Ievadiet konsolē tekošo luksofora krāsu (sarkana, dzeltena, zaļa):");

        // SCANNER IZVEIDOŠANA
        Scanner scannerString = new Scanner(System.in);
        trafficLight = scannerString.nextLine();

        if (trafficLight.equals("sarkana")){
            System.out.println("Stāt!");
        } else if (trafficLight.equals("dzeltena")) {
            System.out.println("Gaidīt!");
        } else if (trafficLight.equals("zaļa")){
            System.out.println("Iet!");
        } else {
            System.out.println("Luksofors nestrādā!");
        }

        // *** UZDEVUMS #5 - METODE printBusinessCard ***
            // Uzrakstīt atsevišķi metodi printBusinessCard, kura neatgriež neko,
            // bet izvada ekrānā cilvēka vizītkarti ar cilvēka vārdu, uzvārdu, telefonu un dzimšanas gadu.
            // main metodē trīs reizes izsaukt šo metodi un uz ekrāna parādīt vizītkarti 3 reizes.

        System.out.println("\n\n*** UZDEVUMS #5 - METODE printBusinessCard ***");
        printBusinessCard();
        printBusinessCard();
        printBusinessCard();

        // *** UZDEVUMS #6 - METODE printBusinessCardTwo ***
        // Izveidot jaunu metodi kā 5. uzdevumā, bet ar nosaukumu printBusinessCardTwo(),
        // lai šī metode pieņem kā argumentus vārdu, uzvārdu, telefonu un dzimšanas gadu un izvada vizītkarti uz ekrāna.
        // Metodei nevajag atgriez nekādu vērtību.
        // Metodi izsaukt 2 reizes main() metodē ar dažādiem parametriem.

        System.out.println("\n\n*** UZDEVUMS #6 - METODE printBusinessCardTwo ***");
        printBusinessCardTwo("Jānis", "Auziņš", "+372 355326", 1988);
        printBusinessCardTwo("Jana", "Ozoliņa", "+371 2258744", 1984);
    }

    static void printBusinessCard(){
        String name = "Igors";
        String surname = "Ņeborskis";
        String phone = "+371 .....";
        int birthYear = 1983;

        System.out.println("\nVizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Tālr.: " + phone);
        System.out.println("Dzimšanas gads: " + birthYear);
    }

    static void printBusinessCardTwo(String name, String surname, String phone, int birthYear){
        System.out.println("\nVizītkarte");
        System.out.println("##########");
        System.out.println("Vārds: " + name);
        System.out.println("Uzvārds: " + surname);
        System.out.println("Tālr.: " + phone);
        System.out.println("Dzimšanas gads: " + birthYear);
    }

}
