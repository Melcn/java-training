package WOtraining;

public class PaymentTerminal {

    private double money;
    private int affordableMeals;

    private int heartyMeals;

    public PaymentTerminal() {
        this.money = 1000;

    }

    public double eatAffordably(double payment) {
        if (payment >= 2.5) {
            this.money = this.money + 2.5;
            affordableMeals++;
            return payment - 2.5;
        } else {
            return payment;
        }


    }

    public double eatHeartily(double payment) {
        if (payment >= 4.3) {
            this.money = this.money + 4.3;
            heartyMeals++;
            return payment - 4.3;
        } else {
            return payment;
        }
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
