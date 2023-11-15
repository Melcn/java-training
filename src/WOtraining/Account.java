package WOtraining;

public class Account {

    private String name;
    private Integer balance;

    public Account(){

    }
    public Account(String name, Integer balance){

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

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public void withdraw(Integer nb){
        balance = balance - nb;
    }

    public void deposit(Integer nb){
        balance = balance + nb;
    }
    @Override
    public String toString() {
        return  name + '\''
                 + balance;
    }
}
