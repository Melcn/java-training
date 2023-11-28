package MOOCFI2.Part9.Inheritance.PersonAndSubclasses;

public class Main {
    public static void main(String[] args) {
        Person ada = new Person("Ada Lovelace", "24 Maddox St. London W1S 2QN");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie 15 00100 Helsinki");
        System.out.println(ada);
        System.out.println(esko);

        System.out.println("  ");
        System.out.println(" ******************************************* ");
        System.out.println("  ");

        Student ollie = new Student("Ollie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(ollie);
        System.out.println("Study credits " + ollie.credits());
        ollie.study();
        System.out.println("Study credits " + ollie.credits());

        System.out.println("  ");
        System.out.println(" ******************************************* ");
        System.out.println("  ");

        Student allie = new Student("Allie", "6381 Hollywood Blvd. Los Angeles 90028");
        System.out.println(allie);
        allie.study();
        System.out.println(allie);

        System.out.println("  ");
        System.out.println(" ******************************************* ");
        System.out.println("  ");

        Teacher adaa = new Teacher("Adaa Lovelace", "24 Maddox St. London W1S 2QN", 1200);
        Teacher eesko = new Teacher("Eesko Ukkonen", "Mannerheimintie 15 00100 Helsinki", 5400);
        System.out.println(adaa);
        System.out.println(eesko);

        System.out.println("  ");
        System.out.println(" ******************************************* ");
        System.out.println("  ");
        
        Student olllie = new Student("Olllie", "6381 Hollywood Blvd. Los Angeles 90028");

        int i = 0;
        while (i < 25) {
            olllie.study();
            i = i + 1;
        }
        System.out.println(olllie);
    }
}
