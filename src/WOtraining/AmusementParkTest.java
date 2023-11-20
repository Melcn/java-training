package WOtraining;

public class AmusementParkTest {
    public static void main(String[] argv) {
        Person matt = new Person("Matt");
        matt.setWeight(86);
        matt.setHeight(180);

        Person jasper = new Person("Jasper");
        jasper.setWeight(34);
        jasper.setHeight(132);

        AmusementParkRide waterTrack = new AmusementParkRide("Water track", 140);
    }
}
