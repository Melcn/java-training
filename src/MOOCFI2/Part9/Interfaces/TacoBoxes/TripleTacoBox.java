package MOOCFI2.Part9.Interfaces.TacoBoxes;

public class TripleTacoBox implements TacoBox {
    private int tacos;

    public TripleTacoBox() {
        this.tacos = 3;
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
