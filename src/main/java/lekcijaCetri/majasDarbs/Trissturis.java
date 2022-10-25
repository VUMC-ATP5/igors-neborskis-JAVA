package lekcijaCetri.majasDarbs;

public class Trissturis {
    double malaA;
    double malaB;
    double malaC;
    double laukums;
    double laukumsNoapalots;
    double pusperimetrs;

    // arg konstruktors trissturis()
    public Trissturis(double malaA, double malaB, double malaC) {
        this.malaA = malaA;
        this.malaB = malaB;
        this.malaC = malaC;
    }
    // no-arg konstruktors trissturis()
    Trissturis(){
        System.out.println("\nVeidojam jaunu trīsstūri ar malām A, B, C");
    }
    public void rekinatLaukumu(){

        System.out.println("\nTrīstura mala A: " + malaA);
        System.out.println("Trīstura mala B: " + malaB);
        System.out.println("Trīstura mala C: " + malaC);

        if (vaiTristurisEksiste()==true) {
            pusperimetrs = (malaA + malaB + malaC) / 2;
            laukums = Math.sqrt(pusperimetrs * (pusperimetrs - malaA) * (pusperimetrs - malaB) *
                    (pusperimetrs - malaC));
            laukumsNoapalots = Math.round(laukums * 100.00) / 100.00;
            System.out.println("Trīstūra laukums: " + laukumsNoapalots);
            System.out.println("Vai trīstūris ir vienādmalu: " + vaiTristurisVienadmalu());
            System.out.println("Vai trīstūris ir vienādsānu: " + vaiTristurisVienadsanu());
        } else {
            System.out.println("KĻŪDA! Trīsturis ar tādiem malu garumiem neeksistē.");
        }
    }
    public boolean vaiTristurisEksiste(){
        return (((malaA<malaB+malaC)&&(malaA>Math.abs(malaB-malaC))) &&
                ((malaB<malaA+malaC)&&(malaB>Math.abs(malaA-malaC))) &&
                ((malaC<malaA+malaB)&&(malaC>Math.abs(malaA-malaB)))
        );
    }
    public boolean vaiTristurisVienadmalu(){
        return (malaA == malaB && malaA == malaC && malaB == malaC);
    }
    public boolean vaiTristurisVienadsanu(){
        return (malaA == malaB || malaA == malaC || malaB == malaC);
    }
}
