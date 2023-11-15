package easy.quick;

import java.util.Scanner;

public class password {

    public static void main(String[] argv){

        Scanner sc = new Scanner(System.in);

        String pass = "Draconis";
        System.out.println("Password please: ");
        String asw = sc.next();

        if (asw.equals(pass)){
            System.out.println("Welcome");
        }else {
            System.out.println("Let's go!");
        }
    }
}
