package WOtraining;

public class Counter {

    private int startValue;

    public Counter(int startValue) {
        this.startValue = startValue;
    }

    public Counter() {
        this.startValue = 0;
    }

    public int value() {
        return startValue;
    }

    public void increase() {
        startValue++;
    }

    public void decrease() {
        startValue--;
    }

    @Override
    public String toString() {
        return "Value : " + startValue;
    }
}
