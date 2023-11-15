package easy.quick;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class FeuEnumType {

    static BufferedReader keyboard = new BufferedReader( new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {

        Feu feu = Feu.VERT;

        System.out.println("Que voulez vous faire? (passer ou attendre)");
        String action = keyboard.readLine();

        if(action.equals("passer")) {
            if (feu != Feu.VERT) {
                System.out.println("Vous ne pouvez pas passer");
            }else{
                System.out.println("Bonne route!");
            }
        } else if (action.equals("attendre")){
            if(feu == feu.VERT) {
                System.out.println("Vous devez passer, c'est vert!");
            }else{
                System.out.println("Bonne initiative");
            }
        } else{
            System.out.println("commande inconnue");
        }

    }
}
