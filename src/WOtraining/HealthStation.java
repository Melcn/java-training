package WOtraining;

public class HealthStation {
    private int count;

    public HealthStation() {

    }

    public int weigh(Person person) {

        return person.getWeight();
    }

    public void feed(Person person) {
        int nw = person.getWeight() + 1;
        person.setWeight(nw);

    }

    public int weighings() {
        return 0;
    }

}
