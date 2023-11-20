package WOtraining;

import java.util.Scanner;

public class PersonTest {

    public static void main(String[] args) {
       /* Person paul = new Person("Paul", 24, 184, 70);
        Person joan = new Person("Joan Ball");

        System.out.println(paul);

        paul.growOlder();
        System.out.println(paul);

        paul = null;

        paul.growOlder(10);
        System.out.println(paul);*/

        HealthStation childrensHospital = new HealthStation();

        Person ethan = new Person("Ethan", 1, 110, 7);
        Person peter = new Person("Peter", 33, 176, 85);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(peter);

        System.out.println("weighings performed: " + childrensHospital.weighings());

        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);
        childrensHospital.weigh(ethan);

        System.out.println("weighings performed: " + childrensHospital.weighings());
    }
}
