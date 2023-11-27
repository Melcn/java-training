package MOOCFI2.Part5.ObjectsAndReferences;

import MOOCFI2.Person;

public class HealthStation {
    private int count;

    public HealthStation() {
        this.count = 0;
    }

    public int weigh(Person person) {
        count++;
        return person.getWeight();
    }

    public void feed(Person person) {
        int nw = person.getWeight() + 1;
        person.setWeight(nw);

    }

    public int weighings() {
        return this.count;
    }

}
