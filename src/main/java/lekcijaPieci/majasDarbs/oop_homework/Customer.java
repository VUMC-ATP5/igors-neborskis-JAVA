package lekcijaPieci.majasDarbs.oop_homework;

public class Customer {
    String name;
    Boolean member;
    String memberType;

    // konstruktors Customer
    public Customer(String name, Boolean member, String memberType) {
        this.name = name;
        this.member = member;
        this.memberType = memberType;
    }

    @Override
    public String toString() {
        return "Customer{" +
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

    public String getMemberType() {
        return memberType;
    }

    public void setMemberType(String memberType) {
        this.memberType = memberType;
    }


}
