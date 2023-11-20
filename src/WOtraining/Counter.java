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

    public void increase(int increaseBy) {
        this.startValue = +increaseBy;
    }

    public void decrease() {
        startValue--;
    }

    public void decrease(int decreaseBy) {
        this.startValue = +decreaseBy;
    }

    @Override
    public String toString() {
        return "Value : " + startValue;
    }
}
