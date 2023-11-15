package WOtraining;

import java.util.Arrays;

public class AccountTest {

    public static void main(String[] arg){
/*
        Account artosAccount = new Account("Arto's account", 100);
        Account artosSwissAccount = new Account("Arto's account in Switzerland", 1000000);

        System.out.println("Initial state");
        System.out.println(artosAccount.toString());
        System.out.println(artosSwissAccount.toString());

        artosAccount.withdraw(20);
        artosSwissAccount.deposit(200);

        System.out.println("End state");
        System.out.println(artosAccount.toString());
        System.out.println(artosSwissAccount.toString());

         ---------------------------------------------------------- */

        Account myAccount = new Account("My account", 0);
        Account mattAccount = new Account("Matthews account", 1000);

        System.out.println("b4");
        System.out.println(myAccount.toString());
        System.out.println(mattAccount.toString());

        mattAccount.sendMoney(myAccount, 100);

        System.out.println("now");
        System.out.println(myAccount.toString());
        System.out.println(mattAccount.toString());
    }
}
