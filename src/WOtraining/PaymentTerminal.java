package WOtraining;

public class PaymentTerminal {

    private double money;
    private int affordableMeals;

    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;
    }

    public double eatAffordably(double payment) {
        return 0.0;
    }

    public double eatHeartily(double payment) {
        return 0.0;
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
