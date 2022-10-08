package lekcijaDivi.majasDarbs;

public class JavaExtra2 {
    public static void main(String[] args) {

        // mainīgie
        int a=1;
        int b=2;
        int c=3;
        int counter = 0;

        // *** UZDEVUMS #1.1
        counter++;
        System.out.println("\n*** UZDEVUMS #1." + counter + " ***");

        if (6 < 2 * 5) {
            System.out.print("Hello");
            System.out.print(" There");
        }

        // *** UZDEVUMS #1.2
        counter++;
        System.out.println("\n\n*** UZDEVUMS #1." + counter + " ***");

        if((a>b)&&(a>c)) {
            System.out.println("1111");
        }
        else {
            System.out.println("2222");
        }

        // *** UZDEVUMS #1.3
        counter++;
        System.out.println("\n*** UZDEVUMS #1." + counter + " ***");

        if (a < c) {
            System.out.println("*");
        }
        else if (a == b) {
            System.out.println("&");
        }
        else {
            System.out.println("$");
        }

        // *** UZDEVUMS #1.4
        counter++;
        System.out.println("\n*** UZDEVUMS #1." + counter + " ***");

        if (a<b) {
            System.out.println("####");
        }
        else {
            System.out.println("&&&&");
            System.out.println("****");
        }

        // *** UZDEVUMS #1.5
        counter++;
        System.out.println("\n*** UZDEVUMS #1." + counter + " ***");

        if (a>b) {
            System.out.println("####");
        }
        else {
            System.out.println("&&&&");
            System.out.println("****");
        }

        // *** UZDEVUMS #1.6
        counter++;
        System.out.println("\n*** UZDEVUMS #1." + counter + " ***");

        int x = 100;
        int y = 200;
        if (x > 100 && y <=200){
            System.out.print(x + " " + y + " " + (x+y));
        }
        else {
            System.out.print(x + " " + y + " " + (2 * x - y));
        }

        // *** UZDEVUMS #1.7
        counter++;
        System.out.println("\n*** UZDEVUMS #1." + counter + " ***");

        if (a < c) {
            System.out.println("*");
        }
        else if (a == c) {
            System.out.println("&");
        }
        else {
            System.out.println("$");
        }

        // *** UZDEVUMS #1.8
        counter++;
        System.out.println("\n*** UZDEVUMS #1." + counter + " ***");

        if(++a > b++ || a-- > 0) {
            c++;
        }
        else {
            c--;
        }
        System.out.println(a + " " + b + " " + c);

        // *** UZDEVUMS #1.9
        counter++;
        System.out.println("\n*** UZDEVUMS #1." + counter + " ***");

        if(a<b){
            System.out.println("####");
            System.out.println("****");
        }
        else {
            System.out.println("&&&&");
        }

        // *** UZDEVUMS #1.10
        counter++;
        System.out.println("\n*** UZDEVUMS #1." + counter + " ***");

        if ('a' > 'b' || 66 > (int)('A')) {
            System.out.println("#*#");
        }

        // *** UZDEVUMS #2.1
            // Uzraksti izteiksmi, kas piešķir vērtību 1 mainīgajam x, ja y ir lielāks par 0.
        counter = 1;
        System.out.println("\n*** UZDEVUMS #2." + counter + " ***");

        y = 2;
        if (y>0) {
            x = 1;
            System.out.println("x=" + x);
        }

        // *** UZDEVUMS #2.2
            // Eksistē mainīgais 'rezultāts' ar tipu double.
            // Uzraksti izteiksmi, kas palielina mainīgā 'rezultāts' vērtību par 5,
            // ja rezultāta vērtība ir starp 80 un 90.
        counter++;
        System.out.println("\n*** UZDEVUMS #2." + counter + " ***");

        double rezultats = 85;
        System.out.println("Tekošā 'rezutats' vertība ir: " + rezultats);

        if (rezultats>=80 && rezultats<=90){
            rezultats = rezultats + 5;
            System.out.println("Jaunā 'rezutats' vertība ir: " + rezultats);
        }

        // *** UZDEVUMS #2.3
            // Uzraksti izteiksmi, kas izprintē true, ja x is nepāra pozitīvs skaitlis
        counter++;
        System.out.println("\n*** UZDEVUMS #2." + counter + " ***");

        x = 3;
        System.out.println((x%2==1) && (x>0));

    }
}
