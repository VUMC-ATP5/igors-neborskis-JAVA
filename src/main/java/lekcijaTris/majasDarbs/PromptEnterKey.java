package lekcijaTris.majasDarbs;

import java.io.IOException;

public class PromptEnterKey {
    public static void promptEnterKey(){
        System.out.println("\n--- Lai turpinātu nospied \"ENTER\" ---");
        try {
            int read = System.in.read(new byte[1]);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
