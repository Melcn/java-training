package WOtraining;

import java.util.Arrays;

public class AccountTest {

    public static void main(String[] arg){

        Account artosAccount = new Account("Arto's account", 100.00);
        Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000.00);

        System.out.println("Initial state");
        System.out.println(artosAccount.toString());
        System.out.println(artosSwissAccount.toString());

        artosAccount.withdraw(20);
        artosSwissAccount.deposit(200);

        System.out.println("End state");
        System.out.println(artosAccount);
        System.out.println(artosSwissAccount);
    }
}
