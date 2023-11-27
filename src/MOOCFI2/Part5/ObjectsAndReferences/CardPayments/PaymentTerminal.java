package MOOCFI2.Part5.ObjectsAndReferences.CardPayments;

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

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.5) {
            card.takeMoney(2.5);
            affordableMeals++;
            return true;
        } else {
            return false;
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

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.5) {
            card.takeMoney(4.5);
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        this.money = this.money + sum;
        card.addMoney(sum);
    }

    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
