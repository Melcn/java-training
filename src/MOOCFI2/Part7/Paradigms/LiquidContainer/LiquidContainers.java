package MOOCFI2.Part7.Paradigms.LiquidContainer;

import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Container firstContainer = new Container();
        Container secondContainer = new Container();

        LiquidUserInterface userInterface = new LiquidUserInterface(firstContainer, secondContainer, scanner);
        userInterface.start();

    }
}
