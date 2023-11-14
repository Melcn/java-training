package WOtraining;

public class Account {

    private String name;
    private double balance;

    public Account(){

    }
    public Account(String name, double balance){

        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double withdraw(int nb){
        double balance = this.balance - nb;
        return balance;
    }

    public double deposit(int nb){
        double balance = this.balance + nb;
        return balance;
    }
    @Override
    public String toString() {
        return  name + '\''
                 + balance;
    }
}
