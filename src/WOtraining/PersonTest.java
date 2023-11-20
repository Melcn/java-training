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
        System.out.println(paul);

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

        System.out.println("weighings performed: " + childrensHospital.weighings());*/
        SimpleDate date = new SimpleDate(1, 1, 780);
        Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", date);
        Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

        System.out.println(muhammad);
        System.out.println(pascal);

    }
}
