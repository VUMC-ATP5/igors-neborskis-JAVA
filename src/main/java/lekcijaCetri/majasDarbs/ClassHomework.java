package lekcijaCetri.majasDarbs;

public class ClassHomework {
    public static void main(String[] args) {
        System.out.println("***** UZDEVUMS #1 - TRĪSSTŪRIS *****");
        Trissturis trissturis1 = new Trissturis(); // no-arg konstruktora piemērs
        trissturis1.malaA = 4;
        trissturis1.malaB = 5;
        trissturis1.malaC = 5;
        Trissturis trissturis2 = new Trissturis(2,3,2);
        Trissturis trissturis3 = new Trissturis(4,4,4);
        Trissturis trissturis4 = new Trissturis(4,3,2);
        Trissturis trissturis5 = new Trissturis(4,2,10);
        trissturis1.rekinatLaukumu();
        trissturis2.rekinatLaukumu();
        trissturis3.rekinatLaukumu();
        trissturis4.rekinatLaukumu();
        trissturis5.rekinatLaukumu();
    }
}
