package WOtraining.Part11;

public class Airport {
    private String id;

    public Airport(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return this.id;
    }
}
