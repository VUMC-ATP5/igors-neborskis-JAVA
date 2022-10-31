package lekcijaPieci.majasDarbs.oop_homework;

import java.util.Date;

public class Visit extends Customer {
    Date date;
    double serviceExpense;
    double productExpense;

    public Visit(String name, Boolean member, String memberType) {
        super(name, member, memberType);
    }

}
