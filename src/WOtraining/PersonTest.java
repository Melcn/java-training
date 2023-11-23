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

        System.out.println("weighings performed: " + childrensHospital.weighings());
        SimpleDate date = new SimpleDate(1, 1, 780);
        Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", date);
        Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

        System.out.println(muhammad);
        System.out.println(pascal);

        Person muhammad = new Person("Muhammad ibn Musa al-Khwarizmi", 1, 1, 780);
        Person pascal = new Person("Blaise Pascal", 19, 6, 1623);

        if (muhammad.olderThan(pascal)) {  //  same as muhammad.olderThan(pascal)==true
            System.out.println(muhammad.getName() + " is older than " + pascal.getName());
        } else {
            System.out.println(muhammad.getName() + " is not older than " + pascal.getName());
        }

        SimpleDate d1 = new SimpleDate(14, 2, 2011);
        SimpleDate d2 = new SimpleDate(21, 2, 2011);
        SimpleDate d3 = new SimpleDate(1, 3, 2011);
        SimpleDate d4 = new SimpleDate(31, 12, 2010);

        System.out.println(d1 + " is earlier than " + d2 + ": " + d1.before(d2));
        System.out.println(d2 + " is earlier than " + d1 + ": " + d2.before(d1));

        System.out.println(d2 + " is earlier than " + d3 + ": " + d2.before(d3));
        System.out.println(d3 + " is earlier than " + d2 + ": " + d3.before(d2));

        System.out.println(d4 + " is earlier than " + d1 + ": " + d4.before(d1));
        System.out.println(d1 + " is earlier than " + d4 + ": " + d1.before(d4));

        SimpleDate date = new SimpleDate(24, 3, 2017);
        SimpleDate date2 = new SimpleDate(23, 7, 2017);

        Person leo = new Person("Leo", date, 62, 9);
        Person lily = new Person("Lily", date2, 65, 8);

        if (leo.equals(lily)) {
            System.out.println("Is this quite correct?");
        }

        Person leoWithDifferentWeight = new Person("Leo", date, 62, 10);

        if (leo.equals(leoWithDifferentWeight)) {
            System.out.println("Is this quite correct?");

        }
        */
        Room room = new Room();
        System.out.println("Empty room? " + room.isEmpty());
        room.add(new Person("Lea", 183));
        room.add(new Person("Kenya", 182));
        room.add(new Person("Auli", 186));
        room.add(new Person("Nina", 172));
        room.add(new Person("Terhi", 185));
        System.out.println("Empty room? " + room.isEmpty());

        System.out.println("");
        for (Person person : room.getPeople()) {
            System.out.println(person);
        }
    }
}
