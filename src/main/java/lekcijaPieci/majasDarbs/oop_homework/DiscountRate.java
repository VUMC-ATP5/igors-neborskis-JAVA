package lekcijaPieci.majasDarbs.oop_homework;

public class DiscountRate extends Customer {
    double serviceDiscountPremium = 0.2;
    double serviceDiscountGold = 0.15;
    double serviceDiscountSilver = 0.1;
    double productDiscountPremium = 0.1;
    double productDiscountGold = 0.1;
    double productDiscountSilver = 0.1;

    public DiscountRate(String name, Boolean member, String memberType) {
        super(name, member, memberType);
    }


}
