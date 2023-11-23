package WOtraining;

import java.util.ArrayList;

public class Room {

    private ArrayList<Person> people = new ArrayList<>();

    public Room() {

    }

    public void add(Person person) {
        //ajouter la personne passée en paramètre à la liste.
    }

    public boolean isEmpty() {
        //indique si la pièce est vide ou non
        return true;
    }

    public ArrayList<Person> getPeople() {
        return people;
    }
}
