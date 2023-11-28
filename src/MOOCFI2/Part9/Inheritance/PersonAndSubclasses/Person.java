package MOOCFI2.Part9.Inheritance.PersonAndSubclasses;

import java.util.ArrayList;

public class Person {

    private String name;
    private String adress;

    public Person(String name, String adress) {
        this.name = name;
        this.adress = adress;
    }


    public String getName() {
        return name;
    }

    public String getAdress() {
        return adress;
    }

    @Override
    public String toString() {
        return this.getName() + " " + this.getAdress();
    }
}
