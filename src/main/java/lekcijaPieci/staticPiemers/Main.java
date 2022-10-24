package lekcijaPieci.staticPiemers;

public class Main {
    public static void main(String[] args) {

        Cilveks persona1 = new Cilveks("Jānis");
        persona1.printName();
        Cilveks.printId();
        System.out.println(persona1.getEmployeeId());

        Cilveks persona2 = new Cilveks("Juris");
        persona2.printName();
        Cilveks.printId();
        System.out.println(persona2.getEmployeeId());

        Cilveks persona3 = new Cilveks("Anna");
        persona3.printName();
        Cilveks.printId();
        System.out.println(persona3.getEmployeeId());

        Cilveks persona4 = new Cilveks("Zane");
        persona4.printName();
        Cilveks.printId();
        System.out.println(persona4.getEmployeeId());

        Cilveks persona5 = new Cilveks("Alise");
        persona5.printName();
        Cilveks.printId();
        System.out.println(persona5.getEmployeeId());
    }
}
