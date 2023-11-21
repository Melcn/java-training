package WOtraining;

import java.util.ArrayList;

public class BirdTest {

    public static void main(String[] args) {

        ArrayList<Bird> birds = new ArrayList<>();
        Bird red = new Bird("Red");
        System.out.println(red);

        Bird chuck = new Bird("Chuck");
        System.out.println(chuck);

        if (red.equals(chuck)) {
            System.out.println(red + " equals " + chuck);
        }
    }
}
