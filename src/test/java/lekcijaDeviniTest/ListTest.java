package lekcijaDeviniTest;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    @Test
    public void showList(){
        List<String> auto = new ArrayList<>();
        auto.add("Mercedes");
        auto.add("Opel");
        auto.add("BMW");
        System.out.println("izmers ir: " + auto.size());

        for (int i = 0; i<auto.size();i++) {
            System.out.println(auto.get(i));
        }

        System.out.println(" ");
        auto.add(1,"Lada");

        for (int i = 0; i<auto.size();i++) {
            System.out.println(auto.get(i));
        }

        System.out.println(" ");
        System.out.println(auto.toString());
    }
}
