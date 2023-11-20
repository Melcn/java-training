package WOtraining;

import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {
        Person paul = new Person("Paul", 24, 184, 70);
        Person joan = new Person("Joan Ball");
        System.out.println(paul);

        paul.growOlder();
        System.out.println(paul);

        paul.growOlder(10);
        System.out.println(paul);
    }
}
