package WOtraining;

import java.util.ArrayList;

public class Room {

    private ArrayList<Person> people = new ArrayList<>();

    public Room() {

    }

    public void add(Person person) {
        for (Person p : people
        ) {
            if (!p.equals(person)) {
                people.add(person);
            }
        }
    }

    public boolean isEmpty() {
        if (!people.equals(null)) {
            return true;
        } else {
            return false;
        }

    }

    public ArrayList<Person> getPeople() {
        return people;
    }
}
