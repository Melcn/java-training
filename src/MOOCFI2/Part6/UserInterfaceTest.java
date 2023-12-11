package MOOCFI2.Part6;

import java.util.Scanner;

public class UserInterfaceTest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        WordSet set = new WordSet();

        UserInterface userInterface = new UserInterface(set, scanner);
        userInterface.start();
    }
}
