package lekcijaPieci.staticPiemers;

public class Cilveks {

    public static int employeeId = 0;
    public String name;

    public static int getEmployeeId() {
        return employeeId;
    }

    public Cilveks(String name) {
        this.name = name;
        employeeId++;
    }

    public void printName(){
        System.out.println("\nCilvēka vārds ir " + name);
    }

    public static void printId(){
        System.out.println("Darbinieka numurs ir " + employeeId);
    }
}
