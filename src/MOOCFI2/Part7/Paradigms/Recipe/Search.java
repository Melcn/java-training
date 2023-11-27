package MOOCFI2.Part7.Paradigms.Recipe;

import java.util.Scanner;

public class Search {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("File to read: ");

        UI ui = new UI(scanner);
        ui.start();

    }
}
