package WOtraining;

import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("What's your name?");
        String name = reader.nextLine();
        System.out.println("What's your age?");
        int age = Integer.valueOf(reader.nextLine());
        System.out.println("What's your weight?");
        double weight = Double.valueOf(reader.nextLine());
        System.out.println("What's your height?");
        double height = Double.valueOf(reader.nextLine());

        Person person = new Person(name, age);
        System.out.println(person);
    }
}
