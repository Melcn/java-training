package WOtraining;

public class HealthStation {

    public HealthStation() {

    }

    public int weigh(Person person) {

        return person.getWeight();
    }

    public void feed(Person person) {
        person.setWeight(+1);

    }


}
