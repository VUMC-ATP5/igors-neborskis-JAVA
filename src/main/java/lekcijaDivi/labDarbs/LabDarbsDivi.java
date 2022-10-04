package lekcijaDivi.labDarbs;

import java.util.Scanner;

public class LabDarbsDivi {
    public static void main(String[] args) {

        // SCANNER IZVEIDOŠANA
        Scanner scanner = new Scanner(System.in);

//        // KODS - PIEMĒRI
//        int x = 4;
//        int y = 3;
//
//        System.out.println("x=" + x + " y=" + y);
//        System.out.println(x + ">" + y + " " + (x>y)); //x lielāks par y = true
//        System.out.println(x + "<" + y + " " + (x<y)); //x mazāks par y = false
//        System.out.println(x + "==" + y + " " + (x==y)); //x vienāds ar y = false
//        System.out.println(x + "!=" + y + " " + (x!=y)); //x nav vienāds ar y =true
//
//        String color = "green";
//        System.out.println("\n" + color + " equals green? " + color.equals("green")); //true
//        System.out.println(color + " equals red? " + color.equals("red")); //false

//        // KODS - VĒLĒŠANAS
//        int votersAge;
//        String votersName;
//        boolean hasVoted = false;
//
//        System.out.println("Ievadiet savu vārdu:");
//        votersName = scanner.nextLine();
//        System.out.println("\nSveiki, " + votersName);
//
//        //1.piegājiens
//        System.out.println("Ievadiet vecumu konsolē:");
//        votersAge = scanner.nextInt();
//
//        if (votersAge > 118) {
//            System.out.println("\nTiešām??? Zvaniet Ginesa Grāmatai!!!");
//            System.out.println("*** Programma apstādināta ***");
//            System.exit(0);
//        } else if (votersAge < 0){
//            System.out.println("\nNegatīvs vecums nav iespējams!!!");
//            System.exit(0);
//        } else if (votersAge >= 18 && hasVoted == false){
//            System.out.println("\nJūs drīkstiet balsot!");
//            hasVoted = true;
//        } else {
//            System.out.println("\nBalsotāja dati neatbilst balsošanas kritērijiem!");
//            System.out.println("*** Programma apstādināta ***");
//            System.exit(0);
//        }
//
//        //2.piegājiens - balsošana otreiz nav iespējama, jo hasVoted == true
//        System.out.println("\n*** Programmas turpinājums ***");
//
//        System.out.println("\nIevadiet vecumu konsolē:");
//        votersAge = scanner.nextInt();
//
//        if (votersAge > 118) {
//            System.out.println("\nTiešām??? Zvaniet Ginesa Grāmatai!!!");
//            System.out.println("*** Programma apstādināta ***");
//            System.exit(0);
//        } else if (votersAge < 0){
//            System.out.println("\nNegatīvs vecums nav iespējams!!!");
//            System.exit(0);
//        } else if (votersAge >= 18 && hasVoted == false){
//            System.out.println("\nJūs drīkstiet balsot!");
//            hasVoted = true;
//        } else {
//            System.out.println("\nBalsotāja dati neatbilst balsošanas kritērijiem!");
//            System.out.println("*** Programma apstādināta ***");
//            System.exit(0);
//        }

//        // KODS - LUKSOFORS
//        String trafficLight;
//        System.out.println("Enter traffic light color (red, yellow or green):");
//        trafficLight = scanner.nextLine();
//
//        if (trafficLight.equals("red")){
//            System.out.println("Stay!");
//        } else if (trafficLight.equals("yellow")) {
//            System.out.println("Wait!");
//        } else if (trafficLight.equals("green")){
//            System.out.println("Go!");
//        } else {
//            System.out.println("Wrong color!");
//        }

//        // KODS - SKAITLU SALĪDZINĀŠANA
//        int i;
//        System.out.println("Ievadiet skaitli i");
//        i = scanner.nextInt();
//        if (i==10){
//            System.out.println("skaitlis ir " + i);
//        }else if (i==15){
//            System.out.println("skaitlis ir " + i);
//        }else if (i==20) {
//            System.out.println("skaitlis ir " + i);
//        }
//        else {
//            System.out.println("skaitlis neatbilst");
//        }

//        // KODS - SKAITLIS PĀRA/NEPĀRA
//        int j;
//        System.out.println("Ievadiet skaitli j");
//        j = scanner.nextInt();
//
//        if (j == 0){
//            System.out.println("Skaitlis ir 0");
//        } else if (j%2 == 0){
//            System.out.println("Pāra skaitlis");
//        } else {
//            System.out.println("Nepāra skaitlis");
//        }

//        // KODS - KALENDĀRS
//        int monthNumber;
//        System.out.println("Ievadiet mēneša skaitli");
//        monthNumber = scanner.nextInt();
//        switch (monthNumber){
//            case 1: System.out.println("JAN"); break;
//            case 2: System.out.println("FEB"); break;
//            case 3: System.out.println("MAR"); break;
//            case 4: System.out.println("APR"); break;
//            case 5: System.out.println("MAY"); break;
//            case 6: System.out.println("JUN"); break;
//            case 7: System.out.println("JUL"); break;
//            case 8: System.out.println("AUG"); break;
//            case 9: System.out.println("SEP"); break;
//            case 10: System.out.println("OCT"); break;
//            case 11: System.out.println("NOV"); break;
//            case 12: System.out.println("DEC"); break;
//            default: System.out.println("Mēnesis ar šādu kārtas numuru neeksistē");
//        }

//        // KODS - NEDĒĻAS DIENAS
//        int dayNumber;
//        System.out.println("Ievadiet nedēļas dienu:");
//        dayNumber = scanner.nextInt();
//        switch (dayNumber){
//            case 1: System.out.println("Pirmdiena"); break;
//            case 2: System.out.println("Otrdiena"); break;
//            case 3: System.out.println("Trešdiena"); break;
//            case 4: System.out.println("Ceturtdiena"); break;
//            case 5: System.out.println("Piektdiena"); break;
//            case 6: System.out.println("Sestdiena"); break;
//            case 7: System.out.println("Svētdiena"); break;
//            default: System.out.println("Diena ar šādu kārtas numuru neeksistē"); break;
//        }

//        // KODS - DZĪVNIEKI
//        String animal = "dog";
//        String result;
//        switch (animal){
//            case "dog":
//            case "cat":
//                result = "Domestic animal";
//                break;
//            case "tiger":
//                result = "Wild animal";
//                break;
//            default:
//                System.out.println("Unknown animal");
//                break;
//        }
//        return result;

    }
}

