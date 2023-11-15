package easy.quick;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FeuEnumType {

    static BufferedReader keyboard = new BufferedReader( new InputStreamReader(System.in))
    public static void main(String[] args) throws Exception {

        Feu feu = Feu.VERT;

        System.out.println("Que voulez vous faire? ");
        String action = keyboard.readLine();
    }
}
