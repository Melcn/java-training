package MOOCFI2.Part9.Interfaces.TacoBoxes;

public class Custom {
    private int tacos;

    public Custom(int tacos) {
        this.tacos = tacos;
    }

    public int tacosRemaining() {
        return this.tacos;
    }

    public void eat() {
        if (this.tacos > 0) {
            this.tacos--;
        }
    }
}
