package lekcijaPieci.labDarbs;

import java.util.Random;

public class Person {
    private long personasKods;
    private String vards;
    private String uzvards;
    private int vecums;

    public Person (String vards, String uzvards){
        this.vards = vards;
        this.uzvards = uzvards;
        this.vecums = 0;
        this.personasKods = generatePersonasKods();
    }

    // getters
    private long generatePersonasKods(){
        return (long) (Math.random()*Math.pow(10,10));
    }

    public long getPersonasKods() {
        return personasKods;
    }

    public String getVards() {
        return vards;
    }

    public String getUzvards() {
        return uzvards;
    }

    public int getVecums() {
        return vecums;
    }

    // setters

    public void setVards(String vards) {
        this.vards = vards;
    }

    public void setUzvards(String uzvards) {
        this.uzvards = uzvards;
    }

    public void setVecums(int vecums) {
        this.vecums = vecums;
    }
}
