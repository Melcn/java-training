package MOOCFI2;

public class Debt {

    private double initialBalance;
    private double initialInterestRate;

    public Debt(double initialBalance, double initialInterestRate) {
        this.initialBalance = initialBalance;
        this.initialInterestRate = initialInterestRate;
    }

    public double getInitialBalance() {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) {
        this.initialBalance = initialBalance;
    }

    public double getInitialInterestRate() {
        return initialInterestRate;
    }

    public void setInitialInterestRate(double initialInterestRate) {
        this.initialInterestRate = initialInterestRate;
    }

    public void printBalance() {
        System.out.println(this.initialBalance + " " + this.initialInterestRate);

    }

    public void waitOneYear() {
        this.initialBalance = initialBalance * initialInterestRate;
    }
}
