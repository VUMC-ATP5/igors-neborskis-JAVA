package lekcijaPieci.majasDarbs.oop_homework;

public class Customer extends Visit {

    String name;
    Boolean member;
    static String memberType;

    // konstruktors Customer
    public Customer(String name, Boolean member, String memberType) {
        super();
        this.name = name;
        this.member = member;
        this.memberType = memberType;
//        this.date = date;
//        this.serviceExpense = serviceExpense;
//        this.productExpense = productExpense;
    }

    @Override
    public String toString() {
        return "\n\nCustomer{" +
                "name='" + name + '\'' +
                ", member=" + member +
                ", memberType='" + memberType + '\'' +
                '}';
    }

    // getters & setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getMember() {
        return member;
    }

    public void setMember(Boolean member) {
        this.member = member;
    }

    public static String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }

    public void prepareCheck(){
        if (member == true && memberType.equals("SILVER")){
            silverMemberCheck();
        } else if (member == true && memberType.equals("GOLD")) {
            goldMemberCheck();
        } else if (member == true && memberType.equals("PREMIUM")) {
            premiumMemberCheck();
        } else {
            noMemberCheck();
        }
    }
}
